package backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**Возвращает все возможные комбинации элементов (от двух элементов в каждой) переданного массива с сохранением
 * порядка их следования и в неубывающем порядке их значений
 * @author  Сергей Шершавин*/

public class IncreasingSubsequences {
    public List<List<Integer>> find(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, 0, Integer.MIN_VALUE, new ArrayList<>(), result);
        return result;
    }

    private void backtracking(int[] nums, int start, int current, List<Integer> currentList, List<List<Integer>> result) {
        if (currentList.size() > 1) {
            result.add(new ArrayList<>(currentList));
        }
        Set<Integer> used = new HashSet<>(); // для пропуска возможных дупликатов на следующих витках рекурсии
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;
            if (nums[i] >= current) {   // проверка сохранения неубывающей последовательности
                currentList.add(nums[i]);
                used.add(nums[i]);
                backtracking(nums, i+1, nums[i], currentList, result);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}
