package arraySorting;

/**@see QuickSort
 * @author Сергей Шершавин*/

public class QuickSort2 extends Sorting {
    public QuickSort2(int[] array) {
        super(array);
    }

    private void quickSort(int start, int end) {
        if (end > start) {
            int index = partition(start, end);
            quickSort(start, index - 1);
            quickSort(index + 1,  end);
        }
    }

    private int partition(int start, int end) {
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
    public void sort() {
        quickSort(0, array.length-1);
    }
}
