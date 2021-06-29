package binarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class KthSmallestElementInSortedMatrixTest {
    @Test
    public void get() {
        assertEquals(5, new KthSmallestElementInSortedMatrix().get(new int[][]{{5}}, 1));
        int[][] matrix = new int[][]{{1,7},{4,9}};
        assertEquals(7, new KthSmallestElementInSortedMatrix().get(matrix, 3));
        assertEquals(9, new KthSmallestElementInSortedMatrix().get(matrix, 4));
        matrix = new int[][]{{1,9,12},{9,12,13},{12,13,14}};
        assertEquals(1, new KthSmallestElementInSortedMatrix().get(matrix, 1));
        assertEquals(12, new KthSmallestElementInSortedMatrix().get(matrix, 5));
        assertEquals(14, new KthSmallestElementInSortedMatrix().get(matrix, 9));
        matrix = new int[][]{{-5, 0, 5, 10},{-3, 1, 10, 13},{-1, 5, 13, 15},{0, 10, 15, 18}};
        assertEquals(-5, new KthSmallestElementInSortedMatrix().get(matrix, 1));
        assertEquals(-3, new KthSmallestElementInSortedMatrix().get(matrix, 2));
        assertEquals(5, new KthSmallestElementInSortedMatrix().get(matrix, 8));
        assertEquals(15, new KthSmallestElementInSortedMatrix().get(matrix, 15));
        assertEquals(18, new KthSmallestElementInSortedMatrix().get(matrix, 16));
        matrix = new int[][]{{0,37,112,114,115,144,155,166,173,182},{107,114,116,130,146,151,158,167,179,197},{109,120,124,148,159,172,179,191,194,209},{126,138,144,161,166,182,189,192,202,213},{143,154,160,163,173,188,207,210,215,237},{145,165,170,173,178,199,216,219,220,249},{163,175,180,184,197,208,221,230,231,258},{176,178,183,210,222,232,241,243,248,266},{186,204,213,224,227,237,252,258,260,268},{193,211,224,232,233,254,264,276,279,293}};
        assertEquals(0, new KthSmallestElementInSortedMatrix().get(matrix, 1));
        assertEquals(37, new KthSmallestElementInSortedMatrix().get(matrix, 2));
        assertEquals(120, new KthSmallestElementInSortedMatrix().get(matrix, 10));
        assertEquals(188, new KthSmallestElementInSortedMatrix().get(matrix, 51));
        assertEquals(252, new KthSmallestElementInSortedMatrix().get(matrix, 90));
        assertEquals(279, new KthSmallestElementInSortedMatrix().get(matrix, 99));
        assertEquals(293, new KthSmallestElementInSortedMatrix().get(matrix, 100));
    }
}
