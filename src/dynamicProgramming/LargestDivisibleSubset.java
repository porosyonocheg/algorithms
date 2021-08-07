package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Поиск самого длинного делимого поднабора из целочисленного массива. Делимым набором считается такой набор, любая пара
 * которого удовлетворяет либо условию a%b == 0, либо b%a == 0.
 * @author Сергей Шершавин*/

public class LargestDivisibleSubset {
    public List<Integer> get(int[] nums) {
        Arrays.sort(nums);
        int[] maxLengths = new int[nums.length];
        int[] prevIndexes = new int[nums.length];
        int maxLength = 0;
        int prevIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            maxLengths[i] = 1;
            prevIndexes[i] = -1;
            for (int j = i-1; j >= 0; j--) {
                if (nums[i]%nums[j] == 0 && maxLengths[j] + 1 > maxLengths[i]) {
                    maxLengths[i] = maxLengths[j] + 1;
                    prevIndexes[i] = j;
                }
            }
            if (maxLengths[i] > maxLength) {
                maxLength = maxLengths[i];
                prevIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        while (prevIndex != -1) {
            result.add(nums[prevIndex]);
            prevIndex = prevIndexes[prevIndex];
        }
        return result;
    }
}
