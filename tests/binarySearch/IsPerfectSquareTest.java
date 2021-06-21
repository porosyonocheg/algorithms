package binarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsPerfectSquareTest {
    @Test
    public void checkTest() {
        assertTrue(new IsPerfectSquare().check(1));
        assertTrue(new IsPerfectSquare().check(4));
        assertTrue(new IsPerfectSquare().check(16));
        assertTrue(new IsPerfectSquare().check(64));
        assertTrue(new IsPerfectSquare().check(100));
        assertTrue(new IsPerfectSquare().check(144));
        assertTrue(new IsPerfectSquare().check(547560000));
        assertTrue(new IsPerfectSquare().check(1877748889));
        assertTrue(new IsPerfectSquare().check(2147395600));
        assertFalse(new IsPerfectSquare().check(0));
        assertFalse(new IsPerfectSquare().check(-9));
        assertFalse(new IsPerfectSquare().check(2));
        assertFalse(new IsPerfectSquare().check(111));
        assertFalse(new IsPerfectSquare().check(2147483647));
        assertFalse(new IsPerfectSquare().check(547551504));
    }
}
