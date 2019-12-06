using ILfQ.Definitions.BaseTypes;
using ILfQ.Definitions.Enumerated;

namespace ILfQ.Definitions.SimpleTypes
{
    public class LeafNode : BaseNode
    {
        public object Value { get; private set; }
        public LeafNode(object value, NType ntype) 
            : base(ntype)
        {
            Value = value;
        }
    }
}
