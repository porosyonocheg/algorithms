package arraySorting;

/** Сортировка пузырьком. Проходим по всем элементам массива до тех пор, пока не останется ни одной пары элементов,
 * которые следует поменять местами.
 * @author Сергей Шершавин*/

public class BubbleSort implements Sorting {


    @Override
    public void sort(int[] array) {
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
