package arraySorting;

/**Сортировка подсчётом. Найдя максимальный и минимальный элемент массива, создаём массив рангов размером max-min+1
 * Подсчитаем в нём число вхождений каждого элемента исходного массива (который является для него индексом минус min).
 * Получим ранги для каждого элемента сложением с предыдущим. В соответствии с рангами получаем исходные элементы прибавляя min
 * к текущему индексу массива рангов.
 *@author Сергей Шершавин */

public class CountingSort extends Sorting {
    public CountingSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < array.length; i++)
            count[array[i] - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                array[j++] = i + min;
    }
}
