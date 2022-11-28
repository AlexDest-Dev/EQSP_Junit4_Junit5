import org.junit.Assert;
import org.junit.Test;

public class JUnit4Test
{
    @Test
    public void sumShouldBePositive(){
        int a = 1, b = 2;
        int t = a + b;
        Assert.assertTrue(t >= 0);
    }
}
