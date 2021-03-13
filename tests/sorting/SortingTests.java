package sorting;
import arraySorting.BubbleSorting;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTests {
    @Test
    public void bubbleSortingTest() {
        int[] nums = {9,1,5,2,7,3,11,4,6,10,8};
        int[] result = {1,2,3,4,5,6,7,8,9,10,11};
        long t1 = System.nanoTime();
        new BubbleSorting(nums).sort();
        long t2 = System.nanoTime();
        assertArrayEquals(result, nums);
        long diff = t2-t1;
        System.out.println("The time of Bubble Sorting is: " + diff);
        nums = new int[]{9,1,5,2,7,3,11,4,6,10,8};
        long e1 = System.nanoTime();
        Arrays.sort(nums);
        long e2 = System.nanoTime();
        System.out.println("The time of Arrays Sorting is: " + (e2-e1));
        System.out.println("Arrays Sorting is faster : " + (diff - e2 + e1));
    }
}
