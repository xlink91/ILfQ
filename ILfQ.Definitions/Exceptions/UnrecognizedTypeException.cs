using System;

namespace ILfQ.Definitions.Exceptions
{
    public class UnrecognizedTypeException : Exception
    {
        public UnrecognizedTypeException(string typeValue)
            : base($"Unrecognized type related to value {typeValue}.")
        {

        }
    }
}
