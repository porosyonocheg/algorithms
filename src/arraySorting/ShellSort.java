package arraySorting;

/**Сортировка методом Шелла.Сравнение и перемещение (если необходимо) групп пар элементов на каждой итерации происходит
 * с некоторым шагом между ними, изначально определённым последовательностью Хиббарда и уменьшающимся в 2 раза на
 * каждой итерации*/

public class ShellSort implements Sorting {

    @Override
    public void sort(int[] array) {
        if (array.length == 2 && array[0] > array[1]) {
            int temp = array[1];
            array[1] = array[0];
            array[0] = temp;
            return;
        }
        int step = 1;
        while (step < array.length) step <<= 1;
        step >>= 1;
        step--;
        for (; step > 0; step /= 2 ){
            for (int i = step; i < array.length; i++){
                int temp = array[i];
                int j;
                for (j = i; j >= step && array[j - step] > temp; j -= step){
                    array[j] = array[j - step];
                }
                array[j] = temp;
            }
        }
    }
}
