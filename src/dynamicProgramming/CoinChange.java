package dynamicProgramming;

import java.util.Arrays;

/**
 *@author Сергей Шершавин*/

public class CoinChange {

    /**@param coins доступные номиналы монет
     * @param amount искомая сумма размена
     * @return минимальное число монет из coins, соответствующее amount, либо -1, если получение amount невозможно*/
    public int getNumberOfCoins(int[] coins, int amount) {
        int[] dp = new int[amount+1]; //хранит минимальное количество монет для каждой суммы соответствующей индексу массива
        Arrays.fill(dp, amount+1);
        dp[0] = 0; // нулевая сумма не требует монет
        for (int c : coins) {
            for (int i = c; i <= amount; i++) {
                dp[i] = Math.min(dp[i], 1 + dp[i-c]); // для каждого номинала считаем/пересчитываем минимальное число монет для данной суммы
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
