using ILfQ.Definitions.BaseTypes;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MongoDB.Bson;
using MongoDB.Bson.Serialization;
using MongoDB.Driver;
using System;
using System.IO;

namespace ILfQ.CodeGenerator.MongoDB.Tests
{
    [TestClass()]
    public class MongoBSONQueryGeneratorTests
    {
        [TestMethod()]
        public void BuildFilterTest_Query0()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "script0.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"itd_communicationType\" : { \"$lte\" : 1 }, \"itd_ip\" : { \"$ne\" : null }, \"itd_port\" : { \"$ne\" : null }, \"itd_isPinpad\" : true, \"installationDate\" : ISODate(\"2019-10-04T03:00:00Z\") }";

            Assert.AreEqual(expected, query);
        }

        [TestMethod()]
        public void BuildFilterTest_Query1()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "script1.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"installationDate\" : { \"$gte\" : ISODate(\"2018-01-29T21:18:20.553Z\"), \"$lte\" : ISODate(\"2019-10-04T03:00:00Z\") } }";

            Assert.AreEqual(expected, query);
        }

        [TestMethod()]
        public void BuildFilterTest_InOp()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "in_op.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"_id\" : { \"$in\" : [\"12345679\", \"20006241\", \"20007346\"] } }";

            Assert.AreEqual(expected, query);
        }

        [TestMethod()]
        public void BuildFilterTest_Quoted_Id()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "quoted_id.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"_id\" : { \"$in\" : [\"12345679\", \"20006241\", \"20007346\"] } }";

            Assert.AreEqual(expected, query);
        }

        [TestMethod()]
        public void BuildFilterTest_Nested_Id()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "nested_id.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"Poll.GroupAnswers.Name\" : \"Decsicion\" }";

            Assert.AreEqual(expected, query);
        }

        [TestMethod()]
        public void BuildFilterTest_Object_Id()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "ObjectId.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            //IMongoClient client = new MongoClient("mongodb://192.168.250.132:27017");
            //IMongoDatabase db = client.GetDatabase("PosListenerDB");

            //IMongoCollection<BsonDocument> collection = db.GetCollection<BsonDocument>("TerminalPoll");

            //var rs = collection.Find(filter).ToList();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"_id\" : ObjectId(\"5de7e8bada79776220286fb9\") }";

            Assert.AreEqual(expected, query);
        }

        [TestMethod()]
        public void BuildFilterTest_RegexNestedPropertyName()
        {
            string code = File.ReadAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Scripts", "regex.txt"));
            ILfQastBuilder astBuilder = new ILfQastBuilder(code);
            BaseNode astRoot = astBuilder.GetAst();
            MongoBSONQueryGenerator mongoQG = new MongoBSONQueryGenerator(astRoot);
            FilterDefinition<BsonDocument> filter = mongoQG.BuildFilter();

            //IMongoClient client = new MongoClient("mongodb://192.168.250.132:27017");
            //IMongoDatabase db = client.GetDatabase("PosListenerDB");
            //IMongoCollection<BsonDocument> collection = db.GetCollection<BsonDocument>("TerminalPoll");
            //var rs = collection.Find(filter).ToList();

            var serializerRegistry = BsonSerializer.SerializerRegistry;
            var documentSerializer = serializerRegistry.GetSerializer<BsonDocument>();
            string query = filter.Render(documentSerializer, serializerRegistry).ToJson();
            string expected = "{ \"Poll.Question\" : /ue/, \"_id\" : ObjectId(\"5deaa00b118fe938197abb4b\") }";

            Assert.AreEqual(expected, query);
        }
    }
}