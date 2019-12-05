// Generated from SourceLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SourceLanguageParser}.
 */
public interface SourceLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SourceLanguageParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SourceLanguageParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SourceLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SourceLanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SourceLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SourceLanguageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(SourceLanguageParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(SourceLanguageParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(SourceLanguageParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(SourceLanguageParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNewType(SourceLanguageParser.NewTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNewType(SourceLanguageParser.NewTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link SourceLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignDeclaration(SourceLanguageParser.AssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link SourceLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignDeclaration(SourceLanguageParser.AssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link SourceLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariable(SourceLanguageParser.AssignVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link SourceLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariable(SourceLanguageParser.AssignVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link SourceLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(SourceLanguageParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link SourceLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(SourceLanguageParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionDouble}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDouble(SourceLanguageParser.ExpressionDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionDouble}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDouble(SourceLanguageParser.ExpressionDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMulDiv}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMulDiv(SourceLanguageParser.ExpressionMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMulDiv}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMulDiv(SourceLanguageParser.ExpressionMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionSignal}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSignal(SourceLanguageParser.ExpressionSignalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionSignal}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSignal(SourceLanguageParser.ExpressionSignalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionInteger}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInteger(SourceLanguageParser.ExpressionIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionInteger}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInteger(SourceLanguageParser.ExpressionIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAssociation}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssociation(SourceLanguageParser.ExpressionAssociationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAssociation}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssociation(SourceLanguageParser.ExpressionAssociationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionVariable}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionVariable(SourceLanguageParser.ExpressionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionVariable}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionVariable(SourceLanguageParser.ExpressionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAddSub}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAddSub(SourceLanguageParser.ExpressionAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAddSub}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAddSub(SourceLanguageParser.ExpressionAddSubContext ctx);
}