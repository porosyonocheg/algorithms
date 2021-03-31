package arraySorting;

/** Сортировка вставками. Проходя весь массив, полученный на каждой интерации элемент сравниваем последовательно
 * со всеми предыдущими элементами, если текущее значение меньше предыдущего, перемещаем больший элемент вперёд,
 * иначе вставляем текущий элемент и продолжаем обход массива.
 * @author Сергей Шершавин*/

public class InsertionSort implements Sorting {

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int left = i - 1;
            while (left >= 0 && value < array[left]) {
                array[left + 1] = array[left];
                left--;
            }
            array[left + 1] = value;
        }
    }
}
