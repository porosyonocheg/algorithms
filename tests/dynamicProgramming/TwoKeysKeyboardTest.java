package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoKeysKeyboardTest {
    @Test
    public void getMinOperations() {
        assertEquals(0, new TwoKeysKeyboard().getMinOperations(1));
        assertEquals(2, new TwoKeysKeyboard().getMinOperations(2));
        assertEquals(3, new TwoKeysKeyboard().getMinOperations(3));
        assertEquals(4, new TwoKeysKeyboard().getMinOperations(4));
        assertEquals(5, new TwoKeysKeyboard().getMinOperations(5));
        assertEquals(8, new TwoKeysKeyboard().getMinOperations(15));
        assertEquals(17, new TwoKeysKeyboard().getMinOperations(99));
        assertEquals(184, new TwoKeysKeyboard().getMinOperations(543));
        assertEquals(46, new TwoKeysKeyboard().getMinOperations(999));
        assertEquals(21, new TwoKeysKeyboard().getMinOperations(1000));
    }

}
