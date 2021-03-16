package arraySorting;

/**Сортировка расческой. Сравнение и перемещение (если необходимо) пар элементов на каждой итерации происходит
 * с некоторым шагом между ними, который изначально определяется длиной массива и уменьшается величиной
 * loadfactor (фактор уменьшения, имперически доказанное оптимальное значение данного параметра задано
 * в конструкторе по умолчанию).
 * @author  Сергей Шершавин*/

public class CombSort extends Sorting {
    private final float loadFactor;
    public CombSort(int[] array) {
        super(array);
        loadFactor = 1.247f;
    }

    public CombSort(int[] array, float loadFactor) {
        super(array);
        this.loadFactor = loadFactor;
    }

    @Override
    public void sort() {
        int step = array.length;
        boolean flag = false;
        while (!flag) {
            step /= loadFactor;
            if (step < 1) step = 1;
            flag = true;
            for (int i = 0; i < array.length-1; i++) {
                if (i+step < array.length) {
                    if (array[i] > array[i+step]) {
                        int temp = array[i+step];
                        array[i+step] = array[i];
                        array[i] = temp;
                        flag = false;
                    }
                }
                else {
                    flag = false;
                    break;
                }
            }
        }
    }
}
