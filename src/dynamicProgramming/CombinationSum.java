package dynamicProgramming;

import java.util.Arrays;

/** Поиск различных комбинаций элементов массива уникальных целых чисел, сумма которых равна целевой. Каждый элемент может
 * быть использован в комбинации произвольное число раз. Пример [1,2,3], target = 4. Результат: 7. Комбинации:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * @author Сергей Шершавин*/

public class CombinationSum {
    public int getCombinations(int[] num, int target) {
        int[] count = new int[target]; // под index-1 хранится количество комбинаций для суммы равной index
        Arrays.fill(count, -1);
        dp(num, target, count);
        return count[target - 1];
    }

    private int dp(int[] num, int target, int[] count) {
        if (target == 0) return 1;
        if (count[target-1] != -1) return count[target-1]; // если значение для данной суммы уже посчитано, используем его
        int combs = 0;
        for (int i = 0; i < num.length; i++) {
            if (target - num[i] >= 0) combs += dp(num, target - num[i], count);
        }
        count[target-1] = combs;
        return count[target-1];
    }
}
