package dynamicProgramming;

/**Определяет возможность разбиения переданного массива положительных целых чисел на две части с равными суммами
 * значений элементов
 * @author Сергей Шершавин*/
public class PartitionEqualSubsetSum {

    public boolean isPossible(int[] nums) {
        int targetSum = 0;
        for (int n : nums) targetSum += n;
        if (targetSum%2 != 0) return false; // если сумма нечетна - её нельзя разбить на две равные части
        targetSum /= 2;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;
        for (int n : nums) {
            for (int j = targetSum; j >= n; j--) {
                dp[j] = dp[j] || dp[j - n]; // элемент n не включается в сумму j или включается
            }
        }
        return dp[targetSum];
    }
}
