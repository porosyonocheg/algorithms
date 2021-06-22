package depthFirstSearch;

import java.util.List;

/**Поиск максимальной длины строки, образованной при конкатенации строк из переданного списка и содержащей только
 * уникальные буквы
 * @author Сергей Шершавин*/

public class ConcatenatedStringWithUniqueCharacters {
    private int maxLength = 0;

    /**@param arr массив строк должен содержать буквы латинского алфавита в нижнем регистре*/
    public int getMaxLength(List<String> arr) {
        dfs(arr, new int[26], 0, 0);
        return maxLength;
    }

    private void dfs(List<String> arr, int[] letters, int index, int currentLength) {
        maxLength = Math.max(maxLength, currentLength);
        if (index == arr.size()) return;
        for (int i = index; i < arr.size(); i++) {
            String current = arr.get(i);
            if (hasUniqueLetters(current, letters)) { // проверяем на уникальность символов
                dfs(arr, letters, i + 1, currentLength + current.length());
                reset(current, letters); // "сбрасываем" счётчик символов текущего слова
            }
        }
    }

    private boolean hasUniqueLetters(String s, int[] letters) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (letters[index] > 0) {
                for (; i > 0;) letters[chars[--i] - 'a']--; // немедленная "очистка" частот встречающихся букв для строки с неуникальынми символами
                return false;
            }
            letters[index]++;
        }
        return true;
    }

    private void reset(String s, int[] letters) {
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            letters[index]--;
        }
    }
}
