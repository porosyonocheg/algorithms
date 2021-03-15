package sorting;
import arraySorting.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortingTests {

    public void compareSorts(List<Sorting> list) {
        List<Long> time = new ArrayList<>();
        for (Sorting s : list) {
        long t1 = System.nanoTime();
        s.sort();
        long t2 = System.nanoTime();
        time.add(t2 - t1);
        }
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int j = 0; j < time.size()-1; j++) {
                if (time.get(j) > time.get(j+1)) {
                    time.add(j, time.get(j+1));
                    list.add(j, list.get(j+1));
                    time.remove(j+2);
                    list.remove(j+2);
                    isSorted = false;
                }
            }
        }
        for (int i = 0; i < time.size(); i++) {
            System.out.println(list.get(i).getClass().getSimpleName() + " - " + time.get(i) + "ns");
        }
    }

    public void compareSortMethodWithUtilArraysSort(Sorting sorting, int[] result) {
        long t1 = System.nanoTime();
        sorting.sort();
        long t2 = System.nanoTime();
        long e1 = System.nanoTime();
        Arrays.sort(result);
        long e2 = System.nanoTime();
        long diff1 = t2 - t1;
        long diff2 = e2 - e1;
        if (diff1 > diff2) {
        System.out.printf("util.Arrays sort is %.2f times faster%n", (diff1/(diff2*1.0)));
        }
        else if (diff1 < diff2) System.out.printf("Custom sort is %.2f times faster%n", (diff2/(diff1*1.0)));
        else System.out.println("Sorts are equal in time");
    }

    @Test
    public void bubbleSortTest() {
        System.out.println("For arrays of size 11:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(11);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(11);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(11);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 1111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 111111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new BubbleSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void insertionSort() {
        System.out.println("For arrays of size 11:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(11);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(11);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(11);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 1111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 111111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new InsertionSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void selectionSort() {
        System.out.println("For arrays of size 11:");
        int[] nums = ArrayFactory.getSortedArrayInReverseOrder(11);
        int[] result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(11);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(11);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 1111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(1111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);
        System.out.println("======================================================");
        System.out.println("For arrays of size 111111:");
        nums = ArrayFactory.getSortedArrayInReverseOrder(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getSortedArray(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);

        nums = ArrayFactory.getRandomArray(111111);
        result = nums.clone();
        compareSortMethodWithUtilArraysSort(new SelectionSort(nums), result);
        assertArrayEquals(result, nums);
    }

    @Test
    public void compareSortsTest() {
        int[] nums = ArrayFactory.getRandomArray(1111);
        int[] nums1 = nums.clone();
        int[] nums2 = nums.clone();
        List<Sorting> list = new ArrayList<>();
        list.add(new BubbleSort(nums));
        list.add(new InsertionSort(nums1));
        list.add(new SelectionSort(nums2));
        compareSorts(list);
    }
}
