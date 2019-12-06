import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ilqLexer lex = new ilqLexer(new ANTLRFileStream("C:\\Users\\dhalachian\\source\\repos\\ILfQ\\ILfQ.Tools\\GeneratedSources\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ilqParser g = new ilqParser(tokens, 49100, null);
        try {
            g.start_rule();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}