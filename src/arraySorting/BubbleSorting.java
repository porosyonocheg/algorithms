package arraySorting;

/** Сортировка пузырьком. Временная сложность O(n^2).
 * @author Сергей Шершавин*/

public class BubbleSorting extends Sorting {

    public BubbleSorting(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
