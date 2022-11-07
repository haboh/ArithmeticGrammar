import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Main {
  public static String apply(String input) {
    ArithmeticLexer lexer = new ArithmeticLexer(CharStreams.fromString(input));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ArithmeticParser parser = new ArithmeticParser(tokens);
    try {
      ParseTree tree = parser.s();
      Integer answer = new MyArithmeticVisitor().visit(tree);
      String result;
      if (input.contains("=")) {
        result = input.split("=")[0] + "=" + answer + ";";
      } else {
        result = String.format(
                "%s=%s;", input.substring(0, input.length() - 1), answer);
      }
      return result;
    } catch (ParseCancellationException e) {
      return "Incorrect input!";
    } catch (Exception e) {
      return e.getMessage();
    }
  }

  public static void main(String[] args) {
    String[] lines = {
      "2+2;",
      "3+(3*3);",
      "a=3;",
      "b=6+5;",
      "c=5;",
      "a+b;",
      "a+b+c;"
    };
    for (String line : lines) {
      System.out.println(apply(line));
    }
  }
}
