package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KnightDialerTest {
    @Test
    public void getNumberOfCombinations() {
        assertEquals(10, new KnightDialer().getNumberOfCombinations(1));
        assertEquals(20, new KnightDialer().getNumberOfCombinations(2));
        assertEquals(46, new KnightDialer().getNumberOfCombinations(3));
        assertEquals(104, new KnightDialer().getNumberOfCombinations(4));
        assertEquals(240, new KnightDialer().getNumberOfCombinations(5));
        assertEquals(14912, new KnightDialer().getNumberOfCombinations(10));
        assertEquals(267287516, new KnightDialer().getNumberOfCombinations(50));
        assertEquals(198828747, new KnightDialer().getNumberOfCombinations(123));
        assertEquals(758728301, new KnightDialer().getNumberOfCombinations(1234));
        assertEquals(406880451, new KnightDialer().getNumberOfCombinations(5000));
    }
}
