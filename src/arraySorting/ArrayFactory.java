package arraySorting;

public class ArrayFactory {
    public static int[] getSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = i;
        return array;
    }

    public static int[] getSortedArrayInReverseOrder(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[size-i-1] = i;
        return array;
    }

    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) array[i] = (int) (Math.random()*Integer.MAX_VALUE);
        return array;
    }
}
