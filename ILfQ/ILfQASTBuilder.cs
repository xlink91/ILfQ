using Antlr.Runtime;
using Antlr.Runtime.Tree;
using ILfQ.Definitions.Exceptions;
using ILfQ.Definitions.SimpleTypes;
using ILfQ.Lexer;
using ILfQ.Parser;
using System;
using System.Linq;
using System.Collections.Generic;
using System.IO;
using System.Text;
using ILfQ.Definitions.BaseTypes;
using System.Text.RegularExpressions;

namespace ILfQ
{
    public class ILfQastBuilder
    {
        protected string Code { get; set; }

        public ILfQastBuilder(string code)
        {
            Code = code;
        }

        public BaseNode GetAst()
        {
            byte[] byteArray = Encoding.UTF8.GetBytes(Code);
            MemoryStream stream = new MemoryStream(byteArray);
            ICharStream inputStream = new ANTLRInputStream(stream);
            ILfQLexer ilfQLexer = new ILfQLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(ilfQLexer);
            ILfQParser ilfqParser = new ILfQParser(commonTokenStream);
            AstParserRuleReturnScope<object, IToken> rawAst = ilfqParser.start_rule();
            if (ilfqParser.NumberOfSyntaxErrors > 0)
                throw new SyntacticErrorException(ilfqParser.NumberOfSyntaxErrors);
            ITree root = (ITree)rawAst.Tree;
            return Visitor(root);
        }

        protected BaseNode Visitor(ITree node)
        {
            if (node == default)
                return default;

            IList<BaseNode> childs = new List<BaseNode>();
            for (int i = 0; i < node.ChildCount; ++i)
                childs.Add(Visitor(node.GetChild(i)));
            
            switch(node.Text)
            {
                #region comparison_operators
                case "$eq":
                    return new IntermediateNode(Definitions.Enumerated.NType.EQ, childs);
                case "$gt":
                    return new IntermediateNode(Definitions.Enumerated.NType.GT, childs);
                case "$gte":
                    return new IntermediateNode(Definitions.Enumerated.NType.GTE, childs);
                case "$in":
                    return new IntermediateNode(Definitions.Enumerated.NType.IN, childs);
                case "$lt":
                    return new IntermediateNode(Definitions.Enumerated.NType.LT, childs);
                case "$lte":
                    return new IntermediateNode(Definitions.Enumerated.NType.LTE, childs);
                case "$ne": 
                    return new IntermediateNode(Definitions.Enumerated.NType.NE, childs);
                case "$nin":
                    return new IntermediateNode(Definitions.Enumerated.NType.NIN, childs);
                #endregion
                #region logical_operators
                case "$and":
                    return new IntermediateNode(Definitions.Enumerated.NType.AND, childs);
                case "$not":
                    return new IntermediateNode(Definitions.Enumerated.NType.NOT, childs);
                case "$nor":
                    return new IntermediateNode(Definitions.Enumerated.NType.NOR, childs);
                case "$or":
                    return new IntermediateNode(Definitions.Enumerated.NType.OR, childs);
                #endregion
                #region evaluation_operators
                case "$regex":
                    return new IntermediateNode(Definitions.Enumerated.NType.REGEX, childs);
                #endregion
                #region specific_types
                case "ISODate":
                    return new LeafNode(RemoveQuotes(node.GetChild(0).Text), Definitions.Enumerated.NType.DATE);
                case "ObjectId":
                    return new LeafNode(RemoveQuotes(node.GetChild(0).Text), Definitions.Enumerated.NType.OBJECTID);
                default:
                    if (node.ChildCount == 1)
                        return new IntermediateNode(Definitions.Enumerated.NType.ID, childs, node.Text);
                    if(IsQuoted(node.Text))
                        return new LeafNode(node.Text, Definitions.Enumerated.NType.STRING);
                    if (node.Text == "null")
                        return new LeafNode(null, Definitions.Enumerated.NType.NULL);
                    if (bool.TryParse(node.Text, out bool boolResult))
                        return new LeafNode(boolResult, Definitions.Enumerated.NType.BOOL);
                    if (int.TryParse(node.Text, out int intResult))
                        return new LeafNode(intResult, Definitions.Enumerated.NType.INT);
                    if (long.TryParse(node.Text, out long longResult))
                        return new LeafNode(longResult, Definitions.Enumerated.NType.LONG);
                    if (double.TryParse(node.Text, out double doubleResult))
                        return new LeafNode(doubleResult, Definitions.Enumerated.NType.DOUBLE);
                    if (float.TryParse(node.Text, out float floatResult))
                        return new LeafNode(floatResult, Definitions.Enumerated.NType.FLOAT);
                    throw new UnrecognizedTypeException(node.Text);
                #endregion
            }
        }

        protected bool IsQuoted(string statement)
            => new Regex("^\".*\"$").Match(statement).Success;
        protected string RemoveQuotes(string quoteStatement)
            => quoteStatement.Substring(1, quoteStatement.Length - 2);
    }
}
