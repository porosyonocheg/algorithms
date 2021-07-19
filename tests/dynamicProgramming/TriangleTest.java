package dynamicProgramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void minimumTotal() {
        List<List<Integer>> data = new ArrayList<>();
        data.add(Collections.singletonList(5));
        assertEquals(5, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(2));
        data.add(Arrays.asList(5, 4));
        assertEquals(6, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(0));
        data.add(Arrays.asList(3, 4));
        data.add(Arrays.asList(-1, -3, -2));
        assertEquals(0, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(1));
        data.add(Arrays.asList(2, 5));
        data.add(Arrays.asList(3, 4, -2));
        data.add(Arrays.asList(3, 1, 4, 2));
        assertEquals(6, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(0));
        data.add(Arrays.asList(3, 1));
        data.add(Arrays.asList(1, 3, 5));
        data.add(Arrays.asList(5, 3, -1, 1));
        data.add(Arrays.asList(1, 3, 5, 7, 9));
        assertEquals(8, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(3));
        data.add(Arrays.asList(2, 5));
        data.add(Arrays.asList(0, -1, 1));
        data.add(Arrays.asList(7, 3, 8, 5));
        data.add(Arrays.asList(-11, -9, -8, -6, -4));
        data.add(Arrays.asList(14, 13, 12, 9, 10, 11));
        assertEquals(8, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(-1));
        data.add(Arrays.asList(-2, -3));
        data.add(Arrays.asList(-4, -3, -2));
        data.add(Arrays.asList(-3, -4, -5, -6));
        data.add(Arrays.asList(-5, -4, -3, -2, -1));
        data.add(Arrays.asList(-4, -5, -6, -7, -8, -9));
        data.add(Arrays.asList(-6, -5, -4, -3, -2, -1, 0));
        assertEquals(-25, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(12));
        data.add(Arrays.asList(22, 45));
        data.add(Arrays.asList(31, 63, 18));
        data.add(Arrays.asList(65, 41, 56, 78));
        data.add(Arrays.asList(47, 91, 51, 73, 34));
        data.add(Arrays.asList(25, 17, 64, 36, 42, 82));
        data.add(Arrays.asList(99, 77, 62, 43, 87, 55, 35));
        data.add(Arrays.asList(52, 81, 39, 26, 71, 66, 44, 38));
        assertEquals(262, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(2));
        data.add(Arrays.asList(2, 3));
        data.add(Arrays.asList(2, 3, 4));
        data.add(Arrays.asList(2, 3, 4, 5));
        data.add(Arrays.asList(2, 3, 4, 5, 6));
        data.add(Arrays.asList(2, 3, 4, 5, 6, 7));
        data.add(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
        data.add(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9));
        data.add(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(18, new Triangle().minimumTotal(data));

        data = new ArrayList<>();
        data.add(Collections.singletonList(8));
        data.add(Arrays.asList(9, 8));
        data.add(Arrays.asList(10, 9, 8));
        data.add(Arrays.asList(11, 10, 9, 8));
        data.add(Arrays.asList(12, 11, 10, 9, 8));
        data.add(Arrays.asList(13, 12, 11, 10, 9, 8));
        data.add(Arrays.asList(14, 13, 12, 11, 10, 9, 8));
        data.add(Arrays.asList(15, 14, 13, 12, 11, 10, 9, 8));
        data.add(Arrays.asList(16, 15, 14, 13, 12, 11, 10, 9, 8));
        data.add(Arrays.asList(17, 16, 15, 14, 13, 12, 11, 10, 9, 8));
        assertEquals(80, new Triangle().minimumTotal(data));
    }
}
