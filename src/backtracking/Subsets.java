package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Конструирование всех возможных уникальных комбинаций чисел, содержащихся в переданном массиве. Например для [1,2,3]:
 * [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]
 * @author Сергей Шершавин*/

public class Subsets {
    private final boolean containsDuplicates;
    public Subsets() {
        containsDuplicates = true;
    }

/**@param containsDuplicates false, если переданный массив не содержит дупликатов, true (также по умолчанию) - если содержит*/
    public Subsets(boolean containsDuplicates) {
        this.containsDuplicates = containsDuplicates;
    }

    public List<List<Integer>> getSets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (containsDuplicates) {
            Arrays.sort(nums);
            backtrackingDups(nums, 0, new ArrayList<>(), result);
        }
        else backtracking(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtracking(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtracking(nums, i + 1, current, result);
            current.remove(current.size()-1);
        }
    }

    private void backtrackingDups(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i-1] == nums[i]) continue;
            current.add(nums[i]);
            backtrackingDups(nums, i + 1, current, result);
            current.remove(current.size()-1);
        }
    }
}
