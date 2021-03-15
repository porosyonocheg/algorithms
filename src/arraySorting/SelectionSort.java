package arraySorting;

/**Сортировка выбором. Каждый проход по массиву выбираем минимальный элемент и смещаем его в начало. Каждый новый
 * проход начинаем сдвигаясь вправо на 1.
 * @author Сергей Шершавин*/

public class SelectionSort extends Sorting{

    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            int temp = array[minInd];
            array[minInd] = array[left];
            array[left] = temp;
        }
    }
}
