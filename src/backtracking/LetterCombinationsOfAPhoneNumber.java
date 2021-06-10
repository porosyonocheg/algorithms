package backtracking;

import java.util.ArrayList;
import java.util.List;

/**Возвращает все возможные комбинации букв для переданной строки цифр digits, каждой из цифр соответствует
 * набор букв согласно расположению на клавиатуре кнопочного мобильного телефона. digits должна содержать цифры от 2 до 9.
 * @author Сергей Шершавин*/

public class LetterCombinationsOfAPhoneNumber {
    // Соответствия цифра-буквы мы можем хранить в различных структурах данных: массиве строк, HashMap<Character, String>,
    // но массив char[][] является более оптимальным по быстродействию за счёт уменьшения операций преобразования к типу
    // char внутри вспомогательного метода
    static final char[][] LETTERS = new char[][]{{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static List<String> getLetters(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtracking(digits, 0, result, new StringBuilder());
        return result;
    }

    private static void backtracking(String digits, int index, List<String> result, StringBuilder sb) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        for (char c : LETTERS[digits.charAt(index) - '0']) {
            sb.append(c);
            backtracking(digits, index + 1, result, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
