package dynamicProgramming;

/** Исходные данные: 'A'. Доступны 2 операции: скопировать все данные, вставить текущую копию.
 * @author Сергей Шершавин*/

public class TwoKeysKeyboard {
    /**@param n необходимое количество 'A'
     * @return минимально необходимое число операций для достижения цели*/
    public int getMinOperations(int n) {
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = i/2; j > 1; j--) {
                if (i%j == 0) {
                    dp[i] = dp[j] + i/j; //вставляем (i/j)-раз предыдущий набор
                    break;
                }
            }
        }
        return dp[n];
    }
}
