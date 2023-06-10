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

    @Test
    public void maxValueTest3() {
        int n = 3;
        int index = 2;
        int maxSum = 18;
        int output = 7;
        Assert.assertEquals(output, new Solution().maxValue(n, index, maxSum));
    }

    @Test
    public void maxValueTest4() {
        int n = 8;
        int index = 7;
        int maxSum = 14;
        int output = 4;
        Assert.assertEquals(output, new Solution().maxValue(n, index, maxSum));
    }
    @Test
    public void maxValueTest5() {
        int n = 7;
        int index = 5;
        int maxSum = 30;
        int output = 6;
        Assert.assertEquals(output, new Solution().maxValue(n, index, maxSum));
    }


    @Test
    public void maxValueTest6() {
        int n = 2;
        int index = 0;
        int maxSum = 798870804;
        int output = 399435402;
        Assert.assertEquals(output, new Solution().maxValue(n, index, maxSum));
    }
}
