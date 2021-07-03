package dynamicProgramming;

/**Поиск длины самой большой палиндромической подпоследовательности символов в строке. Подпоследовательностью считается
 * совокупность символов с сохранением их порядка следования, но необязательно смежным расположением.
 * @author Сергей Шершавин*/

public class LongestPalindromicSubsequence {
    public int getLength(String s) {
        char[] chars = s.toCharArray();
        if (chars.length < 2) return chars.length;
        int[][] dp = new int[chars.length][chars.length]; //длина каждой [i,j] палиндромической подпоследовательности
        for (int i = chars.length-1; i >= 0; i--) {
            dp[i][i] = 1; // каждый отдельный символ по умолчанию палиндром длиной 1.
            for (int j = i+1; j < chars.length; j++) {
                //если очередные два символа совпадают - увеличиваем длину из предыдущих вычислений на 2,
                //иначе берём максимальную длину из предыдущих вычислений без учёта одного из крайних (данных) символов
                dp[i][j] = (chars[i] == chars[j]) ? dp[i+1][j-1] + 2 : Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
        return dp[0][chars.length-1];
    }
}
