package backtracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class PartitionToEqualSumSubsetsTest {
    @Test
    public void isPossible() {
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{2}, 1));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{2,3}, 1));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{1,1}, 2));
        assertFalse(new PartitionToEqualSumSubsets().isPossible(new int[]{1,2}, 2));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{3,1,2}, 2));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{1,3,8,6,5,4,6,2,7}, 3));
        assertFalse(new PartitionToEqualSumSubsets().isPossible(new int[]{1,-1,14,-2}, 3));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{4,3,2,3,5,2,1}, 4));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{12,8,3,7,10,4,15,9,17,5}, 2));
        assertFalse(new PartitionToEqualSumSubsets().isPossible(new int[]{12,8,3,7,10,4,15,9,17,5}, 5));
        assertTrue(new PartitionToEqualSumSubsets().isPossible(new int[]{6,-1,2,-3,1,-2}, 3));
        assertFalse(new PartitionToEqualSumSubsets().isPossible(new int[]{-5,2,4,8,-2,0,12,3,-11,15,-4,7,10,-17,1,22,-6,1}, 10));
    }
}
