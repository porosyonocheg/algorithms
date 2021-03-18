package sorting;

import arraySorting.ArrayFactory;
import arraySorting.MergeSort;
import org.junit.Test;

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
}
