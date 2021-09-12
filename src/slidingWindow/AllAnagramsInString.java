package slidingWindow;

import java.util.ArrayList;
import java.util.List;

/** Поиск индексов символов начала анаграммы
 * @author Сергей Шершавин*/

public class AllAnagramsInString {

    /**@param p целевая строка для поиска
     * @param s строка, в которой ищется анаграмма строки p (любая комбинация из символов с сохранением их количества)
     * @return индексы символов начала анаграммы целевой строки в s */
    public List<Integer> findIndexes(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int length = p.length();
        char[] letters = s.toCharArray();
        if (length > letters.length) return result;
        int[] sample = new int[26];
        for (char c : p.toCharArray()) sample[c-'a']++;
        int[] freq = new int[26];
        int i = 0;
        for (; i < length; i++) freq[letters[i]-'a']++;
        if (checkFrequencies(freq, sample)) result.add(0);
        while (i < letters.length) {
            freq[letters[i-length]-'a']--;
            freq[letters[i]-'a']++;
            if (checkFrequencies(freq, sample)) result.add(i-length+1);
            i++;
        }
        return result;
    }

    private boolean checkFrequencies(int[] current, int[] sample) {
        for (int i = 0; i < current.length; i++) {
            if (current[i] != sample[i]) return false;
        }
        return true;
    }
}
