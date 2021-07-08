package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class TargetSumTest {
    @Test
    public void countWays() {
        assertEquals(1, new TargetSum().countWays(new int[]{5}, 5));
        assertEquals(1, new TargetSum().countWays(new int[]{5}, -5));
        assertEquals(0, new TargetSum().countWays(new int[]{1,1,1,1}, 5));
        assertEquals(1, new TargetSum().countWays(new int[]{1,1,1,1,1}, -5));
        assertEquals(0, new TargetSum().countWays(new int[]{1,1,1,1,1,1}, 5));
        assertEquals(7, new TargetSum().countWays(new int[]{1,1,1,1,1,1,1}, -5));
        assertEquals(3, new TargetSum().countWays(new int[]{1,1,3,3,5,7}, 8));
        assertEquals(4, new TargetSum().countWays(new int[]{8,0,2,6,4}, -4));
        assertEquals(0, new TargetSum().countWays(new int[]{8,0,2,6,4}, 6));
        assertEquals(5, new TargetSum().countWays(new int[]{13,11,9,7,5,3,1}, -1));
        assertEquals(1, new TargetSum().countWays(new int[]{13,11,9,7,5,3,1}, 35));
        assertEquals(3407, new TargetSum().countWays(new int[]{55,32,17,48,21,67,62,12,17,71,42,64,51,45,78,57,54,58,74,34}, -65));
        assertEquals(0, new TargetSum().countWays(new int[]{55,32,17,48,21,67,62,12,17,71,42,64,51,45,78,57,54,58,74,34}, 66));
        assertEquals(1315, new TargetSum().countWays(new int[]{55,32,17,48,21,67,62,12,17,71,42,64,51,45,78,57,54,58,74,34}, -333));
        assertEquals(11, new TargetSum().countWays(new int[]{55,32,17,48,21,67,62,12,17,71,42,64,51,45,78,57,54,58,74,34}, 777));
    }
}
