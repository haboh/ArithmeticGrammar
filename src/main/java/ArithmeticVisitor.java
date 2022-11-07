// Generated from /Users/maksim/work/grammar3/src/main/Arithmetic.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code equation}
	 * labeled alternative in {@link ArithmeticParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ArithmeticParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ArithmeticParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ArithmeticParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticParser#a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(ArithmeticParser.AContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(ArithmeticParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(ArithmeticParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(ArithmeticParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varEquation}
	 * labeled alternative in {@link ArithmeticParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEquation(ArithmeticParser.VarEquationContext ctx);
}