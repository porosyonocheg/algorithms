package dynamicProgramming;

/**Определение максимальной длины подпоследовательности чисел массива соответствующей условию nums[i]-nums[j]
 * @author Сергей Шершавин*/

public class LongestArithmeticSubsequence {

    public int getMaxLength(int[] nums) {
        int min = nums[0], max = nums[0], n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        int maxLength = 0, width = max - min;
        int[][] dp = new int[n][2*width + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                dp[i][diff + width] = dp[j][diff + width] + 1;
                maxLength = Math.max(maxLength, dp[i][diff + width]);
            }
        }
        return maxLength + 1;
    }
}
