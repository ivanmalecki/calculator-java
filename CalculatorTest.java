 
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    @Test
    public void testAddition() {
        String result = Calculator.Run("4 + 5");
        Assert.assertEquals("9", result);
    }
    @Test
    public void testAddition2() {
        String result = Calculator.Run("10 - 2");
        Assert.assertEquals("8", result);
    }
    @Test
    public void testFloatingPointe() {
        String result = Calculator.Run("1.2+4.9");
        Assert.assertEquals("6.1", result);
    }
    @Test
    public void testFloatingPointeMulti() {
        String result = Calculator.Run("4.5*3.2");
        Assert.assertEquals("14.4", result);
    }
    public void testFloatingPointeNegative() {
        String result = Calculator.Run("7.7-2.8");
        Assert.assertEquals("4.9", result);
    }
    @Test
    public void testNegative() {
        String result = Calculator.Run("4 - 5");
        Assert.assertEquals("-1", result);
    }
    @Test
    public void testNegativet() {
        String result = Calculator.Run("-3-6");
        Assert.assertEquals("-9", result);
    }
    @Test
    public void testNegativef() {
        String result = Calculator.Run("-3+(-6*1)");
        Assert.assertEquals("-9", result);
    }
    @Test
    public void testMultiply() {
        String result = Calculator.Run("4 * 5");
        Assert.assertEquals("20", result);
    }
    @Test
    public void testNegativeADD() {
        String result = Calculator.Run("-5 + 8");
        Assert.assertEquals("3", result);
    }
    @Test
    public void testNegativeADDt() {
        String result = Calculator.Run("6-(-3)");
        Assert.assertEquals("9", result);
    }
    @Test
    public void testComplexExpression() {
        String result = Calculator.Run("10 + 5 * 4 + 3");
        Assert.assertEquals("33", result);
    }
    @Test
    public void testComplexExpression2() {
        String result = Calculator.Run("(-14-3)/(2+1))");
        Assert.assertEquals("-5.6666666666666666666666666666667", result);
    }
    @Test
    public void testLargeNumber() {
        String result = Calculator.Run("1000000 + 2000000");
        Assert.assertEquals("3,000,000", result);
    }
    @Test
    public void testDivisionByZero() {
        String expression = "8 / 0"; 
        String result = Calculator.Run(expression);
        Assert.assertEquals("Error: Division by zero!", result);
        // You can customize the error message based on your implementation
    }

}