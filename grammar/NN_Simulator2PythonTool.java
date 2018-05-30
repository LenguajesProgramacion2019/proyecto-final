/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class NN_Simulator2PythonTool {
    public static void main(String[] args) throws Exception {
        String inputFile = "test.txt";
        if ( args.length > 0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        NN_SimulatorLexer lexer = new NN_SimulatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NN_SimulatorParser parser = new NN_SimulatorParser(tokens);
        ParseTree tree = parser.main_program(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        NN_Simulator2PythonListener extractor = new NN_Simulator2PythonListener(parser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}