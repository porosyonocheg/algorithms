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

    /**@param coins номиналы имеющихся монет
     * @param amount целевая сумма
     * @return количество уникальных комбинаций из имеющихся номиналов монет для получения целевой суммы в предположении,
     * что число монет каждого номинала бесконечно*/
    public int getNumberOfDifferentCombinations(int[] coins, int amount) {
        int[] combs = new int[amount + 1];
        combs[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (i - coin >= 0) {
                    combs[i] += combs[i - coin];
                }
            }
        }
        return combs[amount];
    }
}
