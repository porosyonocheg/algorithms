package dynamicProgramming;

/**Определяет возможность разбиения переданного массива положительных целых чисел на две части с равными суммами
 * значений элементов
 * @author Сергей Шершавин*/
public class PartitionEqualSubsetSum {

    public boolean isPossible(int[] nums) {
        int targetSum = 0;
        for (int i = 0; i < nums.length; i++) {
            targetSum += nums[i];
        }

        if (targetSum%2 != 0) return false;
        targetSum /= 2;
        return dfs(nums, targetSum, 0, 0, new Boolean[targetSum + 1]);
    }

    // subSums хранит в себе результаты предыдущих вычислений подсумм
    // Результат для данного элемента массива (индекса) считаем для суммы включающей данный элемент или не включающей.
    private boolean dfs(int[] nums, int target, int currentSum, int index, Boolean[] subSums) {
        if (currentSum == target) return true;
        if (index == nums.length || currentSum > target) return false;
        if (subSums[currentSum] != null) return subSums[currentSum];
        boolean result = dfs(nums, target, currentSum + nums[index], index + 1, subSums) || dfs(nums, target, currentSum, index + 1, subSums);
        subSums[currentSum] = result;
        return result;
    }
}
