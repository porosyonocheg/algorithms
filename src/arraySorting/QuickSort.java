package arraySorting;

/** Быстрая сортировка. Выбираем опорный элемент, относительно которого будем сортировать (в данном случае изначально
 * выбран средний элемент массива). Ищем слева от опоры элемент больше неё, а справа - меньше. Повторяем смещая опору
 * поочередно на места уже отсортированных элементов.
 * @author Сергей Шершавин*/

public class QuickSort implements Sorting {

    public void quickSort(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int pivot = array[start + (end - start)/2];
        do {
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++; j--;
            }
        }
        while (i <= j);

        if (start <  j) quickSort(array, start, j);
        if (i < end) quickSort(array, i, end);
    }

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length-1);
    }
}
