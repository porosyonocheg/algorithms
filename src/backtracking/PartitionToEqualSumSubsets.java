package backtracking;

/**Разбиение целочисленного массива на k-подмножеств с равными суммами их значений
 * @author Сергей Шершавин*/

public class PartitionToEqualSumSubsets {

    /**@param nums исходный массив
     * @param k количество подмножеств с равными суммами значений
     * @return true если разбиение возможно, false - в противном случае*/
    public boolean isPossible(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum%k != 0) return false;
        return isPossible(nums, new boolean[nums.length], k, sum/k, 0, 0);
    }

    private boolean isPossible(int[] nums, boolean[] used, int k, int targetSum, int currentSum, int index) {
        if (k == 1) return true;

        if (targetSum == currentSum) {
            return isPossible(nums, used, k-1, targetSum, 0, 0);
        }

        for (int i = index; i < nums.length; i++) {
            if (!used[i] && nums[i] + currentSum <= targetSum) {
                used[i] = true;
                if (isPossible(nums, used, k, targetSum, nums[i] + currentSum, i + 1)) return true;
                used[i] = false;
            }
        }
        return false;
    }
}
