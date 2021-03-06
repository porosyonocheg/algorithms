package binarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
    @Test
    public void getIndex() {
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{3},3));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{1},0));
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{3,1},3));
        assertEquals(1, sirsa.getIndexOfTarget(new int[]{3,1},1));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{3,1},2));
        assertEquals(2, sirsa.getIndexOfTarget(new int[]{5,1,3},3));
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{5,1,3},5));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{5,1,3},2));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{5,1,3},4));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{5,1,3},6));
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{0,2,4,6,8,12},0));
        assertEquals(5, sirsa.getIndexOfTarget(new int[]{0,2,4,6,8,12},12));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{0,2,4,6,8,12},-1));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{0,2,4,6,8,12},13));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{0,2,4,6,8,12},5));

        assertEquals(1, sirsa.getIndexOfTarget(new int[]{12,0,2,4,6,8},0));
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{12,0,2,4,6,8},12));
        assertEquals(5, sirsa.getIndexOfTarget(new int[]{12,0,2,4,6,8},8));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{12,0,2,4,6,8},-1));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{12,0,2,4,6,8},13));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{12,0,2,4,6,8},5));

        assertEquals(3, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},0));
        assertEquals(2, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},12));
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},6));
        assertEquals(5, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},4));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},-1));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},13));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{6,8,12,0,2,4},5));

        assertEquals(5, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},0));
        assertEquals(4, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},12));
        assertEquals(3, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},8));
        assertEquals(0, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},2));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},-1));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},13));
        assertEquals(-1, sirsa.getIndexOfTarget(new int[]{2,4,6,8,12,0},5));
    }

    @Test
    public void containsTarget() {
        assertTrue(sirsa.containsTarget(new int[]{5},5));
        assertFalse(sirsa.containsTarget(new int[]{1},0));
        assertTrue(sirsa.containsTarget(new int[]{3,1},3));
        assertFalse(sirsa.containsTarget(new int[]{3,1},2));
        assertTrue(sirsa.containsTarget(new int[]{3,1},1));
        assertFalse(sirsa.containsTarget(new int[]{1,3},2));
        assertTrue(sirsa.containsTarget(new int[]{1,3},1));
        assertTrue(sirsa.containsTarget(new int[]{1,3},3));
        assertTrue(sirsa.containsTarget(new int[]{7,3,5},7));
        assertTrue(sirsa.containsTarget(new int[]{7,3,5},5));
        assertFalse(sirsa.containsTarget(new int[]{7,3,5},4));
        assertFalse(sirsa.containsTarget(new int[]{7,3,5},6));
        assertFalse(sirsa.containsTarget(new int[]{7,3,5},8));
        assertTrue(sirsa.containsTarget(new int[]{3,5,3},5));
        assertTrue(sirsa.containsTarget(new int[]{3,2,3},2));
        assertFalse(sirsa.containsTarget(new int[]{3,1,3},2));
        assertTrue(sirsa.containsTarget(new int[]{1,2,3,4,5,6,7,8,9},9));
        assertTrue(sirsa.containsTarget(new int[]{1,2,3,4,5,6,7,8,9},1));
        assertTrue(sirsa.containsTarget(new int[]{0,1,0,0,0,0,0,0,0},1));
        assertTrue(sirsa.containsTarget(new int[]{0,0,0,0,0,0,0,1,0},1));
        assertTrue(sirsa.containsTarget(new int[]{0,0,0,0,0,0,0,0,1},1));
        assertTrue(sirsa.containsTarget(new int[]{1,0,0,0,0,0,0,0,0},1));
        assertTrue(sirsa.containsTarget(new int[]{2,1,2,2,2,2,2,2,2},1));
        assertTrue(sirsa.containsTarget(new int[]{2,2,2,2,2,2,2,1,2},1));
        assertTrue(sirsa.containsTarget(new int[]{2,2,2,2,2,2,2,2,1},1));
        assertTrue(sirsa.containsTarget(new int[]{1,2,2,2,2,2,2,2,2},1));
        assertTrue(sirsa.containsTarget(new int[]{1,1,5,11,11,15,1,1},5));
        assertTrue(sirsa.containsTarget(new int[]{1,1,5,11,11,15,1,1},15));
        assertFalse(sirsa.containsTarget(new int[]{1,1,5,11,11,15,1,1},12));
        assertFalse(sirsa.containsTarget(new int[]{1,1,5,11,11,15,1,1},16));
        assertFalse(sirsa.containsTarget(new int[]{1,1,5,11,11,15,1,1},2));
    }

    @Test
    public void getMinValue() {
        assertEquals(1, sirsa.getMinValue(new int[]{1}));
        assertEquals(-3, sirsa.getMinValue(new int[]{-3, 5}));
        assertEquals(-3, sirsa.getMinValue(new int[]{5, -3}));
        assertEquals(0, sirsa.getMinValue(new int[]{0, 2, 4}));
        assertEquals(0, sirsa.getMinValue(new int[]{4, 0, 2}));
        assertEquals(0, sirsa.getMinValue(new int[]{2, 4, 0}));
        assertEquals(-5, sirsa.getMinValue(new int[]{-5, 7, 12, 111}));
        assertEquals(-5, sirsa.getMinValue(new int[]{111, -5, 7, 12}));
        assertEquals(-5, sirsa.getMinValue(new int[]{12, 111, -5, 7}));
        assertEquals(-5, sirsa.getMinValue(new int[]{7, 12, 111, -5}));
        assertEquals(-17, sirsa.getMinValue(new int[]{-17, -12, -5, -1, 1, 3, 8, 16, 20}));
        assertEquals(-17, sirsa.getMinValue(new int[]{-12, -5, -1, 1, 3, 8, 16, 20, -17}));
        assertEquals(-17, sirsa.getMinValue(new int[]{1, 3, 8, 16, 20, -17, -12, -5, -1}));
    }

    @Test
    public void getMaxValue() {
        assertEquals(-1111, sirsa.getMaxValue(new int[]{-1111}));
        assertEquals(78, sirsa.getMaxValue(new int[]{67, 78}));
        assertEquals(78, sirsa.getMaxValue(new int[]{78, 67}));
        assertEquals(-3, sirsa.getMaxValue(new int[]{-12, -7, -3}));
        assertEquals(-3, sirsa.getMaxValue(new int[]{-3, -12, -7}));
        assertEquals(-3, sirsa.getMaxValue(new int[]{-7, -3, -12}));
        assertEquals(35, sirsa.getMaxValue(new int[]{2, 17, 22, 35}));
        assertEquals(35, sirsa.getMaxValue(new int[]{35, 2, 17, 22}));
        assertEquals(35, sirsa.getMaxValue(new int[]{22, 35, 2, 17}));
        assertEquals(35, sirsa.getMaxValue(new int[]{17, 22, 35, 2}));
        assertEquals(20, sirsa.getMaxValue(new int[]{-17, -12, -5, -1, 1, 3, 8, 16, 20}));
        assertEquals(20, sirsa.getMaxValue(new int[]{-12, -5, -1, 1, 3, 8, 16, 20, -17}));
        assertEquals(20, sirsa.getMaxValue(new int[]{1, 3, 8, 16, 20, -17, -12, -5, -1}));
        assertEquals(20, sirsa.getMaxValue(new int[]{-5, -1, 1, 3, 8, 16, 20, -17, -12}));
        assertEquals(20, sirsa.getMaxValue(new int[]{-1, 1, 3, 8, 16, 20, -17, -12, -5}));
        assertEquals(20, sirsa.getMaxValue(new int[]{3, 8, 16, 20, -17, -12, -5, -1, 1}));
        assertEquals(20, sirsa.getMaxValue(new int[]{8, 16, 20, -17, -12, -5, -1, 1, 3}));
        assertEquals(20, sirsa.getMaxValue(new int[]{16, 20, -17, -12, -5, -1, 1, 3, 8}));
        assertEquals(20, sirsa.getMaxValue(new int[]{20, -17, -12, -5, -1, 1, 3, 8, 16}));
    }
}
