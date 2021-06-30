package backtracking;

/**Получение количества всех возможных уникальных комбинаций из букв переданной строки. Строка должна состоять из
 * латинских букв в верхнем регистре. Пример: "AAB" -> ["A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA"] -> 8.
 * @author Сергей Шершавин*/

public class LetterTilePossibilities {
    public int countPermutations(String tiles) {
        int[] alphabet = new int[26]; // массив отражающий частоту повторений каждой буквы

        for (char c : tiles.toCharArray()) {
            alphabet[c-'A']++;
        }

        return backtracking(alphabet);
    }

    private int backtracking(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++; // увеличиваем счётчик на текущую букву
                array[i]--; // уменьшаем количество данной буквы в массиве
                count += backtracking(array); // пока есть ненулевые элементы аккумулируем результат
                array[i]++; // восстанавливаем количество перед выходом из текущего вызова
            }
        }
        return count;
    }
}
