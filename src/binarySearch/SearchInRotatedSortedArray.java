package binarySearch;

/**Поиск элемента в повернутом массиве, отсортированном в неубывающем порядке*/

public class SearchInRotatedSortedArray {

    /** @param nums массив, в котором производится поиск целевого элемента. Должен быть упорядочен по возрастанию
     *               значений элементов и содержать уникальные значения (не иметь дубликатов), может быть повернут.
     *               Пример: [1,2,3] = [3,1,2] = [2,3,1]
     * @param target целевой элемент, поиск которого осуществляется в массиве
     * @return индекс целевого элемента в массиве или -1, если целевой элемент не найден*/
    public int getIndexOfTarget(int[] nums, int target) {
        int start = 0, end = nums.length - 1, middle;
        while (start < end) {
            middle = start + (end - start)/2;
            if (nums[middle] == target) return middle;
            if (nums[0] <= nums[middle]) {
                if (target >= nums[0] && target < nums[middle]) end = middle - 1;
                else start = middle + 1;
            }
            else {
                if (target > nums[middle] && target <= nums[end]) start = middle + 1;
                else end = middle - 1;
            }
        }
        return nums[start] == target ? start : -1;
    }

    /**@param nums массив, в котором производится поиск целевого элемента. Должен быть упорядочен в неубывающем
     *               порядке значений элементов, может быть повернут и содержать дубликаты элементов.
     *               Пример: [1,1,2,3] = [3,1,1,2] = [2,3,1,1] = [1,2,3,1]
     * @param target целевой элемент, поиск которого осуществляется в массиве
     * @return true, если массив содержит целевой элемент, в противном случае - false*/
    public boolean containsTarget(int[] nums, int target) {
        int start = 0, end = nums.length-1, middle;
        while (start <= end) {
            middle = start + (end - start)/2;
            if (nums[middle] == target) return true;
            if (nums[start] < nums[middle]) { // если выполнено -> левая часть отсортирована
                if (target >= nums[start] && target < nums[middle]) end = middle - 1; // target в левой части, смещаем правую границу
                else start = middle + 1;
            }
            else if (nums[start] > nums[middle]) { // если выполнено -> правая часть отсортирована
                if (target > nums[middle] && target <= nums[end]) start = middle + 1; // target в правой части, смещаем левую границу
                else end = middle - 1;
            }
            else start++; // смещаем одну из границ в поисках новой середины и получения более определенного случая
        }
        return false;
    }
}
