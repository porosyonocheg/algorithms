package slidingWindow;

/**Поиск величины самой длинной подстроки без повторяющихся символов
 * @author Сергей Шершавин*/

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] letters = s.toCharArray();
        if (letters.length == 0) return 0;
        int maxLength = 0;
        int[] lastIndexesOfChar = new int[128];
        for (int i = 0, j = 0; i < letters.length; i++) {
            if (lastIndexesOfChar[letters[i]] > 0) {
                j = Math.max(j, lastIndexesOfChar[letters[i]]);
            }
            lastIndexesOfChar[letters[i]] = i + 1;
            maxLength = Math.max(maxLength, i - j + 1);
        }
        return maxLength;
    }
}
