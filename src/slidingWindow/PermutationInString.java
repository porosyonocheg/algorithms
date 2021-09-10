package slidingWindow;

/** Проверка содержит ли s2 последовательную перестановку символов из s1.
 * @author Сергей Шершавин*/

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        char[] inner = s1.toCharArray(), outer = s2.toCharArray();
        int innerLength = inner.length, outerLength = outer.length;
        if  (innerLength > outerLength) return false;
        int[]freq = new int[26];
        for (char c : inner) {
            freq[c-'a']++;
        }
        for (int i = 0; i < outerLength; i++) {
            freq[outer[i]-'a']--;
            if (i - innerLength >= 0) freq[outer[i - innerLength] - 'a']++;
            if (isPermutation(freq)) return true;
        }
        return false;
    }

    private boolean isPermutation(int[] freq) {
        for (int i : freq) if (i != 0) return false;
        return true;
    }
}
