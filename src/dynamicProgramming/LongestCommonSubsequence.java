package dynamicProgramming;

/** Поиск максимальной длины общего подмножества символов двух строк. Например: "atbfc" и "bduca" -> "bc" -> 2.
 * @author Сергей Шершавин*/

public class LongestCommonSubsequence {

    public int getMaxLength(String text1, String text2) {
        char[] t1  = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] dp = new int[t1.length+1][t2.length+1]; // храним длину общего подмножества для текущего символа
        for (int i = 1; i <= t1.length; i++) {
            for (int j = 1; j <= t2.length; j++) {
                if (t1[i-1] == t2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1; // символы совпали -> увеличиваем длину общего подмножества на 1.
                }
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); // максимум из длин подмножеств с пропуском одного из символов
            }
        }
        return dp[t1.length][t2.length];
    }
}
