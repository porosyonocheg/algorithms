package arraySorting;

/**Сортировка выбором. Каждый проход по массиву выбираем минимальный элемент и смещаем его в начало. Каждый новый
 * проход начинаем сдвигаясь вправо на 1.
 * @author Сергей Шершавин*/

public class SelectionSort implements Sorting {

    @Override
    public void sort(int[] array) {
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
