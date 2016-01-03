import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        JavaLexer lex = new JavaLexer(new ANTLRFileStream("/Users/zhengzhedong/Desktop/minijava3/test_file/test.java", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        JavaParser g = new JavaParser(tokens, 49100, null);
        try {
            g.compilationUnit();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}