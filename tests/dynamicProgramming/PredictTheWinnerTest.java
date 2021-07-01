package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class PredictTheWinnerTest {
    @Test
    public void getTheWinner() {
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{0}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{1,5}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{3,2}));
        assertFalse(new PredictTheWinner().getTheWinner(new int[]{1,7,5}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{2,5,3}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{2,1,3,2}));
        assertFalse(new PredictTheWinner().getTheWinner(new int[]{162,307,356,429,119,946,323,527,286,883,133}));
        assertFalse(new PredictTheWinner().getTheWinner(new int[]{3621,2937,494,1311,6983,3579,1500,870,199,5494,2908,474,394,4506,848,5218,1414,9438,3513}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{206,1791,6152,973,4847,9108,7303,8008,4994,8096,3749,3514,4480,2379,4588,5144,7816,5783,1224}));
        assertFalse(new PredictTheWinner().getTheWinner(new int[]{13,32,93,98,77,46,18,41,15,23,83,48,33,78,91,96,25,39,16,77,60,28,29,15,53,84,25,14,34,37,44,37,53}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{90,37,72,53,89,68,100,75,82,52,20,32,57,92,72,74,80,86,22,73,95,46,83,42,43,12,21,43,26,87,97,94,66}));
        assertFalse(new PredictTheWinner().getTheWinner(new int[]{317,65,856,484,487,95,933,328,237,804,887,705,808,226,960,527,282,325,984,42,786,77,701,607,814,876,938,513,851,986,557,358,645,380,793,316,961,526,53,422,327,349,514,877,376,874,888,242,610,814,515,326,36,681,573,482,988,820,544,53,552,153,238,670,479,311,632,187,134,255,467,65,59,467,89,166,945,260,259,9,402,814,760,742,705,59,448,253,845,663,20,78,560,941,204,36,736,714,229}));
        assertTrue(new PredictTheWinner().getTheWinner(new int[]{645,175,768,432,766,973,859,105,121,869,493,346,780,296,805,247,123,495,467,115,253,559,125,319,590,428,399,893,692,99,245,194,984,437,486,789,502,397,848,770,118,701,572,689,208,317,633,346,558,392,179,727,272,833,323,512,726,26,825,679,154,273,220,925,283,35,648,784,536,207,586,603,729,221,61,730,855,951,879,617,483,73,166,827,576,726,521,300,1,99,641,611,846,790,587,371,702,649,915}));
    }
}
