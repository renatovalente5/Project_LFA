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
 * @param <ST> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class Compiler extends SourceLanguageBaseVisitor<ST>{

	Map<String, Var> symb = new HashMap<>();
	static ST Command = null;
	static String ramKey = "e";
	

	@Override public ST visitMain(SourceLanguageParser.MainContext ctx) {  
		
		/*
		ST imp = new ST ("import <class1>; \n import <class2>; \n");
		
		ST suportClassInit = new ST ("<class1> <name> = new <class1>();");
		ST mainOpen = new ST ("public void public static void main(String[] args) {");
		
		System.out.println(imp.render());
		System.out.println(suportClassInit.render());
		System.out.println(mainOpen.render());
		*/
		visitChildren(ctx);
		//System.out.println(Command.render());
		return Command;  
	}
	
	@Override public ST visitInstruction(SourceLanguageParser.InstructionContext ctx) { 
		ST output = new ST("<Intruction>;\n");
		output.add("Intruction",(ST)visitChildren(ctx));
		
		//System.out.print(output.render());

		Command = output;
		
		return output; 
	}
	
	@Override public ST visitIntegerType(SourceLanguageParser.IntegerTypeContext ctx) { 
		
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
		return line; 
	}

	@Override public ST visitDoubleType(SourceLanguageParser.DoubleTypeContext ctx) { 
		
		//string templates
		ST line  = new ST("symb.put(\"<key>\", new Var(\"<Type>\", <Num>))");
		
		//line 0
		String name = ctx.VARNAME().getText();
		line.add("key", name);
		line.add("Type", "Double");
		line.add("Num","0");
		
		//print
		//System.out.print(line.render());
		
		symb.put(name, new Var("Double", 0));
		return line; 
	}
	
	@Override public ST visitNewType(SourceLanguageParser.NewTypeContext ctx) { 
		//string templates
		ST line  = new ST("symb.put(\"<key>\", new Var(\"<Type>\", <Num>))");
		
		//line 0
		String name = ctx.VARNAME().getText();
		String tipovar = ctx.TYPENAME().getText();
		line.add("key", name);
		line.add("Type", tipovar);
		line.add("Num","0");
		
		//print
		//System.out.print(line.render());
		
		symb.put(name, new Var("Double", 0));
		return line; 
	}

	@Override public ST visitAssignDeclaration(SourceLanguageParser.AssignDeclarationContext ctx) { 
		ST output = new ST("<declaration>;\n<assign>");

		ST declaration = (ST)visit(ctx.declaration());
		output.add("declaration", declaration);

		String key = declaration.render().split("\"")[1];
		
		ST assign = new ST("symb.get(\"<key>\").setVal(<val>)");
		assign.add("key", key);
		System.out.println("Key = " + key);
		assign.add("val",(ST)visit(ctx.expression()));
		
		output.add("assign", assign);
		return output; 
		
	}
	
	@Override public ST visitAssignVariable(SourceLanguageParser.AssignVariableContext ctx) { 
		ST output = new ST("symb.get(\"<key>\").setVal(<val>)");
		
		String key = ctx.VARNAME().getText();
		System.out.println("setting key to " + key);
		output.add("key", key);
		this.ramKey = key;
		System.out.println("setting key to " + ramKey);
		output.add("val", visitChildren(ctx));

		return output; 
	}
	
	@Override public ST visitPrintExpression(SourceLanguageParser.PrintExpressionContext ctx) { 
		
		ST output = new ST("System.out.println(<expression>)");;
		
		output.add( "expression", (ST)visit(ctx.expression()));

		System.out.println("HERE");

		return output; 
	}
	
	@Override public ST visitExpressionDouble(SourceLanguageParser.ExpressionDoubleContext ctx) { 
		
		ST output = new ST("<Double>");
		
		output.add("Double", ctx.DOUBLE().getText());

		//System.out.println(output.render());
		
		return output; 
	}
	
	@Override public ST visitExpressionMulDiv(SourceLanguageParser.ExpressionMulDivContext ctx) { 
		ST varCriation2 = new ST("<Expression1> <Sinal> <Expression2>");

		ST e1 = (ST)visit(ctx.e1);
		ST e2 = (ST)visit(ctx.e2);
		
		varCriation2.add("Sinal",ctx.op.getText());
		varCriation2.add("Expression1", e1);
		varCriation2.add("Expression2", e2);
		
		//System.out.print(varCriation2.render());

		return varCriation2;
	}
	
	@Override public ST visitExpressionSignal(SourceLanguageParser.ExpressionSignalContext ctx) { 
		ST output = new ST("(<Sinal><Expression>)");

		//sinal
		String sinal = ctx.op.getText();
		
		output.add("Sinal", sinal);
		output.add("Expression", (ST)visit(ctx.expression()));

		//System.out.println(output.render());
		
		return output;
	}
	
	@Override public ST visitExpressionInteger(SourceLanguageParser.ExpressionIntegerContext ctx) { 
		ST output = new ST("<Int>");
		
		output.add("Int", ctx.INTEGER().getText());

		//System.out.println(output.render());
		
		return output; 
	}
	
	@Override public ST visitExpressionVariable(SourceLanguageParser.ExpressionVariableContext ctx) {
		ST output = new ST("symb.get(\"<var>\").getVal()");

		output.add("var", ctx.VARNAME().getText());

		return output; 
	}
	
	@Override public ST visitExpressionAddSub(SourceLanguageParser.ExpressionAddSubContext ctx) { 
		//ST //varCriation1, //varCriation2;
		
	//inicilizacion
		//String e1 = (String) (ST)visit(ctx.e1);
		//System.out.print(ctx.op.getText());
		ST varCriation2 = new ST("<Expression1> <Sinal> <Expression2>");

		ST e1 = (ST)visit(ctx.e1);
		ST e2 = (ST)visit(ctx.e2);
		
		varCriation2.add("Sinal",ctx.op.getText());
		varCriation2.add("Expression1", e1);
		varCriation2.add("Expression2", e2);
		
		//System.out.print(varCriation2.render());

		return varCriation2;
	}
}