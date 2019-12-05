import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import org.stringtemplate.v4.*;

public class SourceLanguageMainInterpretador {
   public static void main(String[] args) throws Exception {
      File f = new File("test.txt");
      Scanner sc = new Scanner(System.in);      // alteirei só para testar manualmente 
      String lineText = null;
      int numLine = 1;
      
      String filename = "Output.java";
      PrintWriter pw = new PrintWriter(new File(filename));

      filename = "DimensionsTable.txt";
      DimensionsParserMain.fillup(filename); 
      ListTipo.writeCSV();
      pw.print(header());

      if (sc.hasNextLine())
         lineText = sc.nextLine();
      SourceLanguageParser parser = new SourceLanguageParser(null);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      Interpretador visitor0 = new Interpretador();
      String fileContent = null;
      
      while(lineText != null) {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromString(lineText + "\n");
         // create a lexer that feeds off of input CharStream:
         SourceLanguageLexer lexer = new SourceLanguageLexer(input);
         lexer.setLine(numLine);
         lexer.setCharPositionInLine(0);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         parser.setInputStream(tokens);
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ST code = (ST)visitor0.visit(tree);
            //pw.print(code.render());
         }
         if (sc.hasNextLine()){
            lineText = sc.nextLine();
            
            //System.out.println("line next = " + lineText);
         }
         else{
            lineText = null;
         }
            
         numLine++;
      }

      pw.print("}\n}");
      pw.close();
      System.out.println(fileContent);
   }

   private static String header (){
      String output = "";
      
      output += "import java.util.*;\n";
      output += "public class Output{\n";
      output += "public static void main(String[] args) throws Exception {\n";
      output += "Map<String, Var> symb = new HashMap<>();\n";
      output += "ListTipo.readCSV(\"listTipoCSV.csv\");";
      
      return output;
   }
}
