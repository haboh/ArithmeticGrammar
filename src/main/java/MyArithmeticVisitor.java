import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class MyArithmeticVisitor implements ArithmeticVisitor<Integer> {

  static Map<String, Integer> storage = new HashMap<String, Integer>();

  @Override
  public Integer visitEquation(ArithmeticParser.EquationContext ctx) {
    return this.visit(ctx.eq);
  }

  @Override
  public Integer visitExp(ArithmeticParser.ExpContext ctx) {
    return this.visit(ctx.expr);
  }

  @Override
  public Integer visitA(ArithmeticParser.AContext ctx) {
    Integer value = this.visit(ctx.expr);
    storage.put(ctx.var.getText(), value);
    return value;
  }

  @Override
  public Integer visitOpExpr(ArithmeticParser.OpExprContext ctx) {
    Integer left = this.visit(ctx.left);
    Integer right = this.visit(ctx.right);
    return switch (ctx.op.getText().charAt(0)) {
      case '*' -> left * right;
      case '+' -> left + right;
      default -> throw new IllegalArgumentException("Unknown operator");
    };
  }

  @Override
  public Integer visitAtomExpr(ArithmeticParser.AtomExprContext ctx) {
    return Integer.valueOf(ctx.atom.getText());
  }

  @Override
  public Integer visitParenExpr(ArithmeticParser.ParenExprContext ctx) {
    return this.visit(ctx.value);
  }

  @Override
  public Integer visitVarEquation(ArithmeticParser.VarEquationContext ctx) {
    return storage.get(ctx.variable.getText());
  }

  @Override
  public Integer visit(ParseTree tree) {
    return tree.accept(this);
  }

  @Override
  public Integer visitChildren(RuleNode node) {
    return null;
  }

  @Override
  public Integer visitTerminal(TerminalNode node) {
    return null;
  }

  @Override
  public Integer visitErrorNode(ErrorNode node) {
    return null;
  }
}
