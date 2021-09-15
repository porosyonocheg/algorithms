package dynamicProgramming;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class LargestSumOfAveragesTest {
    @Rule
    public ExpectedException ex = ExpectedException.none();

    @Test
    public void get() {
        assertEquals(2.00000, new LargestSumOfAverages().get(new int[]{2}, 1),0.000001);
        assertEquals(3.50000, new LargestSumOfAverages().get(new int[]{5,2}, 1),0.000001);
        assertEquals(7.00000, new LargestSumOfAverages().get(new int[]{5,2}, 2),0.000001);
        assertEquals(10.50000, new LargestSumOfAverages().get(new int[]{3,2,8}, 2),0.000001);
        assertEquals(14.00000, new LargestSumOfAverages().get(new int[]{1,3,5,7}, 3),0.000001);
        assertEquals(35.00000, new LargestSumOfAverages().get(new int[]{12,10,8,6,4}, 4),0.000001);
        assertEquals(71.90000, new LargestSumOfAverages().get(new int[]{3,15,4,10,5,18,13,19,11,18}, 5),0.000001);
        assertEquals(61.36364, new LargestSumOfAverages().get(new int[]{84,98,65,97,39,21,81,33,78,20,12,64,70,38,66,10,87,63,56,97,96,75}, 1),0.00001);
        assertEquals(580.20000, new LargestSumOfAverages().get(new int[]{84,98,65,97,39,21,81,33,78,20,12,64,70,38,66,10,87,63,56,97,96,75}, 7),0.000001);
        assertEquals(1350.00000, new LargestSumOfAverages().get(new int[]{84,98,65,97,39,21,81,33,78,20,12,64,70,38,66,10,87,63,56,97,96,75}, 25),0.000001);
        assertEquals(3973.09524, new LargestSumOfAverages().get(new int[]{54,89,960,619,305,269,587,423,415,249,187,844,604,1000,679,299,696,567,747,547,157,956,420,82,135,581,281,991,674,613,322,32,90,733,630,747,139,66,409,59,7,295,584,934,340,266,139,397,502,709,601,367,16,39,596}, 6),0.00001);
        assertEquals(93147.84167, new LargestSumOfAverages().get(new int[]{1866,7113,358,2865,3456,1802,2761,9856,726,5083,2169,1151,1819,5550,584,3487,206,201,8714,4649,6562,4002,7428,7313,5093,6317,3265,3117,3305,6928,2885,2041,9253,5414,4067,7100,3086,8961,6279,4622,379,5367,2186,5897,3168,9934,2536,6897,858,7238,795,8919,7278,1342,612,4510,1993,919,8769,9837,3739,8979,8580,6777,1296,393,3919,5452,2487,4275,1981,656,5093,2408,3731,3689,4436,9379,4537,4489,1148,4857,3958,7622,9180,3531,2833,9679,8554,3646,7912,4970,9492,752,9064,967,4602,9349,1818,4948}, 13),0.00001);
        ex.expect(IllegalArgumentException.class);
        ex.expectMessage("Invalid k");
        new LargestSumOfAverages().get(new int[]{1,2,3,4}, 0);
    }
}
