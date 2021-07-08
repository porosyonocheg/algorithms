package dynamicProgramming;

/**Получение целевой суммы различными комбинациями знаков для элементов исходного массива
 * @author Сергей Шершавин*/

public class TargetSum {
    /**@param nums массив, элементы которого участвуют в комбинации, элементы должны быть неотрицательны
     * @param target число, которому должна быть равна комбинация
     * @return число различных комбинаций*/
    public int countWays(int[] nums, int target) {
        int sum = 0;
        for (int num: nums) sum += num;
        if (Math.abs(target) > sum) return 0; // целевое значение не может быть достигнуто
        /*Элементы массива разбиваем на два подмассива: те, которые будут "положительны" составят некую sumP.
        * "отрицательные" - sumN. По условию, sumP - sumN = target. Добавим sumP + sumN к обеим частям равенства.
        * 2*sumP = target + sum. Ищем количество комбинаций для получения полусуммы "положительных" элементов*/
        sum += target;
        if (sum%2 == 1) return 0;
        int[] dp = new int[sum/2 + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = dp.length-1; i >= num; i--) {
                dp[i] += dp[i-num]; //под индексом подразумевается конкретная полусумма
            }
        }
        return dp[dp.length-1];
    }
}
