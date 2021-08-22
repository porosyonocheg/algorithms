package greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimumCostTreeFromLeafValuesTest {
    @Test
    public void getSum() {
        assertEquals(10, new MinimumCostTreeFromLeafValues().getSum(new int[]{2, 5}));
        assertEquals(32, new MinimumCostTreeFromLeafValues().getSum(new int[]{6, 2, 4}));
        assertEquals(53, new MinimumCostTreeFromLeafValues().getSum(new int[]{5, 1, 3, 7}));
        assertEquals(40, new MinimumCostTreeFromLeafValues().getSum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(75, new MinimumCostTreeFromLeafValues().getSum(new int[]{6, 2, 4, 3, 5, 1}));
        assertEquals(439, new MinimumCostTreeFromLeafValues().getSum(new int[]{15, 7, 7, 3, 2, 11, 11}));
        assertEquals(455, new MinimumCostTreeFromLeafValues().getSum(new int[]{10, 2, 10, 8, 2, 5, 1, 8, 9, 6}));
        assertEquals(1368, new MinimumCostTreeFromLeafValues().getSum(new int[]{1, 13, 8, 6, 11, 10, 1, 9, 8, 13, 1, 4, 6, 2, 8, 6, 4, 14, 1, 12}));
        assertEquals(2764, new MinimumCostTreeFromLeafValues().getSum(new int[]{6, 14, 5, 13, 14, 15, 5, 9, 4, 3, 10, 6, 1, 4, 6, 2, 7, 15, 3, 14, 4, 5, 14, 4, 1, 13, 6, 13, 3, 1, 6, 8, 9}));
        assertEquals(4069, new MinimumCostTreeFromLeafValues().getSum(new int[]{12, 8, 1, 12, 11, 13, 5, 14, 3, 11, 4, 7, 8, 1, 4, 7, 2, 3, 3, 12, 4, 5, 2, 13, 11, 14, 9, 9, 5, 14, 11, 14, 15, 9, 11, 14, 10, 5, 13, 15}));
    }
}
