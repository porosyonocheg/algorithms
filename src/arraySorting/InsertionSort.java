package arraySorting;

/** Сортировка вставками
 * @author Сергей Шершавин*/

public class InsertionSort extends Sorting {

    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int left = 1; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }
}
