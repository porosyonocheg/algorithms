package backtracking;

import java.util.ArrayList;
import java.util.List;

/** Получение всех возможных комбинаций символов для данной строки с переводом букв в верхний/нижний регистр.
 * Например: "1Ab3". Результат: ["1Ab3", "1ab3", "1AB3", "1aB3"]
 * @author Сергей Шершавин*/

public class LetterCasePermutation {

    public List<String> getPermutation(String s) {
        List<String> result = new ArrayList<>();
        backtracking(s.toCharArray(), 0, result);
        return result;
    }

    private void backtracking(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }
        if (Character.isDigit(chars[index])) {
            backtracking(chars, index + 1, result);
        }
        else {
            chars[index] = Character.toUpperCase(chars[index]);
            backtracking(chars, index + 1, result);

            chars[index] = Character.toLowerCase(chars[index]);
            backtracking(chars, index + 1, result);
        }
    }
}
