package dynamicProgramming;

/** Поиск максимального значения суммы средних значений подмассивов разбиения
 * @author Сергей Шершавин*/

public class LargestSumOfAverages {

    /**@apiNote среднее значение подмассива - сумма элементов подмассива, разделённая на их количество
     * @param nums исходный массив
     * @param k максимальное число подмассивов, на которые можно разбить массив
     * @throws IllegalArgumentException если число разбиений меньше 1
     * @return максимальную сумму средних значений среди всех возможных подмассивов разбиения*/
    public double get(int[] nums, int k) {
        if (k < 1) throw new IllegalArgumentException("Invalid k");
        if (k > nums.length) k = nums.length;
        return dp(new Double[k+1][nums.length], nums, k, 0);
    }

    private double dp(Double[][] memo, int[] nums, int k, int idx) {
        if (memo[k][idx] != null) return memo[k][idx];
        double maxAverage = 0, sum = 0;
        for (int i = idx; i <= nums.length - k; i++) {
            sum += nums[i];
            if (k > 1) {
                maxAverage = Math.max(maxAverage, sum /(i - idx + 1) + dp(memo, nums, k-1, i+1)) ;
            }
            else if (i == nums.length-1) {
                maxAverage = Math.max(maxAverage, sum /(i - idx + 1));
            }
        }
        return memo[k][idx] = maxAverage;
    }
}
