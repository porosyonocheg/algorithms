package arraySorting;

import java.util.HashSet;
import java.util.Set;

/** Содержит статические методы создания целочисленных массивов
 * @author Сергей Шершавин*/

public class ArrayFactory {

    /**@return  упорядоченный целочисленный массив от 0 до переданного в параметре размера минус 1.
     * @param size размер создаваемого массива*/
    public static int[] getSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 1; i < size; i++) array[i] = i;
        return array;
    }

    /**@return  упорядоченный целочисленный массив от переданного в параметре размера минус 1 до ноля.
     * @param size размер создаваемого массива*/
    public static int[] getSortedArrayInReverseOrder(int size) {
        int[] array = new int[size];
        for (int i = 1; i < size; i++) array[size-i-1] = i;
        return array;
    }

    /**@return  целочисленный массив случайных неотрицательных чисел.
     * @param size размер создаваемого массива*/
    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = (int) (Math.random()*Integer.MAX_VALUE);
        return array;
    }

    /**@return  целочисленный массив случайных чисел в диапазоне от -maxValue до maxValue.
     * @param size размер создаваемого массива*/
    public static int[] getRandomValueLimitedArray(int size, int maxValue) {
        int[] array = new int[size];
        int sign;
        for (int i = 0; i < size; i++) {
            sign = (int) (Math.random()*2) == 0 ? 1 : -1;
            array[i] = (int) (Math.random()*(maxValue+1))*sign;

        }
        return array;
    }

    /**@return  целочисленный массив случайных чисел с ограничением на различное число элементов.
     * @param size размер создаваемого массива
     * @param repeats число повторов элементов массива,
     * numbers - общее количество повторяющихся элементов*/
    public static int[] getRandomArrayWithSetOfRepeatingElements(int size, int repeats) {
        int numbers = size/repeats * repeats;
        int[] array = new int[size];
        int j = 1;
        Set<Integer> indexes = new HashSet<>();
        for (int i = 1; i <= numbers; i++) {
            int index = (int) (Math.random() * size);
            while (indexes.contains(index)) {
                index = (int) (Math.random() * size);
            }
            indexes.add(index);
            array[index] = j;
            if (i%repeats == 0) j += repeats;
        }
        for (int i = 0; j <= array.length; i++) {
            if (array[i] == 0) {
                array[i] = j;
                j++;
            }
        }
        return array;
    }
}
