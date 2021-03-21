package sorting;

import arraySorting.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static sorting.SortingTests.compareSortMethodWithUtilArraysSort;

public class HardSortingTests {
    @Test
    public void mergeSort() {
        System.out.println("For arrays of size 50:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(50);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(50);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(50);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(50,10);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 5000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(5000,1000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 500 000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(500000,100000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new MergeSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void quickSort() {
        System.out.println("For arrays of size 50:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(50);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(50);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(50);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(50,10);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 5000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(5000,1000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 500 000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("For array of size 50 000, 10 000 repeating elements:");
        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(50000,10000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new QuickSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void bucketSort() {
        System.out.println("For arrays of size 100:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(100);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(100);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(100);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(100,20);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 5000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(5000,1000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 500 000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("For array of size 50 000, 10 000 repeating elements:");
        nums = ArrayFactory.getRandomArrayWithSetOfRepeatingElements(50000,10000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BucketSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void countingSort() {
        System.out.println("For arrays of size 50:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(50);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(50);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomValueLimitedArray(50,250000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result); // OutOfMemory для больших значений массива
        assertArrayEquals(result, nums);

        System.out.println("======================================================");
        System.out.println("For arrays of size 5000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(5000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomValueLimitedArray(5000, 250000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        System.out.println("======================================================");
        System.out.println("For arrays of size 500 000:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(500000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomValueLimitedArray(500000, 250000);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomValueLimitedArray(500000, 10000); //должно быть много повторяющихся элементов
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new CountingSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void compareSortsTest() {
        int[] nums = ArrayFactory.getRandomArray(1000000);
        int[] nums1 = nums.clone();
        List<Sorting> list = new ArrayList<>();
        list.add(new QuickSort(nums));
        list.add(new QuickSort2(nums1));
        SortingTests.compareSorts(list);
    }
}
