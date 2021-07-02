package dynamicProgramming;

import java.util.Arrays;

/** Поиск длины самой большой возрастающей последовательности чисел в переданном массиве
 * @author Сергей Шершавин*/

public class LongestIncreasingSubsequence {
    public int getLength(int[] nums) {
        int dp[] = new int[nums.length]; // представление текущей возврастающей последовательности, под нулевым индексом будет текущий минимальный элемент.
        int size = 0; // фактический текущий размер возрастающей последовательности
        for (int i : nums) {
            int index = Arrays.binarySearch(dp, 0, size, i); //получим индекс элемента в текущей последовательности
            if (index < 0) index = - (index + 1); /* инвертируем результат, чтобы получить индекс, под которым должен
            был находиться текущий элемент в текущей возрастающей последовательности*/
            dp[index] = i;
            if (index == size) size++; // в последовательность был добавлен новый элемент, увеличиваем размер
        }
        return size;
    }
}
