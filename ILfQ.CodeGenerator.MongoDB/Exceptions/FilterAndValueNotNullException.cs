using System;

namespace ILfQ.CodeGenerator.MongoDB.Exceptions
{
    public class FilterAndValueNotNullException : Exception
    {
        public FilterAndValueNotNullException()
            : base("FilterDefinition or BsonValue most be not null, not both")
        {

        }
    }
}
