using ILfQ.Definitions.Enumerated;

namespace ILfQ.Definitions.BaseTypes
{
    public abstract class BaseNode
    {
        public NType NType { get; private set; }

        protected  BaseNode(NType ntype)
        {
            NType = ntype;
        }
    }
}
