// Generated from DimensionsParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DimensionsParserParser}.
 */
public interface DimensionsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DimensionsParserParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(DimensionsParserParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimensionsParserParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(DimensionsParserParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnterIndepentDim}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterEnterIndepentDim(DimensionsParserParser.EnterIndepentDimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnterIndepentDim}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitEnterIndepentDim(DimensionsParserParser.EnterIndepentDimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnterDependentDimDiv}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterEnterDependentDimDiv(DimensionsParserParser.EnterDependentDimDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnterDependentDimDiv}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitEnterDependentDimDiv(DimensionsParserParser.EnterDependentDimDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnterDependentDimMul}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterEnterDependentDimMul(DimensionsParserParser.EnterDependentDimMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnterDependentDimMul}
	 * labeled alternative in {@link DimensionsParserParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitEnterDependentDimMul(DimensionsParserParser.EnterDependentDimMulContext ctx);
}