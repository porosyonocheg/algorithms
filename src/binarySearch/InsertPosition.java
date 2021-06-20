package binarySearch;

/**Поиск первого индекса элемента в отсортированном по возрастанию массиве, в случае его отсутствия возвращается
 * индекс вставки элемента в массив в соответствии с сортировкой. В случае, если в качестве массива передан null
 * или пустой массив возвращается -1.
 * @author Сергей Шершавин*/

public class InsertPosition {
    private final boolean hasDuplicates;
    public InsertPosition() {
        hasDuplicates = true;
    }

    /**@param hasDuplicates false, если переданный массив не содержит дупликатов, true (также по умолчанию) - если содержит*/
    public InsertPosition(boolean hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    /**@param nums отсортированный массив, в котором производится поиск
     * @param target целевой элемент, индекс которого (или место вставки для которого) ищется в массиве*/
    public int search(int[] nums, int target) {
        if (hasDuplicates) return binarySearch(nums, target);
        return binarySearchUnique(nums, target);
    }

    public int binarySearchUnique(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length-1, middle;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (nums[middle] == target) return middle;
            else if (nums[middle] < target) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return start;
    }

    public int binarySearch (int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (nums[middle] < target) {
                start = middle+1;
            }

            else {
                end = middle-1;
            }
        }
        return start;
    }
}
