package dynamicProgramming;

import java.util.Arrays;

/** Максимализация прибыли от разницы цен покупки-продажи акций. Единовременно доступна только одна транзакция: перед
 * очередной покупкой предыдущий пакет должен быть продан.
 * @author Сергей Шершавин*/

public class BestTimeToBuyAndSellStock {

    /**@param prices prices[i] - стоимость акций в i-ый день
     * @param transactions количество доступных транзакций (покупка-продажа)
     * @return максимальную прибыль*/
    public int maxProfit(int[] prices, int transactions) {
        if (transactions < 1) throw new IllegalArgumentException("The number of transactions must be positive!");
        if (transactions == 1) return oneTransaction(prices);
        if (transactions < prices.length / 2) return moreThanOneTransaction(prices, transactions);
        return infinityTransactions(prices);
    }

    private int oneTransaction(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    private int moreThanOneTransaction(int[] prices, int k) {
        int[] emptyHands = new int[k+1]; //emptyHands[i] - макс. прибыль после продажи акций для i-ой транзакции
        int[] withStocks = new int[k+1]; //withStocks[i] - макс. сумма после покупки акций для i-ой транзакции
        Arrays.fill(withStocks, Integer.MIN_VALUE);

        for (int price : prices) {
            for (int j = k; j >= 1; j--) {
                emptyHands[j] = Math.max(emptyHands[j], withStocks[j] + price);
                withStocks[j] = Math.max(withStocks[j], emptyHands[j - 1] - price);
            }
        }
            return emptyHands[k];
    }

    private int infinityTransactions(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) { //пока цены акций растут мы можем аккумулировать разницу, что будет эквивалентно price[dayOfmax] - price[dayOfmin]
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}