package dynamicProgramming;

import java.util.Arrays;

/**Поиск минимальной цены полёта из одного города в другой с ограничением на количество транзитных городов
 * @author Сергей Шершавин*/

public class CheapestFlightsWithinKStops {

    /**@param n общее число доступных городов
     * @param flights flight[i][0] - i-ый город отправления, flight[i][1] - i-ый город назначения, flight[i][2] - стоимость полёта между ними
     * @param k количество транзитных городов, которые используются как пересадки
     * @param src город отправления
     * @param dst город назначения
     * @return минимальную стоимость полёта из src в dst с не более чем k пересадками, если dst достижим, -1 в противном случае*/
    public int getPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[k+2][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][src] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int[] flight : flights) {
                int current = flight[0], next = flight[1], price = flight[2];
                if (dp[i-1][current] != Integer.MAX_VALUE) {
                    dp[i][next] = Math.min(dp[i][next], dp[i-1][current] + price);
                }
            }
        }
        return dp[k+1][dst] == Integer.MAX_VALUE ? -1 : dp[k+1][dst];
    }
}
