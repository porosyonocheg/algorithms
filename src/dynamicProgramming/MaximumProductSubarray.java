package dynamicProgramming;

/** Поиск максимального по значению произведения элементов среди подмассивов исходного массива. Подмассив неразрывная
 * последовательность элементов в массиве.
 * Например nums = {-1, 0, -2}. Результат: 0.
 * @author Сергей Шершавин*/

public class MaximumProductSubarray {
    public int get(int[] nums) {
        int positive = 0; // храним текущее максимальное произведение с положительным знаком
        int negative = 0; // храним текущее минимальное произведение с отрицательным знаком
        int max = nums[0];
        if (nums[0] > 0) {
            positive = nums[0];
        }
        else {
            negative = nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive = Math.max(nums[i], positive*nums[i]);
                negative *= nums[i];
            }
            else {
                int temp = negative;
                negative = Math.min(nums[i], positive*nums[i]);
                positive = temp * nums[i];
            }
            max = Math.max(positive, max);
        }
        return max;
    }
}