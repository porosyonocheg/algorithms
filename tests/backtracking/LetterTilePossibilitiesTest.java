package backtracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class LetterTilePossibilitiesTest {
    @Test
    public void countPermutations() {
        assertEquals(1, new LetterTilePossibilities().countPermutations("M"));
        assertEquals(2, new LetterTilePossibilities().countPermutations("XX"));
        assertEquals(4, new LetterTilePossibilities().countPermutations("NT"));
        assertEquals(8, new LetterTilePossibilities().countPermutations("ZYZ"));
        assertEquals(15, new LetterTilePossibilities().countPermutations("ABC"));
        assertEquals(34, new LetterTilePossibilities().countPermutations("DRED"));
        assertEquals(89, new LetterTilePossibilities().countPermutations("TSTOS"));
        assertEquals(270, new LetterTilePossibilities().countPermutations("UUYYQQ"));
        assertEquals(7, new LetterTilePossibilities().countPermutations("WWWWWWW"));
        assertEquals(1840, new LetterTilePossibilities().countPermutations("EBMHMBE"));
        assertEquals(111987230, new LetterTilePossibilities().countPermutations("FFMXOJORSWBO"));
        assertEquals(1302061344, new LetterTilePossibilities().countPermutations("QWERTYUIOPAS"));
    }
}
