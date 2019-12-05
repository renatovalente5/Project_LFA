// Generated from SourceLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.io.File;
import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

/**
 * This class provides an empty implementation of {@link SourceLanguageVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <Object> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class Interpretador extends SourceLanguageBaseVisitor<Object>{

	Map<String, Var> symb = new HashMap<>();
	static boolean debugOn = false;
	
	@Override public Object visitMain(SourceLanguageParser.MainContext ctx) {  
		
		/*
		ST imp = new ST ("import <class1>; \n import <class2>; \n");
		
		ST suportClassInit = new ST ("<class1> <name> = new <class1>();");
		ST mainOpen = new ST ("public void public static void main(String[] args) {");
		
		System.out.println(imp.render());
		System.out.println(suportClassInit.render());
		System.out.println(mainOpen.render());
		*/
		
		//ST l4 = new ST ();
		
		return visitChildren(ctx);  
	}
	
	@Override public Object visitInstruction(SourceLanguageParser.InstructionContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Object visitIntegerType(SourceLanguageParser.IntegerTypeContext ctx) { 
		
		//string templates
		ST line  = new ST("symb.put(\"<key>\", new Var(\"<Type>\", <Num>))");
		
		//line 0
		String name = ctx.VARNAME().getText();
		line.add("key", name);
		line.add("Type", "Integer");
		line.add("Num","0");
		
		//print
		//System.out.print(line.render());
		
		symb.put(name, new Var("Integer", 0));
		return name; 
	}
	
	



	@Override public Object visitDoubleType(SourceLanguageParser.DoubleTypeContext ctx) { 
				
		//line 0
		String name = ctx.VARNAME().getText();
				
		symb.put(name, new Var("Double", 0));
		return name; 
	}
	
	@Override public Object visitNewType(SourceLanguageParser.NewTypeContext ctx) { 
		
		//line 0
		String name = ctx.VARNAME().getText();
		String tipovar = ctx.TYPENAME().getText();
		
		if (ListTipo.containsTipo(tipovar)) {
			symb.put(name, new Var(tipovar, 0));
		}else{
			System.err.println("Tipo não definido");
			System.exit(1);
		}
		
		return name; 
	}

	@Override public Object visitAssignDeclaration(SourceLanguageParser.AssignDeclarationContext ctx) { 

		String key = (String)visit(ctx.declaration());
		Var var;
		String val = "";
		

		//System.out.print(";\n");

		if(!symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
			System.exit(2);

		}else{
			var = symb.get(key);
			Var var2 = (Var) visit(ctx.expression());

			val = var2.getVal() + "";

			String type = var.getType();


			//If Expression Is a Variable
			if (var.getType().equals(var2.getType())) {
				var.setVal(var2.getVal());
			} else if (!symb.containsValue(var2) && !var.getType().equals("Integer")){
				var.setVal(var2.getVal());
			}else{
				System.err.println("Variaveis incompativeis");
				System.exit(3);
			}
			
			//putvar
			symb.put(key, var);
		}
		//visitChildren(ctx);
		return "";
		
	}
	
	
	@Override public Object visitAssignVariable(SourceLanguageParser.AssignVariableContext ctx) { 
		String key = ctx.VARNAME().getText();
		Var var;

		if(!symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
			System.exit(2);
		}else{
			var = symb.get(key);

			Var var2 = (Var) visit(ctx.expression());

			String val = var2.getVal() + "";

			String type = var.getType();

			//If Expression Is a Variable
			if (var.getType().equals(var2.getType())) {
				var.setVal(var2.getVal());
			} else if (!symb.containsValue(var2) && !var.getType().equals("Integer")){
				var.setVal(var2.getVal());
			}else{
				System.err.println("Variaveis incompativeis");
				System.exit(3);
			}
			
			//putvar
			symb.put(key, var);
		}
		//visitChildren(ctx);
		return ""; 
	}
	
	@Override public Object visitPrintExpression(SourceLanguageParser.PrintExpressionContext ctx) { 
		
		Var key = (Var) visit(ctx.expression());//

		
		//debug result
		//System.out.println(key.getVal());
		
		return ""; 
	}
	
	@Override public Object visitExpressionDouble(SourceLanguageParser.ExpressionDoubleContext ctx) { 
		String real = ctx.DOUBLE().getText();

		double val = 0;

		try{ val = Double.parseDouble(real); } catch(NumberFormatException e) { 
			System.err.println("Error: Vairable must be Type Double");
			System.exit(4);
		}

		//output.add("Int", inteiro);
		return new Var("Double", val); 
	}
	
	@Override public Object visitExpressionMulDiv(SourceLanguageParser.ExpressionMulDivContext ctx) { 
		Var e1 = (Var) visit(ctx.e1);
		//System.out.print(ctx.op.getText());
		Var e2 = (Var) visit(ctx.e2);
		
		Var ans = null;

		if (ctx.op.getText().equals("*")) {
			ans = Counts.mult(e1, e2);
		} else {
			ans = Counts.div(e1, e2);
		}
	
		return ans;
	}
	
	@Override public Object visitExpressionSignal(SourceLanguageParser.ExpressionSignalContext ctx) { 
		//ST output = new ST("<Sinal>");

		Var v = (Var)visit(ctx.expression());
		

		if ((ctx.op.getText()).equals("+")) {
			return v;
		}else{
			return new Var(v.getType(), -v.getVal(), v.getNumDen());
		}
		//output.add("Sinal", sinal);

		//System.out.println(output.render());
		
		//System.out.println(ctx.expression());
		
	}

	@Override public Object visitExpressionAssociation(SourceLanguageParser.ExpressionAssociationContext ctx) { 
		//ST output = new ST("<Sinal>");

		Var v = (Var)visit(ctx.expression());
		

		return v;
		//output.add("Sinal", sinal);

		//System.out.println(output.render());
		
		//System.out.println(ctx.expression());
		
	}
	
	
	@Override public Object visitExpressionInteger(SourceLanguageParser.ExpressionIntegerContext ctx) { 

		String inteiro = ctx.INTEGER().getText();
		double val = 0;
		try{ val = Integer.parseInt(inteiro); } catch(NumberFormatException e) { 
			System.err.println("Error: Vairable must be Type Integer");
			System.exit(4);
		}

		return new Var("Integer", val); 
	}
	
	@Override public Object visitExpressionVariable(SourceLanguageParser.ExpressionVariableContext ctx) {
		if (!symb.containsKey(ctx.VARNAME().getText())) {
			System.err.println("Variavel não inicializada");
			System.exit(6);
		}
		
		return symb.get(ctx.VARNAME().getText()); 
	}
	
	@Override public Object visitExpressionAddSub(SourceLanguageParser.ExpressionAddSubContext ctx) { 
		//ST //varCriation1, //varCriation2;
		
	//inicilizacion
		Var e1 = ((Var) visit(ctx.e1));
		//System.out.print(ctx.op.getText());
		Var e2 = (Var) visit(ctx.e2);
		Var ans = null;

		if (e1.getType().equals(e2.getType())) {
			if (ctx.op.getText().equals("+")) {
				ans = Counts.add(e1,e2);
			} else {
				ans = Counts.sub(e1,e2);
			}
		}else{
			String s = "ERROR: Diferents types of variables!";
			System.err.println(s);
			System.exit(1);
		}

		return ans;
	}
}