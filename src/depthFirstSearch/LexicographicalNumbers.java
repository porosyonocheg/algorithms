package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/** Сортировка целых чисел в лексикографическом порядке
 * @author Сергей Шершавин*/

public class LexicographicalNumbers {

    /**@param n правая граница списка сортируемых значений [1,n]
     * @return отсортированный список целых чисел от 1 до n*/
    public List<Integer> sort(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(i, n, result);
        }
        return result;
    }

    private void dfs(int current, int limit, List<Integer> result) {
        if (current > limit) return;
        result.add(current);
        for (int i = 0; i < 10; i++) {
            int next = current * 10 + i;
            if (next > limit) return;
            dfs(next, limit, result);
        }
    }
}
