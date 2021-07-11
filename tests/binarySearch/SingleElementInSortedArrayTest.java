package binarySearch;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SingleElementInSortedArrayTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void getSingle() {
        assertEquals(1, new SingleElementInSortedArray().getSingle(new int[]{1,2,2}));
        assertEquals(0, new SingleElementInSortedArray().getSingle(new int[]{-1,-1,0}));
        assertEquals(5, new SingleElementInSortedArray().getSingle(new int[]{1,1,5,7,7}));
        assertEquals(-3, new SingleElementInSortedArray().getSingle(new int[]{-8,-8,-3,0,0,2,2}));
        assertEquals(7, new SingleElementInSortedArray().getSingle(new int[]{-11,-11,-3,-3,5,5,7,12,12}));
        assertEquals(54, new SingleElementInSortedArray().getSingle(new int[]{-1,-1,2,2,5,5,17,17,22,22,45,45,54}));
        assertEquals(-111, new SingleElementInSortedArray().getSingle(new int[]{-111,-110,-110,-99,-99,-90,-90,-83,-83,-72,-72,-55,-55,-38,-38,-23,-23}));
        assertEquals(512, new SingleElementInSortedArray().getSingle(new int[]{1,1,2,2,4,4,8,8,16,16,32,32,64,64,128,128,256,256,512,1024,1024,2048,2048,4096,4096}));
        assertEquals(312, new SingleElementInSortedArray().getSingle(new int[]{-272,-272,-194,-194,-145,-145,-101,-101,-92,-92,-70,-70,-66,-66,-48,-48,-39,-39,-22,-22,-14,-14,10,10,15,15,28,28,46,46,58,58,77,77,91,91,123,123,132,132,163,163,234,234,312,333,333,388,388,426,426,591,591,639,639,711,711}));
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Incorrect input array");
        new SingleElementInSortedArray().getSingle(new int[]{});
        new SingleElementInSortedArray().getSingle(new int[]{1});
        new SingleElementInSortedArray().getSingle(new int[]{1,1});
        new SingleElementInSortedArray().getSingle(new int[]{2,2,4,4,6,6});
    }
}
