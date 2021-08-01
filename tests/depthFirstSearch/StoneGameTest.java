package depthFirstSearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StoneGameTest {
    @Test
    public void getMaxNumberOfStones() {
        assertEquals(5, new StoneGame().getMaxNumberOfStones(new int[]{5}));
        assertEquals(15, new StoneGame().getMaxNumberOfStones(new int[]{3,12}));
        assertEquals(8, new StoneGame().getMaxNumberOfStones(new int[]{1,7,2}));
        assertEquals(11, new StoneGame().getMaxNumberOfStones(new int[]{2,5,3,9}));
        assertEquals(25, new StoneGame().getMaxNumberOfStones(new int[]{6,3,7,12,8}));
        assertEquals(104, new StoneGame().getMaxNumberOfStones(new int[]{1,2,3,4,5,100}));
        assertEquals(57, new StoneGame().getMaxNumberOfStones(new int[]{19,6,19,9,16,9,4,5,7,10}));
        assertEquals(215, new StoneGame().getMaxNumberOfStones(new int[]{25,10,15,1,19,3,32,27,7,19,18,9,12,21,5,26,3,10,14,16,15,24,29,18,31}));
        assertEquals(1358, new StoneGame().getMaxNumberOfStones(new int[]{62,23,3,30,7,43,94,75,16,82,40,17,30,95,83,37,50,2,61,99,75,21,10,85,16,53,98,64,59,8,86,76,12,84,97,52,75,82,52,89,41,3,43,64,63,99,70,48,60,38}));
        assertEquals(9402, new StoneGame().getMaxNumberOfStones(new int[]{129,287,407,75,225,103,477,121,427,169,261,70,284,418,162,92,244,284,120,431,421,129,360,147,83,268,312,378,97,13,446,483,304,457,17,153,188,418,382,252,280,311,96,409,359,438,426,80,393,69,269,97,83,428,143,449,492,131,77,359,491,386,194,4,103,227,165,46,404,351,39,478,259,124,67}));
        assertEquals(25817, new StoneGame().getMaxNumberOfStones(new int[]{664,589,232,951,444,201,461,886,306,190,370,872,30,57,311,452,17,356,348,584,540,760,641,339,344,279,682,528,848,94,66,381,14,29,330,577,66,764,6,174,641,514,468,218,603,48,299,125,740,598,926,242,764,426,982,337,579,561,387,171,557,485,496,705,661,354,695,936,601,688,754,864,855,322,875,556,311,802,817,858,486,361,707,834,769,63,140,662,899,676,951,300,929,399,617,939,283,594,577,934}));
    }
}
