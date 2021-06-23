package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {
    @Test
    public void isPossibleTest(){
        assertFalse(new PartitionEqualSubsetSum().isPossible(new int[]{2}));
        assertTrue(new PartitionEqualSubsetSum().isPossible(new int[]{1,1}));
        assertTrue(new PartitionEqualSubsetSum().isPossible(new int[]{1,5,11,5}));
        assertFalse(new PartitionEqualSubsetSum().isPossible(new int[]{1,3,2,5}));
        assertTrue(new PartitionEqualSubsetSum().isPossible(new int[]{7,39,13,2,11,9,1}));
        assertFalse(new PartitionEqualSubsetSum().isPossible(new int[]{1,1,4}));
        assertFalse(new PartitionEqualSubsetSum().isPossible(new int[]{123,251,785,473,659,347}));
        assertTrue(new PartitionEqualSubsetSum().isPossible(new int[]{7,15,22,8,30,14,10}));
        assertTrue(new PartitionEqualSubsetSum().isPossible(new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31}));
        assertFalse(new PartitionEqualSubsetSum().isPossible(new int[]{2,4,8,12,16,18,22}));
    }
}
