package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Получение всех возможных представлений массива после перестановок его элементов. Например для [1,2,3]:
 * [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
 * @author Сергей Шершавин*/

public class Permutations {
    private final boolean hasDuplicates;
    public Permutations() {
        hasDuplicates = true;
    }

/**@param hasDuplicates false, если переданный массив не содержит дупликатов, true (также по умолчанию) - если содержит*/
    public Permutations(boolean hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (hasDuplicates) {
            Arrays.sort(nums);
            backtracking(nums, new boolean[nums.length], new ArrayList<>(), result);
        }
        else permute(nums, 0, result);
        return result;
    }

    private void permute(int[] nums, int start, List<List<Integer>> result) {
        for (int i = start; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
            permute(nums, start+1, result);
            temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
        }

        if (start == nums.length-1) {
            List<Integer> current = new ArrayList<>();
            for (int num : nums) {
                current.add(num);
            }
            result.add(current);
        }
    }

    private void backtracking(int[] nums, boolean[] flags, List<Integer> current, List<List<Integer>> result){
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (flags[i] || i > 0 && nums[i] == nums[i-1] && !flags[i-1]) continue;
                current.add(nums[i]);
                flags[i] = true; //обозначаем, что число под данным индексом уже использовалось, чтобы избежать дублирования
                backtracking(nums, flags, current, result);
                flags[i] = false;
                current.remove(current.size()-1);
            }
        }
    }
}
