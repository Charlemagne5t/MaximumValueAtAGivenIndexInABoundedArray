import java.util.Arrays;

public class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int leftover = maxSum - n;
        if (leftover == 0) return 1;
        int subtractor = 1;
        int indexValue = 2;
        leftover--;
        int i = 1;
        while (leftover >= 0) {
            if (subtractor == n) {
                indexValue = indexValue + leftover / n;
                return indexValue;
            }
            indexValue++;
            int leftIndex = Math.max(index - i, -1);
            int rightIndex = Math.min(n, index + i);
            i++;
            if (leftIndex != -1 && rightIndex != n) {
                subtractor = subtractor + 2;
            } else if (leftIndex == -1 && rightIndex == n) {
                subtractor = n;
            } else if (leftIndex == -1 || rightIndex == n) {
                subtractor++;
            }

            leftover = leftover - subtractor;
            if (leftover < 0) {
                indexValue--;
                break;
            }

        }

        return indexValue;
    }
}
