import org.junit.jupiter.api.*;

public class JUnit5Test
{
    @Test
    public void sumShouldBePositive(){
        int a = 1, b = 2;
        int t = a + b;
        Assertions.assertTrue(t >= 0);
    }
}
