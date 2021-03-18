package arraySorting;

/** Сортировка слиянием. Основывается на принципе "разделяй и властвуй". Разбиваем массив до тех пор пока его части не
 * станут отсортированными, сливаем их воедино, сортируя каждую объединяемую группу.
 * @Сергей Шершавин*/

public class MergeSort extends Sorting {
    public MergeSort(int[] array) {
        super(array);
    }

    private void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }
        for (int i = middle; i < length; i++) {
            right[i - middle] = array[i];
        }
        mergeSort(left, middle);
        mergeSort(right, length - middle);

        merge(array, left, right, middle, length - middle);
    }

    private void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            }
            else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }

    @Override
    public void sort() {
        mergeSort(array, array.length);
    }
}
