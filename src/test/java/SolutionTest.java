import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxValueTest1() {
        int n = 4;
        int index = 2;
        int maxSum = 6;
        int output = 2;
        Assert.assertEquals(output, new Solution().maxValue(n, index, maxSum));
    }

    @Test
    public void maxValueTest2() {
        int n = 6;
        int index = 1;
        int maxSum = 10;
        int output = 3;
        Assert.assertEquals(output, new Solution().maxValue(n, index, maxSum));
    }
}
