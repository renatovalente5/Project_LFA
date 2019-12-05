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
		return visitChildren(ctx);  
	}
	
	@Override public Object visitInstruction(SourceLanguageParser.InstructionContext ctx) { 
		return visitChildren(ctx); 
	}
	
	@Override public Object visitIntegerType(SourceLanguageParser.IntegerTypeContext ctx) { 
		Var var;
		String key = ctx.VARNAME().getText();
		
		if(symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
		}else{
			var = new Var("Integer", 0);
			symb.put(key, var);
		}
		return visitChildren(ctx); 
	}

	@Override public Object visitDoubleType(SourceLanguageParser.DoubleTypeContext ctx) { 
		
		Var var;
		String key = ctx.VARNAME().getText();
		
		if(symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
		}else{
			var = new Var("Double", 0);
			symb.put(key, var);
		}
		return visitChildren(ctx); 
	}
	
	@Override public Object visitNewType(SourceLanguageParser.NewTypeContext ctx) { 
		Var var;
		String key = ctx.VARNAME().getText();
		
		if(symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
		}else{
			var = new Var(ctx.TYPENAME().getText(), 0);
			symb.put(key, var);
		}
		return visitChildren(ctx); 
	}

	@Override public Object visitAssignDeclaration(SourceLanguageParser.AssignDeclarationContext ctx) { 

		String key = (String) visit(ctx.declaration());
		Var var;
		String val = "";

		System.out.print(";\n");

		if(!symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
		}else{
			var = symb.get(key);
			val = (String) visit(ctx.expression());


			//If Expression Is a Variable
			if (symb.containsKey(val)) {
				var.setVal(symb.get(val).getVal());
			} else {
				var.setVal(Double.parseDouble(val));
			}
			
			//putvar
			symb.put(key, var);
			System.out.println("TESTE: key: " + key + " ; Val: "+ var.getVal() + " ; Type: " + var.getType()); //depois tirar esta linha
		}
		return visitChildren(ctx);
		
	}
	
	
	@Override public Object visitAssignVariable(SourceLanguageParser.AssignVariableContext ctx) { 
		String key = ctx.VARNAME().getText();
		Var var;

		if(!symb.containsKey(key)){
			System.err.println("ERROR: Variable " + key + " already was defined or bad way to define!");
		}else{
			var = symb.get(key);
			var.setVal(Double.parseDouble((String) visit(ctx.expression())));
			symb.put(key, var);
			System.out.println("TESTE: key: " + key + " ; Val: "+ var.getVal() + " ; Type: " + var.getType()); //depois tirar esta linha
		}
		return visitChildren(ctx); 
	}
	
	@Override public Object visitPrintExpression(SourceLanguageParser.PrintExpressionContext ctx) { 
		
		String key = (String) visit(ctx.expression());
		if(symb.containsKey(key)){
			Var var = symb.get(key);
			System.out.println(var.getVal());
		}else{
			System.out.println(key);
		}
		return visitChildren(ctx); 
	}
	
	@Override public Object visitExpressionDouble(SourceLanguageParser.ExpressionDoubleContext ctx) { 
		return ctx.DOUBLE().getText(); 
	}
	
	@Override public Object visitExpressionMulDiv(SourceLanguageParser.ExpressionMulDivContext ctx) { 
		String e1 = (String) visit(ctx.e1);
		System.out.print(ctx.op.getText());
		String e2 = (String) visit(ctx.e2);
		Double d1, d2 ;
		Var var1 = null, var2=null;

		d1 = 0.0;
		d2 = 0.0;
		if(symb.containsKey(e1)){
			var1 = symb.get(e1);
			d1 = var1.getVal();
		}else{
			d1 = Double.parseDouble(e1);
		}

		if(symb.containsKey(e2)){
			var2 = symb.get(e2);
			d2 = var2.getVal();
		}else{
			d2 = Double.parseDouble(e2);
		}

		Double d3;
		d3 = 0.0;
		String s="error";
		
		if(ctx.op.getText().equals("*")){
			d3 = d1 * d2;
		}else{
			d3 = d1 / d2;
		}

		s = "" + d3;
		
		return s;
	}
	
	@Override public Object visitExpressionSignal(SourceLanguageParser.ExpressionSignalContext ctx) { 
		return ((ctx.op.getText())) + ((String) visit(ctx.expression()));
	}
	
	@Override public Object visitExpressionInteger(SourceLanguageParser.ExpressionIntegerContext ctx) { 
		return ctx.INTEGER().getText(); 
	}
	
	@Override public Object visitExpressionVariable(SourceLanguageParser.ExpressionVariableContext ctx) {
		return ctx.VARNAME().getText(); 
	}
	
	@Override public Object visitExpressionAddSub(SourceLanguageParser.ExpressionAddSubContext ctx) { 
		//ST //varCriation1, //varCriation2;
		
	//inicilizacion
		String e1 = (String) visit(ctx.e1);
		System.out.print(ctx.op.getText());
		String e2 = (String) visit(ctx.e2);
		Double d1 = 0.0 , d2 = 0.0;
		Var var1 = null, var2=null;
		Boolean go1=false, go2=false;

		
	//cheking var1
		if(symb.containsKey(e1)){
			var1 = symb.get(e1);
			d1 = var1.getVal();
			go1 = true;
			
		//StringTemplate
			//varCriation1 = new ST("symb.get(<e1>)");
		}else{
			var1 = new Var("Double", Double.parseDouble(e1));
			//varCriation1 = new ST("new var(\"Double\", <e1>)");
		}

		//varCriation1.add("e1",e1);


	//cheking var2
		if(symb.containsKey(e2)){
			var2 = symb.get(e2);
			d2 = var2.getVal();
			go2 = true;
			//StringTemplate
			//varCriation2 = new ST("<Sinal> symb.get(<e2>)");
		}else{
			var2 = new Var("Double", Double.parseDouble(e2));
			//varCriation2 = new ST("<Sinal> new var(\"Double\", <e2>)");
		}

		//varCriation2.add("e2",e2);
		

		Double d3 = 0.0;
		String s="";
		if(go1==true && go2==true){
			if(var1.getType().equals(var2.getType())){
				if(ctx.op.getText().equals("+")){
					d3 = d1 + d2;
				}else{
					d3 = d1 - d2;
				}
				s = "" + d3;
			}else{
				s = "ERROR: Diferents types of variables!";
			}
		}else{
			if(ctx.op.getText().equals("+")){
				d3 = d1 + d2;
			}else{
				d3 = d1 - d2;
			}
			s = "" + d3;
		}

		//varCriation2.add("Sinal",ctx.op.getText());
		//System.out.print(varCriation2.render());

		return s;
	}
}