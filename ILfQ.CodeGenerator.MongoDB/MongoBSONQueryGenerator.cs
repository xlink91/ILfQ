using ILfQ.Definitions.BaseTypes;
using ILfQ.Definitions.SimpleTypes;
using MongoDB.Bson;
using MongoDB.Driver;
using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text.RegularExpressions;

namespace ILfQ.CodeGenerator.MongoDB
{
    public class MongoBSONQueryGenerator
    {
        protected BaseNode Root { get; set; }

        public MongoBSONQueryGenerator(BaseNode root)
        {
            Root = root;
        }

        public FilterDefinition<BsonDocument> BuildFilter()
        {
            return __BuildFilter(Root, default);
        }

        private FilterDefinition<BsonDocument> __BuildFilter(BaseNode node, object parentValue)
        {
            if (node == default)
                return default;
            
            switch (node.NType)
            {
                #region comparison_operators
                case Definitions.Enumerated.NType.EQ:
                    return Builders<BsonDocument>.Filter.Eq(parentValue.ToString(), ToBsonValue((node as IntermediateNode)[0]));
                case Definitions.Enumerated.NType.GT:
                    return Builders<BsonDocument>.Filter.Gt(parentValue.ToString(), ToBsonValue((node as IntermediateNode)[0]));
                case Definitions.Enumerated.NType.GTE:
                    return Builders<BsonDocument>.Filter.Gte(parentValue.ToString(), ToBsonValue((node as IntermediateNode)[0]));
                case Definitions.Enumerated.NType.IN:
                    return Builders<BsonDocument>
                        .Filter
                        .In(parentValue.ToString(), BsonArray.Create(Enumerable.Range(0, (node as IntermediateNode).TotalChilds)
                        .Select(x => ToBsonValue((node as IntermediateNode)[x]))).ToArray());
                case Definitions.Enumerated.NType.LT:
                    return Builders<BsonDocument>.Filter.Lt(parentValue.ToString(), ToBsonValue((node as IntermediateNode)[0]));
                case Definitions.Enumerated.NType.LTE:
                    return Builders<BsonDocument>.Filter.Lte(parentValue.ToString(), ToBsonValue((node as IntermediateNode)[0]));
                case Definitions.Enumerated.NType.NE:
                    return Builders<BsonDocument>.Filter.Ne(parentValue.ToString(), ToBsonValue((node as IntermediateNode)[0]));
                case Definitions.Enumerated.NType.NIN:
                    return Builders<BsonDocument>
                        .Filter
                        .Nin(parentValue.ToString(), BsonArray.Create(Enumerable.Range(0, (node as IntermediateNode).TotalChilds)
                        .Select(x => ToBsonValue((node as IntermediateNode)[x]))).ToArray());
                #endregion
                #region logical_operators
                case Definitions.Enumerated.NType.AND:
                    return Builders<BsonDocument>
                        .Filter
                        .And(Enumerable.Range(0, (node as IntermediateNode).TotalChilds)
                        .Select(x => __BuildFilter((node as IntermediateNode)[x], parentValue?.ToString())));
                case Definitions.Enumerated.NType.NOT:
                    throw new NotImplementedException();
                case Definitions.Enumerated.NType.NOR:
                    throw new NotImplementedException();
                case Definitions.Enumerated.NType.OR:
                    return Builders<BsonDocument>
                        .Filter
                        .Or(Enumerable.Range(0, (node as IntermediateNode).TotalChilds)
                        .Select(x => __BuildFilter((node as IntermediateNode)[x], parentValue?.ToString())));
                #endregion
                #region evaluation_operators
                case Definitions.Enumerated.NType.REGEX:
                    return Builders<BsonDocument>
                        .Filter
                        .Regex(parentValue.ToString(), 
                            BsonRegularExpression.Create(RemoveQuotes((string)((node as IntermediateNode)[0] as LeafNode).Value)));
                #endregion
                #region specific_type
                case Definitions.Enumerated.NType.ID:
                    string idValue = (node as IntermediateNode).Text;
                    return __BuildFilter((node as IntermediateNode)[0], RemoveQuotes(idValue));
                #endregion
                default:
                    throw new NotImplementedException();
            }
        }
       
        protected BsonValue ToBsonValue(BaseNode node)
        {
            LeafNode leafNode = (LeafNode)node;

            switch (leafNode.NType)
            {
                //case Definitions.Enumerated.NType.ARRAY:
                //    return BsonArray.Create(Enumerable.Range(0, (node as IntermediateNode).TotalChilds)
                //        .Select(x => ToBsonValue((node as IntermediateNode)[x])).ToArray());
                case Definitions.Enumerated.NType.OBJECTID:
                    return new BsonObjectId(ObjectId.Parse((string)leafNode.Value));
                case Definitions.Enumerated.NType.DATE:
                    string stringDate = (string)(node as LeafNode).Value;

                    if (stringDate.Length < 27)
                        stringDate = stringDate.PadRight(27, '0');

                    DateTime dateTime = DateTime.ParseExact(stringDate, "yyyy-MM-dd HH:mm:ss.fffffff", CultureInfo.InvariantCulture);
                    BsonDateTime bsonDateTime = new BsonDateTime(DateTime.SpecifyKind(dateTime, DateTimeKind.Utc));
                    return bsonDateTime;
                case Definitions.Enumerated.NType.STRING:
                    string stringValue = (string)(node as LeafNode).Value;
                    return BsonString.Create(RemoveQuotes(stringValue));
                case Definitions.Enumerated.NType.INT:
                    return BsonInt32.Create((node as LeafNode).Value);
                case Definitions.Enumerated.NType.LONG:
                    return BsonInt64.Create((node as LeafNode).Value);
                case Definitions.Enumerated.NType.FLOAT:
                    return BsonDouble.Create((node as LeafNode).Value);
                case Definitions.Enumerated.NType.DOUBLE:
                    return BsonDouble.Create((node as LeafNode).Value);
                case Definitions.Enumerated.NType.NULL:
                    return BsonNull.Value;
                case Definitions.Enumerated.NType.BOOL:
                    bool boolValue = (bool)(node as LeafNode).Value;
                    return boolValue ? BsonBoolean.True : BsonBoolean.False;
                default:
                    return default; 
            }
        }

        protected bool IsQuoted(string statement)
            => new Regex("^\".*\"$").Match(statement).Success;

        protected string RemoveQuotes(string quoteStatement)
            => IsQuoted(quoteStatement) 
                ? quoteStatement.Substring(1, quoteStatement.Length - 2) 
                : quoteStatement;
    }
}
