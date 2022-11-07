import org.junit.jupiter.api.Test;

public class Tests {
  @Test
  public void justEquations() {
    assert Main.apply("2+2;").equals("2+2=4;");
    assert Main.apply("(2+2)*2;").equals("(2+2)*2=8;");
    assert Main.apply("(3*3)+(4*4);").equals("(3*3)+(4*4)=25;");
  }

  @Test
  public void simpleVars() {
    assert Main.apply("a=2;").equals("a=2;");
    assert Main.apply("b=3*3;").equals("b=9;");
    assert Main.apply("a+b;").equals("a+b=11;");
  }

  @Test
  public void complexEquations() {
    assert Main.apply("a=(2+2)*2;").equals("a=8;");
    assert Main.apply("b=10+(5*a)+10;").equals("b=60;");
    assert Main.apply("c=a+b;").equals("c=68;");
    assert Main.apply("a*(b+c);").equals("a*(b+c)=1024;");
  }

  @Test
  public void incorrectValues() {
    assert Main.apply("2+2").equals("Incorrect input!");
    assert Main.apply("2++2;").equals("Incorrect input!");
    assert !Main.apply("a+b;").isEmpty();
  }
}
