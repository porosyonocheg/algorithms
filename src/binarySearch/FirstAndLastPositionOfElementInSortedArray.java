package binarySearch;

/**Поиск первого и последнего индекса заданного элемента в отсортированном массиве
 * @author Сергей Шершавин*/

public class FirstAndLastPositionOfElementInSortedArray {
    private boolean isFound = false;

    /**@param nums отсортированный массив, в котором производится поиск
     * @param target целевое значение, для которого ищутся индексы в массиве
     * @return массив, первое значение которого соответствует первому по порядку индексу в массиве для данного элемента;
     * второе значение - последний индекс для данного элемента в массиве. В случае, если элемент не найден: [-1, -1]*/
    public int[] searchRange(int[] nums, int target) {
        int[] indexes = new int[]{-1,-1};
        if (nums.length == 0) return indexes;
        binarySearch(indexes, nums, target, 0, nums.length-1);
        if (indexes[0] != -1) { // проверка, что элемент найден
            indexes[1] = indexes[0];
            for (int i = indexes[0] + 1; i < nums.length; i++) { // перебираем элементы справа от найденного, чтобы вычислить последний индекс
                if (nums[i] == target) indexes[1] = i;
            }

            for (int i = indexes[0] - 1; i >= 0; i--) { // перебираем элементы слева от найденного, чтобы вычислить первый индекс
                if (nums[i] == target) indexes[0] = i;
            }
        }
        return indexes;
    }

    private void binarySearch(int[] indexes, int[] nums, int target, int start, int end) {
        int middle = (end - start) / 2;
        if (middle <= 0) {
            if (nums[0] == target) indexes[0] = 0;
            else if (nums[nums.length-1] == target) indexes[0] = nums.length-1;
            isFound = true;
        }
        while (!isFound) {
            if (nums[start + middle] == target) {
                indexes[0] = start + middle;
                isFound = true;
            }
            else if (nums[start + middle] > target) {
                binarySearch(indexes, nums, target, start, end - middle);
            }
            else {
                binarySearch(indexes, nums, target, start + middle, end);
            }
        }
    }
}
