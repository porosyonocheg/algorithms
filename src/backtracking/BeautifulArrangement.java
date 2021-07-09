package backtracking;

/** Поиск количества красивых композиций. Красивой композицией считается комбинация чисел из набора [1,n], индексированная
 * от 1, такая что для всех i верно либо число делится на свой индекс, либо индекс делится на число. Пример: n = 2.
 * [1,2]: 1%[1] = 0, 2%[2] = 0; [2,1]: 2%[1] = 0, [2]%1 = 0 (в квадратных скобках соответствующие индексы). Результат: 2
 * @author Сергей Шершавин*/

public class BeautifulArrangement {
    public int count(int n) {
        int[] count = new int[]{0};
        backtracking(n, n, new boolean[n + 1], count);
        return count[0];
    }

    private void backtracking(int size, int current, boolean[] used, int[] count) {
        if (current == 0) {
            count[0]++;
            return;
        }

        for (int i = 1; i <= size; i++) {
            if (!used[i] && (current%i == 0 || i%current == 0)) {
                used[i] = true;
                backtracking(size, current - 1, used, count);
                used[i] = false;
            }
        }
    }
}
