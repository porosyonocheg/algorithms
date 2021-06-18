package backtracking;

import java.util.ArrayList;
import java.util.List;

/** Получение всех возможных разбиений переданной строки на подстроки-палиндромы. Чувствительно к регистру букв, знакам
 * препинания и пробелам.
 * @author Сергей Шершавин*/

public class PalindromePartitioning {

    public List<List<String>> divide(String s) {
        List<List<String>> result = new ArrayList<>();
        backtracking(s, 0, s.length(), new ArrayList<>(), result);
        return result;
    }

    private void backtracking(String s, int start, int end, List<String> current, List<List<String>> result) {
        if (start == end) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < end; i++) {
            if (isPalindrome(s, start, i)) {
                String temp = s.substring(start, i + 1); //получаем текущую подстроку и отправляем в список
                current.add(temp);
                backtracking(s, i+1, end, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    /**Определяет является ли переданная строка палиндромом*/
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
