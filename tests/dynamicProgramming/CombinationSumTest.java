package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class CombinationSumTest {
    @Test
    public void getCombinations() {
        assertEquals(0, new CombinationSum().getCombinations(new int[]{7}, 5));
        assertEquals(1, new CombinationSum().getCombinations(new int[]{7}, 7));
        assertEquals(2, new CombinationSum().getCombinations(new int[]{2,5}, 10));
        assertEquals(139, new CombinationSum().getCombinations(new int[]{5,3,13}, 33));
        assertEquals(8800329, new CombinationSum().getCombinations(new int[]{6,5,4,3}, 54));
        assertEquals(429992, new CombinationSum().getCombinations(new int[]{25,20,10,5,1}, 45));
        assertEquals(759848, new CombinationSum().getCombinations(new int[]{4,8,16,32,64,128,257}, 831));
        assertEquals(144166742, new CombinationSum().getCombinations(new int[]{123,787,341,224,96,173,438,155,397,45,246,802,198,267,87,529,610,877,69,713,347,112,511,385}, 999));
        assertEquals(84854699, new CombinationSum().getCombinations(new int[]{13,78,31,24,96,17,43,15,37,45,26,82,19,27,87,59,61,79,69,73,34,12,51,38}, 171));
        assertEquals(12876, new CombinationSum().getCombinations(new int[]{13,78,31,25,96,17,43,15,37,45,29,82,19,27,87,59,61,79,69,73,55,11,51,41}, 100));
        assertEquals(867086795, new CombinationSum().getCombinations(new int[]{9,7,3,1,11,13,15,17,19,23,21}, 1234));
    }
}
