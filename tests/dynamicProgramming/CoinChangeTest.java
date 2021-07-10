package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoinChangeTest {
    @Test
    public void getNumberOfCoins() {
        assertEquals(0, new CoinChange().getNumberOfCoins(new int[]{5}, 0));
        assertEquals(1, new CoinChange().getNumberOfCoins(new int[]{5}, 5));
        assertEquals(-1, new CoinChange().getNumberOfCoins(new int[]{5}, 3));
        assertEquals(-1, new CoinChange().getNumberOfCoins(new int[]{2}, 5));
        assertEquals(3, new CoinChange().getNumberOfCoins(new int[]{5}, 15));
        assertEquals(5, new CoinChange().getNumberOfCoins(new int[]{1,2}, 9));
        assertEquals(3, new CoinChange().getNumberOfCoins(new int[]{1,2,5}, 11));
        assertEquals(4, new CoinChange().getNumberOfCoins(new int[]{2,3,5,10}, 24));
        assertEquals(5, new CoinChange().getNumberOfCoins(new int[]{1,2,3,5,8,10,15,25,50,100,200,500}, 783));
        assertEquals(124, new CoinChange().getNumberOfCoins(new int[]{1,2,3,7,10}, 1234));
        assertEquals(345, new CoinChange().getNumberOfCoins(new int[]{3,7,11,17,23,29}, 9999));
        assertEquals(754, new CoinChange().getNumberOfCoins(new int[]{13,3,1,7,11,31,23}, 23322));
    }

    @Test
    public void getNumberOfDifferentCombinations() {
        assertEquals(1, new CoinChange().getNumberOfDifferentCombinations(new int[]{5}, 5));
        assertEquals(0, new CoinChange().getNumberOfDifferentCombinations(new int[]{5}, 7));
        assertEquals(2, new CoinChange().getNumberOfDifferentCombinations(new int[]{1,5}, 7));
        assertEquals(4, new CoinChange().getNumberOfDifferentCombinations(new int[]{1,5}, 15));
        assertEquals(4, new CoinChange().getNumberOfDifferentCombinations(new int[]{1,2,5}, 5));
        assertEquals(21, new CoinChange().getNumberOfDifferentCombinations(new int[]{2,3,5,10}, 24));
        assertEquals(10154892, new CoinChange().getNumberOfDifferentCombinations(new int[]{3,5,7,10}, 3987));
        assertEquals(16551625, new CoinChange().getNumberOfDifferentCombinations(new int[]{9,8,7,6,5,4,3,2,1}, 127));
        assertEquals(9328787, new CoinChange().getNumberOfDifferentCombinations(new int[]{3,5,10,15}, 4999));
        assertEquals(0, new CoinChange().getNumberOfDifferentCombinations(new int[]{5,10,15,20}, 4999));
        assertEquals(268698267, new CoinChange().getNumberOfDifferentCombinations(new int[]{3,1,15,9,5,11,7,13}, 399));
    }
}
