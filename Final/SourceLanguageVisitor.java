// Generated from SourceLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SourceLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SourceLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SourceLanguageParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SourceLanguageParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(SourceLanguageParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(SourceLanguageParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(SourceLanguageParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link SourceLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewType(SourceLanguageParser.NewTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignDeclaration}
	 * labeled alternative in {@link SourceLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignDeclaration(SourceLanguageParser.AssignDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVariable}
	 * labeled alternative in {@link SourceLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable(SourceLanguageParser.AssignVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link SourceLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(SourceLanguageParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionDouble}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDouble(SourceLanguageParser.ExpressionDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMulDiv}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMulDiv(SourceLanguageParser.ExpressionMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionSignal}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSignal(SourceLanguageParser.ExpressionSignalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionInteger}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInteger(SourceLanguageParser.ExpressionIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionAssociation}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssociation(SourceLanguageParser.ExpressionAssociationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionVariable}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionVariable(SourceLanguageParser.ExpressionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionAddSub}
	 * labeled alternative in {@link SourceLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAddSub(SourceLanguageParser.ExpressionAddSubContext ctx);
}