package backtracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class BeautifulArrangementTest {
    @Test
    public void count() {
        assertEquals(1, new BeautifulArrangement().count(1));
        assertEquals(2, new BeautifulArrangement().count(2));
        assertEquals(3, new BeautifulArrangement().count(3));
        assertEquals(8, new BeautifulArrangement().count(4));
        assertEquals(10, new BeautifulArrangement().count(5));
        assertEquals(700, new BeautifulArrangement().count(10));
        assertEquals(4010, new BeautifulArrangement().count(12));
        assertEquals(24679, new BeautifulArrangement().count(15));
        assertEquals(435812, new BeautifulArrangement().count(18));
        assertEquals(8650900, new BeautifulArrangement().count(22));
        assertEquals(60035322, new BeautifulArrangement().count(24));
    }
}
