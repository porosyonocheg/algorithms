package dynamicProgramming;

/** Получение максимального набора бинарных строк из массива, при условии содержания в них не более m нулей и n единиц
 * @author Сергей Шершавин*/

public class OnesAndZeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1]; //dp[i][j] хранит максимальное число строк, которое содержит i-нулей и j-единиц.
        for (String s : strs) {
            int countOnes = 0, countZeroes = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') countOnes++;
                else countZeroes++;
            }
            for (int i = m; i >= countZeroes; i--) {
                for (int j = n; j >= countOnes; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-countZeroes][j-countOnes] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
