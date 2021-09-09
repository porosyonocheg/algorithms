package slidingWindow;

/**Поиск самой длинной подстроки состоящей из одинаковых символов, получающейся при замене не более k любых символов
 * в переданной строке. Строка должна содержать только латинские буквы в верхнем регистре
 * @author Сергей Шершавин*/

public class LongestRepeatingCharacterReplacement {
    public int getLength(String s, int k) {
        char[] letters = s.toCharArray();
        int maxFreq = 0, start = 0, maxLength = 0;
        int[] freq = new int[26];
        for (int end = 0; end < letters.length; end++) {
            int idx = letters[end] - 'A';
            freq[idx]++;
            if (freq[idx] > maxFreq) maxFreq = freq[idx];
            if (end - start - maxFreq + 1 > k) {
                freq[letters[start] - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
