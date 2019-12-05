import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class NDPVisitor extends DimensionsParserBaseVisitor<Object> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitFile(DimensionsParserParser.FileContext ctx) { return visitChildren(ctx); }
	
	@Override public Object visitEnterIndepentDim(DimensionsParserParser.EnterIndepentDimContext ctx) { 
		
		String nameoftype = ctx.NAMEOFDIM().getText();
		
		//erro tipo ja existe
		if(ListTipo.containsTipo(nameoftype)){
			System.err.println("Tipo já foi definido");
			System.exit(1);
		}
		
		String unitsoftype = ctx.UNITS().getText();
		
		Tipo toinsert = new Tipo(nameoftype,unitsoftype);
		
		ListTipo.addTipo(toinsert);
		
		visitChildren(ctx);
		
		return null; 
	}
	
	@Override public Object visitEnterDependentDimDiv(DimensionsParserParser.EnterDependentDimDivContext ctx) { 
		
		String nameoftype = ctx.e1.getText();
		
		//erro tipo ja existe
		if(ListTipo.containsTipo(nameoftype)){
			System.err.println("Tipo já foi definido");
			System.exit(1);
		}
		
		String nameoftypeleft = ctx.e2.getText();
		
		//erro tipo nao existe
		if(!ListTipo.containsTipo(nameoftypeleft)){
			System.err.println("Tipo na esquerda da expressao nao foi definido");
			System.exit(1);
		}
		
		String nameoftyperight = ctx.e3.getText();
		
		//erro tipo nao existe
		if(!ListTipo.containsTipo(nameoftyperight)){
			System.err.println("Tipo na direita da expressao nao foi definido");
			System.exit(1);
		}
		
		Tipo esquerda = ListTipo.getTipo(nameoftypeleft);
		Tipo direita = ListTipo.getTipo(nameoftyperight);
		
		String unitsoftype = esquerda.units() + " " + "-" + direita.units();
		
		Tipo toinsert = new Tipo(nameoftype,unitsoftype);
		
		ListTipo.addTipo(toinsert);
		
		visitChildren(ctx);
		
		return null; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Object visitEnterDependentDimMul(DimensionsParserParser.EnterDependentDimMulContext ctx) { 
		
		String nameoftype = ctx.e1.getText();
		
		//erro tipo ja existe
		if(ListTipo.containsTipo(nameoftype)){
			System.err.println("Tipo já foi definido");
			System.exit(1);
		}
		
		String nameoftypeleft = ctx.e2.getText();
		
		//erro tipo nao existe
		if(!ListTipo.containsTipo(nameoftypeleft)){
			System.err.println("Tipo na esquerda da expressao nao foi definido");
			System.exit(1);
		}
		
		String nameoftyperight = ctx.e3.getText();
		
		//erro tipo nao existe
		if(!ListTipo.containsTipo(nameoftyperight)){
			System.err.println("Tipo na direita da expressao nao foi definido");
			System.exit(1);
		}
		
		Tipo esquerda = ListTipo.getTipo(nameoftypeleft);
		Tipo direita = ListTipo.getTipo(nameoftyperight);
		
		String unitsoftype = esquerda.units() + " " + direita.units();
		
		Tipo toinsert = new Tipo(nameoftype,unitsoftype);
		
		ListTipo.addTipo(toinsert);
		
		visitChildren(ctx);
		
		return null;
		
	}
}
	
