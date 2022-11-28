import org.junit.jupiter.api.*;

public class JUnit5Test
{
    private static SimpleCalculator calculator;

    @BeforeAll
    public static void prepareCalculator(){
        calculator = new SimpleCalculator();
    }
    @Test
    public void subtractionShouldBeEqualExpectedNumber(){
        int a = 1, b = 2;
        int expected = a - b;
        Assertions.assertEquals(expected, calculator.subtraction(a, b));
    }
}
