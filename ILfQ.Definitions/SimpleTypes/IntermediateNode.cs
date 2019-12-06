using ILfQ.Definitions.BaseTypes;
using ILfQ.Definitions.Enumerated;
using System.Collections.Generic;

namespace ILfQ.Definitions.SimpleTypes
{
    public class IntermediateNode : BaseNode
    {
        protected IList<BaseNode> Childs { get; }
        public string Text { get; private set; }

        public IntermediateNode(NType ntype, IList<BaseNode> childs, string text)
            : base(ntype)
        {
            Childs = childs;
            Text = text;
        }

        public IntermediateNode(NType ntype, IList<BaseNode> childs)
            : this(ntype, childs, default)
        {

        }

        public int TotalChilds 
        {
            get
            {
                return Childs.Count;
            }
        }

        public BaseNode this[int i]
        {
            get
            {
                return Childs[i];
            }
        }
    }
}
