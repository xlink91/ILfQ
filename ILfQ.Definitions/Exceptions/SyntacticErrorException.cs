using System;

namespace ILfQ.Definitions.Exceptions
{
    public class SyntacticErrorException : Exception
    {
        public int SyntacticErrors { get; private set; }

        public SyntacticErrorException(int syntacticErrors)
            : base($"The code contains {syntacticErrors} syntactic errors.")
        {
            SyntacticErrors = syntacticErrors;
        }
    }
}
