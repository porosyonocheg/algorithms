package dynamicProgramming;

/** Подсчёт минимального числа операций удаления символов из двух исходных строк, чтобы получить эквивалентные строки
 * @author Сергей Шершавин*/

public class DeleteOperationsForTwoStrings {
    public int getMinToMakeEqual(String word1, String word2) {
        int longestCommonSubsequence = new LongestCommonSubsequence().getMaxLength(word1, word2);
        return word1.length() - longestCommonSubsequence + word2.length() - longestCommonSubsequence;
    }
}
