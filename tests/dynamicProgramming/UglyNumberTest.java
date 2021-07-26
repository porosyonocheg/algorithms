package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UglyNumberTest {
    @Test
    public void nthUglyNumber() {
        assertEquals(1, new UglyNumber().nthUglyNumber(1));
        assertEquals(2, new UglyNumber().nthUglyNumber(2));
        assertEquals(3, new UglyNumber().nthUglyNumber(3));
        assertEquals(4, new UglyNumber().nthUglyNumber(4));
        assertEquals(5, new UglyNumber().nthUglyNumber(5));
        assertEquals(12, new UglyNumber().nthUglyNumber(10));
        assertEquals(27, new UglyNumber().nthUglyNumber(17));
        assertEquals(128, new UglyNumber().nthUglyNumber(38));
        assertEquals(10800, new UglyNumber().nthUglyNumber(179));
        assertEquals(1968300, new UglyNumber().nthUglyNumber(576));
        assertEquals(210937500, new UglyNumber().nthUglyNumber(1234));
        assertEquals(2123366400, new UglyNumber().nthUglyNumber(1690));
    }
}
