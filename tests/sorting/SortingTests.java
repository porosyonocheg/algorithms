package sorting;
import arraySorting.ArrayFactory;
import arraySorting.BubbleSort;
import arraySorting.InsertionSort;
import arraySorting.Sorting;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTests {

    public void templateMethod(Sorting sorting, int[] result) {
        long t1 = System.nanoTime();
        sorting.sort();
        long t2 = System.nanoTime();
        long e1 = System.nanoTime();
        Arrays.sort(result);
        long e2 = System.nanoTime();
        long diff = t2 - t1 - e2 + e1;
        if (diff > 0) {
        System.out.println("util.Arrays sort is faster: " + diff);
        }
        else if (diff < 0) System.out.println("Custom sort is faster: " + (-diff));
        else System.out.println("Sorts are equal in time");
    }

    @Test
    public void bubbleSortTest() {
        System.out.println("For arrays of size 11:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(11);
        int[] result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(11);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(11);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 1111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(1111);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(1111);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(1111);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 111111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(111111);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(111111);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(111111);
        result = nums.clone();
        templateMethod(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void insertionSort() {
        System.out.println("For arrays of size 11:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(11);
        int[] result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(11);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(11);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 1111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(1111);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(1111);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(1111);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 111111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(111111);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(111111);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(111111);
        result = nums.clone();
        templateMethod(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);
    }
}
