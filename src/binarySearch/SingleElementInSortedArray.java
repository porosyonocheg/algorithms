package binarySearch;

/**Поиск уникального элемента в отсортированном по возрастанию массиве целых чисел, все остальные элементы которого
 * дублированы.
 * @author Сергей Шершавин*/

public class SingleElementInSortedArray {

    /**@throws IllegalArgumentException если передан массив некорректной длины*/
    public int getSingle(int[] nums) {
        if (nums.length %2 == 0 || nums.length == 1) throw new IllegalArgumentException("Incorrect input array");
        int left = 0, right = nums.length / 2, middle;
        while (left < right) {
            middle = left + (right - left) / 2;
            if (nums[middle*2] == nums[middle*2+1]) {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        return nums[left*2];
    }
}
