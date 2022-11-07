// Generated from /Users/maksim/work/grammar3/src/main/Arithmetic.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code equation}
	 * labeled alternative in {@link ArithmeticParser#s}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ArithmeticParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equation}
	 * labeled alternative in {@link ArithmeticParser#s}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ArithmeticParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ArithmeticParser#s}.
	 * @param ctx the parse tree
	 */
	void enterExp(ArithmeticParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ArithmeticParser#s}.
	 * @param ctx the parse tree
	 */
	void exitExp(ArithmeticParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(ArithmeticParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(ArithmeticParser.AContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(ArithmeticParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(ArithmeticParser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(ArithmeticParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(ArithmeticParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ArithmeticParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ArithmeticParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varEquation}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void enterVarEquation(ArithmeticParser.VarEquationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varEquation}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 */
	void exitVarEquation(ArithmeticParser.VarEquationContext ctx);
}