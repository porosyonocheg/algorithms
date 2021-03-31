package arraySorting;

/**@see QuickSort
 * @author Сергей Шершавин*/

public class QuickSort2 implements Sorting {

    private void quickSort(int[] array, int start, int end) {
        if (end > start) {
            int index = partition(array, start, end);
            quickSort(array, start, index - 1);
            quickSort(array,index + 1,  end);
        }
    }

    private int partition(int[] array, int start, int end) {
        int index = start + (end - start)/2;
        int pivot = array[index];
        int temp = array[index];
        array[index] = array[end];
        array[end] = temp;
        for (int i = index = start; i < end; i++) {
            if (array[i] <= pivot) {
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
        temp = array[index];
        array[index] = array[end];
        array[end] = temp;
        return (index);
    }

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length-1);
    }
}
