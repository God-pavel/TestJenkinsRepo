import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void add() {
        Assert.assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void square() {
        Assert.assertEquals(4,calculator.square(2));
    }
}