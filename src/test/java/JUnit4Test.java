import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnit4Test
{
    private SimpleCalculator calculator;
    @Before
    public void prepareCalculator(){
        calculator = new SimpleCalculator();
    }
    @Test
    public void sumShouldBePositive(){
        int a = 1, b = 2;
        int expected = a + b;
        Assert.assertEquals(expected, calculator.addition(a, b));
    }
}
