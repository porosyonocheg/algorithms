package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortedVowelStringsTest {
    @Test
    public void countTest() {
        assertEquals(5, new SortedVowelStrings().count(1));
        assertEquals(15, new SortedVowelStrings().count(2));
        assertEquals(35, new SortedVowelStrings().count(3));
        assertEquals(70, new SortedVowelStrings().count(4));
        assertEquals(126, new SortedVowelStrings().count(5));
        assertEquals(210, new SortedVowelStrings().count(6));
        assertEquals(330, new SortedVowelStrings().count(7));
        assertEquals(1001, new SortedVowelStrings().count(10));
        assertEquals(10626, new SortedVowelStrings().count(20));
        assertEquals(46376, new SortedVowelStrings().count(30));
        assertEquals(135751, new SortedVowelStrings().count(40));
        assertEquals(316251, new SortedVowelStrings().count(50));
        assertEquals(455126, new SortedVowelStrings().count(55));
        assertEquals(557845, new SortedVowelStrings().count(58));
        assertEquals(720720, new SortedVowelStrings().count(62));
    }
}
