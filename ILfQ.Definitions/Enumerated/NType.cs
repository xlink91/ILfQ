namespace ILfQ.Definitions.Enumerated
{
    public enum NType
    {
        #region comparison_operator
        EQ,
        GT,
        GTE,
        IN,
        LT,
        LTE,
        NE,
        NIN,
        #endregion
        #region logical_operator
        AND,
        NOT,
        NOR,
        OR,
        #endregion
        #region evaluation_operator
        REGEX,
        #endregion
        #region types
        OBJECTID,
        ARRAY,
        BOOL,
        DATE,
        ID,
        STRING,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        NULL
        #endregion
    }
}
