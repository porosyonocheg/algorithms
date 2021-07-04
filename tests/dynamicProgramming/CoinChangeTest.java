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
}
