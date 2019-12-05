import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DimensionsParserMain {
   public static void fillup(String entry) throws Exception {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromFileName(entry);
      // create a lexer that feeds off of input CharStream:
      DimensionsParserLexer lexer = new DimensionsParserLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      DimensionsParserParser parser = new DimensionsParserParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at file rule:
      ParseTree tree = parser.file();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         NDPVisitor visitor0 = new NDPVisitor();
         visitor0.visit(tree);
      }
   }
}
