package arraySorting;

/** Содержит статические методы создания целочисленных массивов
 * @author Сергей Шершавин*/

public class ArrayFactory {

    /**@return  упорядоченный целочисленный массив от 0 до переданного в параметре размера минус 1.
     * @param size размер создаваемого массива*/
    public static int[] getSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = i;
        return array;
    }

    /**@return  упорядоченный целочисленный массив от переданного в параметре размера минус 1 до ноля.
     * @param size размер создаваемого массива*/
    public static int[] getSortedArrayInReverseOrder(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[size-i-1] = i;
        return array;
    }

    /**@return  целочисленный массив случайных чисел.
     * @param size размер создаваемого массива*/
    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = (int) (Math.random()*Integer.MAX_VALUE);
        return array;
    }
    /**@return  целочисленный массив случайных чисел с ограничением на различное число элементов.
     * @param size размер создаваемого массива
     * @param numberOfDifferentElements число различных элементов массива*/
    public static int[] getRandomArrayWithSetOfRepeatingElements(int size, int numberOfDifferentElements) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = (int) (Math.random()*numberOfDifferentElements);
        return array;
    }
}
