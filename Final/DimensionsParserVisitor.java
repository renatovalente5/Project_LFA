// Generated from DimensionsParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DimensionsParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DimensionsParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DimensionsParserParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(DimensionsParserParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnterIndepentDim}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnterIndepentDim(DimensionsParserParser.EnterIndepentDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnterDependentDimDiv}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnterDependentDimDiv(DimensionsParserParser.EnterDependentDimDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnterDependentDimMul}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnterDependentDimMul(DimensionsParserParser.EnterDependentDimMulContext ctx);
}