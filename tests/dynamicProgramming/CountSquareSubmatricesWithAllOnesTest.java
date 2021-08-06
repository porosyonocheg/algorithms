package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountSquareSubmatricesWithAllOnesTest {
    @Test
    public void countSquares() {
        assertEquals(1, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{1}}));
        assertEquals(2, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{1,0,1}}));
        assertEquals(0, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{0},{0},{0},{0}}));
        assertEquals(7, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{1,0,1},{1,1,0},{1,1,0}}));
        assertEquals(30, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
        assertEquals(17, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{0,0,0,0,1,0,1,0,0},{1,1,0,1,0,0,0,1,0},{1,1,0,0,0,0,1,0,0},{1,0,0,0,1,0,1,0,0},{0,1,0,0,1,0,1,0,1}}));
        assertEquals(90, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{1,0,1,0,1,1,1,0,1,0},{0,0,0,0,1,0,0,0,0,1},{1,1,1,0,0,1,1,1,1,1},{0,0,1,0,1,1,1,1,0,1},{0,0,1,0,0,1,1,0,0,1},{1,1,1,1,0,1,1,1,0,0},{1,1,0,1,0,0,1,0,1,1},{1,1,0,1,1,1,1,0,1,0},{0,0,0,1,0,0,1,1,1,1},{0,0,1,1,1,0,0,1,0,0},{1,0,0,1,0,0,1,1,0,1},{1,0,0,0,0,1,1,1,1,1},{1,1,0,0,1,0,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,0,0,0,0,0,0,0,0,1},{1,0,1,0,1,0,0,0,1,1}}));
        assertEquals(646, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{0,0,0,0,1,1,1,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,1,0,0},{0,0,0,1,1,1,1,1,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1},{0,1,0,1,0,1,0,1,1,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,0,1,0,1},{1,0,0,1,1,1,0,0,1,1,0,0,0,1,0,1,1,0,0,0,1,1,1,0,1,1,1,0,1,0,0,0,0},{0,1,1,0,0,1,0,0,0,0,0,1,1,0,0,1,0,1,1,1,0,0,0,1,0,1,1,0,1,1,0,1,0},{0,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,0,1,0,1,0,1,0},{1,1,0,0,1,0,1,1,0,0,1,0,1,0,0,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1,1},{1,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,0,0},{1,1,1,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,0,1,0,1,0,1,0},{0,1,0,0,1,0,0,0,0,0,1,1,1,0,1,0,0,0,1,0,0,0,1,0,1,1,1,0,1,1,1,1,0},{1,1,0,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,0,1,1,1,1,1,1,0},{0,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1,0,1,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0},{1,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1,0,0,1,1,1,1,0,0,1,1,0},{0,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,1,0,0,0,1,1,1,0,0,1,1,1,0,1,0},{0,1,1,0,0,1,1,1,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0},{0,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,0,0,1,0,1,0,1,1,1,1,1,1,1,0,1},{0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,0,0,0,1,1,1},{0,1,1,1,1,0,1,0,0,1,0,0,0,0,1,1,1,1,0,1,0,1,0,1,0,0,1,1,0,0,1,1,0},{1,1,0,1,1,1,1,0,0,1,0,1,1,1,1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0},{1,1,0,1,0,1,1,0,1,1,0,0,1,0,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0,0,0,1,0},{0,0,0,0,1,1,1,0,1,0,0,1,0,0,1,1,0,0,0,1,1,0,1,1,1,0,0,1,0,0,1,1,1},{1,0,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,0,1,0,0,1},{1,0,1,1,1,0,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0},{1,1,1,1,1,0,1,1,1,0,0,0,0,1,0,0,0,0,1,0,0,0,1,1,1,0,0,0,1,1,1,1,0},{0,0,1,1,0,0,1,1,0,1,0,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,0,1,0,1,1,0},{0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,1,1,0,0,1},{0,1,0,0,1,1,0,0,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0,0,1,0,1,1,1,1,1,0,0},{1,1,1,0,1,1,0,0,0,1,1,1,0,0,0,0,0,1,0,0,1,1,1,1,1,1,0,1,0,1,0,1,0},{0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,0,0,0,1,1,0},{0,1,0,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,1,0,0,1,0,1,1,0,0,1,0,1,1,0},{1,0,0,0,1,0,0,1,1,1,1,0,1,1,0,1,1,0,0,1,1,1,1,1,0,1,1,1,1,1,0,0,0},{1,0,1,1,1,1,0,1,0,0,1,1,0,1,0,1,0,1,0,0,1,1,0,0,1,0,1,0,1,1,0,0,0},{1,1,0,1,1,1,1,1,0,0,0,0,0,1,0,1,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,1,1}}));
        assertEquals(2233, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{0,0,1,0,1,1,0,1,1,0,1,0,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1,1,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,1,0,0,1,1,1,0,1,1,0,0,1,1,0,0,1,0,0,0,1,0,1,0,0,0,1},{0,1,0,0,1,1,0,1,0,0,0,0,0,1,1,1,0,1,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,1,0,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,0,0,0,1,1,0,1},{0,0,1,0,0,0,1,1,0,0,1,0,0,1,0,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,1,1,0,0,0,1,0,1,1,0,1,0,1,1,1,1,0},{0,1,1,1,1,0,0,0,1,0,1,1,0,1,1,0,1,1,0,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,0,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,1,0,0,1,1,0,1,1,0,1,0,1,0,0,0,1},{1,0,1,1,1,1,0,1,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,0,0,1,0,0,1,1},{1,0,1,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,1,0,1,1,0,1,0,1,1,1,0,0,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,0},{1,1,0,0,0,1,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,0,0,1,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,1,1,0,1,0,1,0,1,0,0,1,1,1,0,1,1,1,1,0,1,0,1},{1,1,0,0,1,0,1,1,1,1,1,1,0,1,0,0,0,0,0,1,1,1,0,0,1,0,1,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,0,1,0,0,1,0,1,0,0,1,1,0,0,1,1,1,0},{1,1,0,1,0,0,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0,1,0,0,1,0,1,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,1,1,1,0,1,0,0,1,0,0,0,1,0,1,0},{1,0,1,1,0,0,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1,1,1,0,1,0,0,0,1,1,0,0,1,1,0,0,0,1,0,0,1,1,1,1,1},{0,1,0,0,1,1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,0,1,1,1,1,0,1,1,1,0,0,1,1,0,1,0,0,0,0,0,1,1,0,1,0,0,1,0,0,1,1,1,1,1,0,1,0,0,0,1,0,0,0,1,1,1,0,0,1},{0,1,1,0,1,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,0},{0,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,0,1,1,0,0,0,1,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,1,1,0,1,1,1,1,1,1,0,1,0,0,1,1,0},{0,0,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,1,0,1,1,1,1,1,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,0,1,0,1,1,1,0,0,0,1,0,1,1},{0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,1,0,1,0,1,1,1,1,1,0,0,1,1,0,1,1,1,1,0,0,0,0,0,1,1,1,1,0,1,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1,0,1},{1,0,1,1,0,0,0,0,0,1,0,0,0,0,1,0,1,1,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,1,0,1,1,1,0,1,1,1,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,0,1,0,1,0,1,1,0,1,0,0},{0,0,0,0,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,0,1,1,0,1,1,1,1,1,0,1,0,0,0,0,1,1,0,1,0,1,0,1,1,0,0,1,0,1,1,1,1,0,0,0,0,1},{0,1,0,1,0,1,1,0,1,0,0,1,1,1,0,0,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,0,1,0,1,1,1,0,1,1,0,1,0,0,0,0,1,0,1,0,1,0,1,1,0,1,0,0,1,0},{1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1,1,1,0,1,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,0,1,0,0,0,1,1,0,0,0,1,1,1,1,0,0},{0,0,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,1,1,1,1,1,0,1,0,0,1,1,0,0,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,1,1,1,0,0,0},{0,1,1,1,0,1,1,0,0,0,1,1,0,1,0,1,0,0,1,1,0,1,1,1,0,1,1,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,0,1,1},{1,0,1,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,1,1,0,1,0,0,0,0},{0,1,0,0,1,0,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1,0,0,1,1,1,1,1,0},{1,1,0,1,0,1,0,1,0,0,1,1,0,0,1,0,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,0,1,1,1,0,1,0,1,1,0,1,1,0,0,0,0,1,0,0,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,1,0,0,1},{0,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,0,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,0,1,1,0,0,1,1,1,0,1,0,0,0,1,1,0,0,0,0,1,1},{1,0,1,0,1,1,1,0,1,0,0,0,0,1,0,0,1,1,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,1,0,0,1,1,1,0,1,1,0,0,1,1,0,0,1,1},{1,0,0,1,0,1,1,0,0,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,0,1,1,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0,1,1,1,1,1},{0,1,0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,1,0,1,0,0,0,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,0,1,1,1},{0,1,0,1,0,1,1,1,0,1,1,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,0,0,0,1,1,1,0,1,1,0,1,0,0,1,0,1,0,0,0,1,0,1,1,1,1,1,0,0,1,0,1,1,0,1,1,0,0,0,1,1,1,1,0,1,1},{1,0,0,0,1,1,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,0,0,0,1,1,0,1,0,0,1,1,1,1,1,0,0,1,1,0,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,1,1,0,0,1,0,1,1,1,1,1},{1,0,0,1,0,1,0,1,1,0,1,1,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,1,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,1,1,0,1,1,1},{1,1,1,0,0,0,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,1,0,0,1,0,0,1,0,0,1,1,0,0,0,0,1,0,0,1,0,1,1,0,0,0,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,0,1,0,1,0},{0,0,1,1,1,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1,0,0,0,1,1,1,0,1,1,0,1},{0,1,0,1,0,0,0,1,0,0,1,0,1,1,1,1,0,0,0,0,0,1,0,0,1,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,0,0,0,1,1,1,1,0,1,0,0,1,0,1,1,0},{0,0,0,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,1,1,0,1,1,1,1,1,0,0,1,0,1,0,0,0,1,1,0,1,0,0,1,1,1,0,1,0,0,0,0,1,0,1,1,1,0,0,0,1,0,0,1,0,1,0,0,1,1,0,0,1,1,1},{1,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,0,0,0,1,1,1,0,1,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,1,1,0,1,1,1,0,1,0,1,0},{0,0,1,0,0,0,0,0,0,1,0,1,1,0,0,1,0,0,1,1,0,0,1,0,1,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,1,0,1,1,0,1,1,1,1,0,0,1,0,1,0,0,0,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1},{1,0,1,0,1,0,1,1,0,1,1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,1,0,1,0,0,1,1,0,0,1,0,0,0,0,1,1,0,0,1,0,1,1,0,1,0,1,1,1,1,1,0,1,0,0,1,0,0,0,0,0,1,0,1,1},{0,0,1,0,0,1,0,1,0,1,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,0,1,1,0,1,0,1,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1},{1,0,1,1,0,1,0,1,0,0,1,1,1,0,0,0,1,1,1,1,0,1,1,0,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,0,1},{1,1,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,0,0,1,1,0,0,0,1,1,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,0,0,0,1,1,0,1,0,1,1,1,1,1,0,0,0,0},{0,1,1,0,0,0,1,1,1,1,0,1,0,0,0,0,0,0,0,1,1,0,0,1,1,0,0,0,0,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0},{0,0,0,0,1,1,1,1,1,1,1,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,1,1,0,1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,0,1,0,1},{1,0,1,0,1,1,1,0,1,0,0,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,0,0,1,0,1,1,0,0,0,1,0,1,0,1,1,0,0,1,0,0},{1,1,0,1,1,1,1,0,1,1,1,1,0,0,0,1,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,0,1,1,0,1,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,1,0,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1},{0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,1,1,1,0,0,0,0,1,1,1,1,1,0,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,1,0,0,0,1,0,0,1,0,1,0,1,1,0,1,0,0,0,1,1},{0,0,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,0,1,1,0,1,1,1,0,1,0,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,0,1,1,1},{0,1,0,1,0,0,1,0,1,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,1,1,0,1,1,0,1,1,1,0,1,1,1,0,1,0,1,0,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,1,0,1,1,0,0,0,0,1,0,0,0,0},{1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,0,0,0,1,0,0,0,1,1,1,1,0,1,0,1,1,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0},{0,1,1,0,0,1,0,0,0,0,1,0,0,1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,1,0,0,1,1,0,1,1,1,0,0,0,1,0,0,0},{1,1,0,0,0,0,1,1,1,0,0,1,0,1,0,1,1,1,0,1,0,0,1,1,1,1,1,0,1,1,1,0,1,1,0,0,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0},{0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,0,1,0,0,0,0,1,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,1},{1,1,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,1,1,0,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,0,0,1,0,0,0,0,0,1,0,1,1,1,0,0,0,1,0,1,1,1,0},{1,1,0,0,1,0,1,1,1,1,0,1,0,0,1,0,0,1,0,1,0,1,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,1,0,1,0,1,0,1,1,0,0,1,1,1,0,0,1,0,1,1,0,0,1,0,1,1},{0,0,0,0,1,1,0,0,1,0,1,0,0,1,0,0,0,1,0,1,1,1,1,1,0,0,0,1,0,1,0,0,0,1,1,1,0,0,0,0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,0,1},{0,1,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,1,1,1,1,1,0}}));
    }

    @Test
    public void countSquaresII() {
        assertEquals(6131, new CountSquareSubmatricesWithAllOnes().countSquares(new int[][]{{1,0,1,0,0,1,0,1,1,0,0,0,1,1,1,0,0,0,1,1,0,0,1,1,0,1,0,1,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,1,1,0,1,0,0,1,1,1,1,0,1,1,0,0,1,1,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,1,1,0,0,0,0,0,1,1,0,0,0},{0,0,1,1,0,1,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,1,0,1,1,1,1,0,0,1,0,0,0,0,1,1,0,1,1,1,0,0,1,1,1,0,0,0,1,1,0,0,1,0,1,1,0,1,0,1,0,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,1,0,0,0},{1,0,0,1,0,1,1,0,1,1,0,1,1,0,1,0,0,1,1,1,0,0,0,1,1,0,1,1,0,1,1,1,0,1,0,0,1,1,0,1,0,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,1,1,1,1,0,0,0},{1,1,1,0,0,0,1,1,0,0,1,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,1,1,1,0,1,1,1,0,0,1,0,1,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,1,1,1,0,1,0},{1,1,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,1,0,1,0,0,1,0,0,0,0,1,0,0,1,1,0,1,1,1,0,1},{1,1,1,0,0,1,0,1,1,0,1,1,1,1,1,0,1,0,0,0,0,0,1,1,0,0,1,1,1,1,1,1,0,1,1,0,0,1,1,0,1,1,0,1,0,1,1,0,1,1,0,0,1,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,1,0,1,0,0,1,1,1,0,0,0,1,1,0,0,0,0,0,1,1,0,1,1,0,1,1,1,1},{1,0,0,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,0,0,1,1,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,0,1,1,0,1,0,1,0,1,1,0,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0},{0,0,0,1,1,1,0,0,1,1,1,0,1,1,0,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,1,0,1,0,1,0,0,0,1,1,1,1,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,1,1,1,0,0,1,1,1,1,1,1,0},{1,1,0,1,1,0,0,1,0,0,0,0,1,1,0,0,0,1,1,0,1,0,1,1,0,0,1,1,0,1,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,0,0,1,1,0,0,0,0,1},{0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,1,1,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,1,0,1,1,1,1,1,0,0,0,0,1,0,0,1,1,1,1,0,1,1,0,1,1,1,1,0,0,0,1,1,1,1,0,0,0,1,1,0,0,1,0,0,1,1,0,0,1,0},{0,0,0,0,0,0,1,0,1,1,0,0,0,1,0,1,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,1,0,0,1,1,0,0,1,1,0,1,0,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,0,1,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,1,1,1,1},{0,0,0,0,0,0,1,0,0,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,1,1,1,0,0,1,1,0,0,0,1,0,1,1,1,1,0,0,1},{0,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,1,1,0,0,1,1,1,0,0,1,0,1,0,1,0,1,1,1,1,1,1,0,0,0,0,0,0,1,1,0,1,1,0,1,1,0,1,0,1,1,0,1,0,1,1,0,0,0,0,0,1,0,0,1,1,1,0,0,1,0,0,0,0,1,1,1,0,1,1,0,1,0,0,1,1,1,1,1,0,1,0},{0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,0,1,1,1,1,0,0,0,1,1,1,1,1,0,0,1,1,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,1,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,1,1,0,1,1,0,0,1,1,0,1,0,1,1,0,1,0,0,1,0,1,0,0,1,0,0,1,1,0,1,0,1,1,0,0,0,0,0,0,1,0,0,1,1,0},{1,1,1,1,0,1,0,1,0,0,0,1,1,0,0,1,1,0,1,0,1,1,0,0,1,0,1,0,0,1,0,0,0,0,0,1,1,0,0,1,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,0,1},{1,0,0,0,1,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,1,0,1,1,0,0,0,1,1,1,0,0,1,0,1,1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,1,1},{1,1,0,1,0,0,1,0,1,1,1,1,0,0,1,0,0,1,1,1,0,0,0,0,0,1,1,1,1,0,0,1,1,0,1,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,0,1,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0},{1,1,0,0,1,1,1,1,1,0,1,0,0,0,1,1,1,0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,0,1,0,0,1,1,0,0,1,1,1,1,0,0,1,0,0,1,1,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,1,1,1,1,1,0,1,0,1,0,0,0,0,1,1,0,1,1,0,0,0,1,0,0,0,1,0,0,0,0,1},{0,1,1,0,1,0,0,1,1,1,1,0,0,1,0,1,0,0,0,1,0,1,0,0,1,0,0,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,0,1,1,1,1,1,1,1,0,1,1,0,0,1,0,0,1,0,0,0,0,1,0,0,1,1,0,0,1,0,1,1,0,1,1,0,0,0,1},{0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,0,1,1,0,1,1,0,0,1,1,0,0,1,0,1,0,0,1,0,0,1,1,0,1,0,0,1,1,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,1,0,1,1,1,0,0,1,1,1,0,0,1,1,0,1,1,0,0,0,1,1,0,1},{1,1,0,0,1,0,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,0,0,1,1,0,0,1,0,0,0,1,0,0,0,1,1,0,1,0,1,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,0,1,1,0,1,0,1,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,1,0,0,1,0,0,1,1,1,0,0,0,1,1,1,1,0,1,0,1,0},{0,1,1,1,1,1,1,1,0,0,1,0,1,1,0,1,1,1,0,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1},{0,1,1,0,0,0,1,1,0,0,1,1,0,0,1,1,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,1,0,0,0,1,1,1,0,1,1,0,1,0,1,1,1,1,1,1,0,1,1,0,0,0,0,1,1,0,1,0,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,1,1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0},{1,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,0,1,0,1,1,1,0,0,0,1,1,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,1,1,1,0,0,1,0,0,0,1,0,0,0,0,0,1,1,0,0,1,0,0,0,1,0,0,0,1},{0,0,1,0,1,0,0,0,1,0,1,1,1,1,0,1,1,0,1,1,1,0,0,1,0,1,1,0,0,1,1,0,0,1,1,0,1,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,1,0,0,0,1,0,0,0,1,1,1,1,1,0,0,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,1,1,0,0,1,0,0,0,0,1,1,1,0,0},{1,1,0,0,0,0,0,1,0,0,1,0,0,1,1,0,1,1,0,1,0,1,1,1,0,1,1,0,1,1,1,0,0,0,1,1,0,0,1,0,0,1,1,1,0,0,0,1,1,0,0,1,0,0,1,0,1,1,1,1,0,1,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,1,0,1,0,1,0,0,1,1,0,1,0,0,0,1,0,0},{1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,1,1,0,0,1,1,1,0,0,0,1,0,1,0,0,0,0,0,1,1,1,0,0,0,0,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0},{0,1,1,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0,0,0,0,1,0,0,1,1,0,1,0,0,1,1,1,1,0,1,0,0,0,1,1,1,0,0,1,0,1,1,1,1,0,1,0},{0,0,1,1,1,1,1,1,1,0,0,0,1,1,0,1,1,1,0,0,0,1,1,0,1,0,0,0,0,1,0,0,0,0,1,0,1,1,1,0,1,1,1,0,0,1,0,1,0,0,1,1,0,1,1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,1,0,0,0,0,0,0,1,1,1,0,1,1,1,0,1,1,1},{1,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,1,1,1,1,1,0,1,1,0,0,0,1,0,1,1,1,0,0,1,0,1,0,1,1,0,0,1,0,1,1,0,0,1,0,0,0,0,0,1,0,1,1,1,1,0,0},{1,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0,0,0,1,0,0,1,0,0,0,1,0,1,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,1,0,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,1,1,0,1,0,1,1,0,1,0,0,1},{0,1,1,1,0,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,0,1,0,0,0,1,0,1,0,0,1,0,1,0,0,1,0,0,1,1,1,1,0,1,0,0,1,1,1,0,0,0,1,0,0,1,0,0,1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0},{1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,1,1,0,0,1,1,0,1,1,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,0,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,0,1,0,0,0,0,1,0,1},{0,1,1,0,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,1,0,1,1,0,0,1,1,1,0,0,1,1,0,1,0,0,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,0,1,0,0,0,0,0,1,0,1,1,0,0,1,0,0},{1,0,0,1,1,0,1,1,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,1,0,1,1,1,1,1,0,0,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,0,0},{0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,0,1,1,0,1,1,1,1,0,0,1,0,0,0,0,1,0,1,1,1,1,1,0,0,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,1,1,1,0,1,1,1,1,1,0},{0,1,0,0,0,1,1,0,1,0,0,0,0,1,0,1,1,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,1,1,0,1,0,0,1,1,1,0,1,1,1,0,0,0,1,1,0,1,1,0,0,1,0,0,0,0,0,1,1,1,1,1,1,0,0,1,0,0,0,0,1,0,1,1,0,1,1,0,0},{1,1,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1,0,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,0,1,1,0,1,1,0,1,1,1,1,0,0,1,0,0,1,0,1,1,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,0,1,1,1,0,1,0},{0,1,1,0,0,1,0,0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,0,0,0,1,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,0,0,0,1,1,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,1,0,0,1,1,0,0,1,0,0,1,1,1,0,0,0,0,1,0,1,0},{1,1,0,1,0,1,1,1,0,0,1,0,0,1,1,1,1,0,0,1,1,1,0,1,0,1,1,1,0,1,0,0,1,0,1,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,1,1,1,0,1,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0,1,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,1,0},{1,1,1,1,1,0,0,1,1,1,1,0,1,0,0,0,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,1,1,0,1,1,0,0,1,0,1,1,1,1,1,0,1,1,0,1,1,1,0,1,0,0,1,0,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,1,0,0,0,1,1,1,0,1,1,1,1,1,1,0,0,0,0},{1,1,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,1,0,0,1,0,0,0,1,0,1,1,0,0,0,0,1,1,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,0,1,1,1,0,0,0,0,0,1,1,1,0,1,0,0,1,0,1,1,1,1,0,0,1,1,1,0,0,0,0,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0},{1,1,0,1,0,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,0,1,1,1,0,0,1,0,1,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,1,1,0,1,1,1,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,1,1,0,1,1,0,1,0,1,0,1,1},{0,0,1,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,0,1,0,0,1,1,0,1,0,1,0,0,1,1,0,0,1,1,1,0,1,1,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,1,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,0},{0,1,1,0,1,1,0,0,1,0,1,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,0,1,1,0,1,1,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1,1,1,1,0,1,0,0,1,0,1,1,0,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,0,0,0,1,1,1,0,1,0,0,1,1,0,0,1,1,1,1},{1,0,0,1,0,0,1,0,0,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,1,0,1,1,0,1,1,0,0,1,0,0,0,0,1,1,0,0,0,1,1,1,1,0,0,1,1,1,1,0,1,1,0,0,1,1,1,0,0,1,1,1,0,1,1,1,0,1,1,0,0,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,1},{1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,1,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,1,1,0,0,1,0,0,1,1,1},{1,0,0,0,1,1,0,1,1,0,1,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,1,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,0,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,0,1,1,0,0,1,1,1,0,1,0,1,0,0,1,0,1,1,1,1},{0,1,1,0,0,1,0,0,1,0,1,1,0,1,1,1,1,0,1,1,0,0,1,0,1,1,1,0,1,1,0,0,0,1,1,1,0,1,0,1,0,0,1,1,0,0,0,0,0,1,1,1,1,1,0,1,1,1,0,0,1,1,1,0,1,0,1,1,0,0,1,0,1,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,0,1,1,0,1,0,0,1,1,0,1},{1,1,0,0,1,1,1,1,0,0,1,1,0,0,1,1,1,1,1,1,0,0,1,0,0,1,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,0,0,0,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,1,0,0,0,1,1,1,0,0,0,0,1,0,0,0,0,1,0,1,1,1,0,1,1,1,1,0,1},{0,0,0,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,0,1,0,1,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,1,0,0,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,0,1,0,1,0,1,0,0,1,1,0,0,1,0,0,1,1,1,1,1,0,0,1,1,0,0},{0,0,1,0,0,0,0,0,1,0,1,1,0,0,0,1,1,1,1,0,1,1,1,0,0,1,1,0,0,1,1,0,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,0,1,0,1,0,0,0,0,0,1,1,0,0,1,0,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,1,0,0,1,1,0},{0,0,0,1,0,1,1,0,0,0,1,0,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,1,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,0,1,0,0,0,0,0,1,1,0,0,0,0,1,0,1,0,0,1,1,1},{1,1,1,1,1,1,1,0,1,1,0,1,0,0,1,0,0,1,1,1,1,0,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,0,0,0,0,1,1,1,1,0,1,0,1,0,0,1,1,0,0,1,1,1,1,1,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1},{0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,1,0,0,1,1,0,1,0,0,1,0,0,1,1,1,1,1,1,0,0,1,1,0,0,0,1,0,0,1,0,1,1,1,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,1,1,0,1,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,0,0,1,1,1,0,1,0,0,0,0,0},{0,0,0,0,1,1,0,0,1,1,1,1,0,1,1,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,0,0,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0},{0,1,0,1,1,0,1,0,1,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,0,0,0,0,1,1,1,0,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,0,0,1,0,1,1,1,1},{1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,1,1,0,1,0,0,0,1,0,1,1,1,0,0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,1,0,0,1,0,0,1,1,0,0,1,1,1},{1,1,1,0,0,1,0,0,1,1,1,0,1,0,0,0,1,1,0,0,1,0,0,0,0,0,1,0,1,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,0,1,1,1,0},{1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,0,1,1,1,0,1,0,1,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,0,1,1,0,0,1,0,0,1,0,1,1,1,0,0,1,1,0,0,1,0,1,0,1,1,0,1,1,0,1,0,0,0,0,0,1,0,1,0,0,1,1,1,0,1,0,1,1,1,0,0,0,1,1,0},{0,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,1,0,0,0,1,1,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,0,0,0,1,1,0,1,1,1,0,0,0,1,1,0,1,1,1,1,0,0,1,1,0,1,1,1,1,0,1,0,0,0,1,1,0,1,0,0,0,1},{1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,1,0,1,1,1,0,1,0,1,1,1,1,0,1,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,0,0,1,0,0,1,0,1,0,0,1,0,1,0,0,1,1,1,0,1,1,0,1,1,0,0,0,1,0,1,0,1,1,1,1,0,1,1,0,1,0,1,1,1,1,0,0,0},{1,1,0,0,1,1,0,0,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,1,1,1,0,1,1,1,1,0,0,1,1,0,0,1,1,0,0,0,0,0,1,0,0,1,1,0,1,1,0,1,0,0,1,1,0,0,1,0,0,1,1,0,1,0,0,1,0,0,0,0,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,0,1,1,1,1,0,0,0,0,1},{1,1,0,1,0,1,1,0,0,1,1,1,0,1,0,0,1,0,0,1,1,1,0,1,1,0,1,1,0,0,0,0,1,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,1,1,1,0,0,1,1,1,0,0,0,0,1,0,1,1},{0,1,1,0,0,0,0,1,1,0,0,0,1,0,0,1,1,0,1,0,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,1,1,1,0,1,1,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,1,1,0,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,0},{1,0,0,1,0,1,0,1,0,1,1,0,1,1,0,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,0,1,1,0,1,1,0,0,0,0,1,0,0,1,0,0,1,0,0,1,1,1,1,1,0,1,0,0,1,1,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,0,0,0,1,1,0,1,1,1,1,1,0,1,0,0,1,1,0,0,1,0,0},{0,0,1,0,0,0,1,1,1,1,0,1,1,1,0,0,0,1,0,1,1,0,0,1,1,0,1,0,1,1,0,1,0,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,1,1,1,0,0,1,1,1,0,1,0,0,0,1,1,1,0,0,0,0},{0,0,0,1,0,0,0,0,1,0,1,1,0,1,0,0,0,1,0,0,1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,1,1,0,1,1,1,0,1,0,1,0,0,1,0,0,0,1,1,1,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,1,1,0,0,1,1,1,1,1,0,1,0},{1,0,1,0,0,0,0,1,0,0,1,1,0,1,1,1,0,0,0,0,0,1,1,0,0,1,0,1,1,0,1,0,0,1,0,1,1,0,1,1,1,1,1,0,1,0,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,0,1,1,1,1,1,0,1,0,1,0,0,0,1,1,1,1,0},{1,0,1,0,1,0,0,0,1,1,1,0,0,0,1,0,0,1,1,1,0,0,0,0,1,1,0,0,1,0,0,0,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,1,0,1,0,1,0,1,1,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,1,0,0,1,0},{0,1,0,0,0,1,0,1,1,0,1,1,1,0,1,1,0,0,1,0,0,1,1,1,0,0,1,1,0,0,0,0,1,0,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,1,1,0,1,0,0,0,0,1,1,0,0,1,0,0,0,1,1,0,0,0,1,0,1,1,1,1,0,1,1,1,1,1,1,1},{0,0,0,1,1,1,0,0,1,0,0,0,1,1,1,0,1,0,0,0,1,0,1,1,0,1,1,1,0,1,0,1,1,0,0,1,1,0,0,1,0,1,0,0,1,0,1,0,0,1,1,0,1,1,0,0,0,0,1,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,1,1,0,0,1,1,1,0,1,1,0,0,1,0,1,1,0,0,1,0,0,1},{1,1,1,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,0,0,1,0,0,0,0,1,1,1,0,1,0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0,0,1,0,1,0,1,1,0,0,0,1,0,1,1,1,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0,1,1,0,1},{0,0,0,0,1,0,1,1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,1,1,0,1,0,1,0,0,0,1,0,1,0,1,1,0,0,0,0,1,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,0,1,1,0,1,1,1,0,0,1,0,0,1,0,1,1,1,1,0,1,0,1,1,0,0},{1,0,1,0,1,1,0,0,0,1,1,1,0,0,1,1,0,1,1,0,1,1,0,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,0,0,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,0,1,0,0,0,1,0,0,1,0,1,0,1,1,1,1,0,0,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,1,0,0,1,1,1},{0,0,0,1,1,0,1,1,1,0,0,0,1,1,1,0,0,1,1,0,1,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,0,1,1,1,1,0,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1,1,0,1,0,1,1,1,0,1,1,0,0,0,1,0,1,0,0,1,0,1,1,1,0,1,1,1,0,0,1,1},{0,0,1,0,1,1,1,1,0,0,0,1,1,0,1,1,1,1,1,0,1,0,0,1,0,0,1,0,0,1,0,1,1,0,0,1,1,1,0,1,0,0,1,0,0,0,1,0,1,1,0,1,1,1,0,0,0,1,1,1,0,1,0,0,1,0,1,1,0,1,0,1,0,1,0,1,0,0,0,1,1,0,0,0,1,0,1,1,0,1,1,1,0,0,0,1,1,0,1},{1,0,1,1,0,1,0,1,1,0,0,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0,1,0,1,0,0,1,0,1,0,1,0,0,0,1,1,0,0,0,0,1,1,1,1,0,1,1,0,0,0,1,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,1,1,1,0,0,1,1,1,0,1,1,1,0,0,1,1,1},{1,0,0,0,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,0,1,0,1,0,0,1,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,0,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,0,0,1,1,0,0,0,1,1,0,1,1,0,1,0},{0,0,0,0,0,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1,1,1,0,0,0,0,1,1,0,0,1,1,0,0,1,0,0,1,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,0,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,0,0,0,0,1,0,1},{1,0,1,0,1,0,1,0,1,0,0,0,1,1,1,0,0,0,0,1,1,0,1,1,1,0,1,1,1,0,1,0,0,0,1,1,0,0,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0,1,0,1,0,0,1,0,0},{1,0,1,1,1,1,1,0,0,0,1,1,1,0,1,1,0,1,1,0,0,1,1,1,1,0,1,0,0,0,0,1,0,1,0,0,0,1,1,0,0,1,0,0,1,1,0,0,1,1,0,0,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,1,1,1,1,1,0,1,0,0,1,0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,1,1,1,1,1},{1,1,1,0,0,1,0,0,1,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1,0,1,1,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,0,0,1,0,1,1,0,1,1,0,0,1,1,0,0,0,0},{0,0,1,0,0,1,0,1,1,1,0,0,0,0,0,1,1,1,0,1,1,0,1,1,0,0,1,0,0,1,1,0,0,1,0,1,0,0,1,1,0,1,0,1,1,0,0,0,1,0,0,0,0,1,0,0,1,0,1,1,0,1,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,0,0,0,1,1,0,0,1,0,0,0,1,0,0,1,1,0,0,1,0,0},{1,0,0,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,1,1,0,1,1,0,1,1,1,0,0,1,0,1,0,1,1,1,1,1,1,0,1,1,0,0,1,0,0,0,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,0,1,0,0,1,1,1,0,0,1,0,1,1,0,1,1,0},{0,0,0,1,0,0,0,1,0,1,1,0,1,0,1,0,0,0,1,1,0,1,1,1,1,0,0,0,1,1,0,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1,0,1,1,1,1,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,0,1,1},{1,1,1,1,1,1,1,0,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,1,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1,1,1,1,1,0,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,1,1,1,0,0,1,1,0,0,0,0,1,0},{0,1,1,0,0,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,1,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,1,0,1,1,0,0,1,0,1,1,0,0,0,1,1,0,1,0,0,0,0,1,1,0,0,0,0,1,0,1,1,1,0,1,1,0,0,1,1,0,0,1},{0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0,1,1,0,1,1,1,1,0,1,0,1,0,1,1,0,0,1,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,0,1,0,0,1,0,0,1,1,1,0,1,1,1,1,0,1,0,0,1,0,1,1,1,0,1,1,1},{0,1,0,1,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1,1,0,1,1,0,1,0,0,1,0,0,1,0,0,1,1,1,0,1,1,1,0,0,1,0,1,1,1,0,1,0,1,0,1,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,1,0,0,0,1,1,0,1,0,0,1,0,1,1,0,1,1,0,0,1,0},{0,1,0,1,0,0,0,1,1,1,0,1,0,0,0,1,1,1,0,0,1,0,1,0,1,1,0,1,1,1,0,0,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,1,1,0,0,0,1,0,0,0,1,1,0,1,1,1,0,0,1,0,1,0,0,1,1,1,1,1,1,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,1,1,1,1,0,1},{1,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,1,1,0,0,1,0,1,0,1,1,1,1,0,1,0,1,1,1,1,0,0,1,1,0,1,0,0,0,1,1,0,0,0,1,1,1,0,1,0,1,0,1,0,0,0,1,1,0,1,1,0,0,1,0,0,0,1,0,1,1,1,0,1,0,0,1,1,0,1,0,0,1,0,0,0,1,0,0,1,1,0,1,1},{1,0,0,1,0,0,0,0,0,1,1,0,0,1,0,1,0,0,0,1,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,0,0,1,1,0,1,0,1,1,1,0,0,1,0,0,0,1,0,1,0,0,1,1,0,0,0,0,1,1,0,1,0,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,1,0,1,0,1},{0,1,0,1,1,0,0,0,0,0,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,1,1,1,1,0,1,1,1,1,1,0,0,0,0,1,0,1,1,0,1,1,0,0,1,0,0,0,0,0,1,1,0,0,1,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1,0,0,1,0,1,0,0,0,1,1,0,0,1},{1,0,1,1,0,1,1,0,1,1,0,0,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0,0,0,0,1,1,1,1,0,0,1,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,1,0,1,1,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,1,0,0,1,0,1,0},{1,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,0,1,0,0,0,1,0,0,1,1,1,1,0,1,0,0,1,1,1,1,0,0,1,1,0,1,0,1,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,1,1,0,1,1,0,1,1,0},{1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,0,0,1,1,0,0,0,0,1,0,1,1,1,1,0,1,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,1,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1,0,1,0,1,0,0,1,0,0,0,1},{1,1,1,1,0,1,1,0,1,0,1,1,0,0,1,0,0,1,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,0,1,0,1,1,0,1,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,0,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,0,1},{1,1,1,1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,1,1,0,0,1,0,0,0,1,1,0,0,0,0,0,1,1,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,0,0,1,1,0,1,1,1,0,0,1,0,1,1,1,1,0,0,1,1,0,1,0,0,0,0,1,1,0,1,0,1,1,1,0,0},{0,1,0,0,0,1,1,0,1,1,0,0,1,0,0,0,1,1,1,0,1,1,0,0,0,0,1,0,1,0,1,0,0,1,0,1,1,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,1,1,1,0,1,1,0,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,0,1,0,0,1,1,1,1,1,1,0,0,1,0,1},{0,1,1,0,1,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,1,1,0,0,0,0,1,0,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,0,0,0,1,1,1,1,0,0,0,0,1,1,1,0,0,1,0,1,1,1},{0,0,0,0,1,1,1,0,0,1,1,1,0,0,1,1,1,0,0,1,0,1,0,0,0,1,0,1,1,0,0,1,1,0,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,1,1,1,0,0,0,1,0,1,1,0,0,1,0,1,1},{0,0,1,1,0,0,0,1,1,1,0,1,1,1,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,1,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,1,0,0,0,1,1,0,0,0,0,0,0,1,1,1,1,0,1,1,1,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,1,0,0},{1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,0,0,1,0,1,1,0,1,0,1,1,1,0,1,1,1,1,0,1,0,0,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,1,1,0,0,1,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,1,0,1,0,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0},{0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,1,0,0,0,0,1,1,1,1,0,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,0,1,0,0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,0,0,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,1,1,0,1,0,1,0,0,0,1,0,0,1,1,1},{0,1,1,0,0,0,1,1,1,1,0,1,1,1,1,1,0,0,0,1,1,0,1,1,1,0,1,1,0,0,1,1,0,0,1,1,1,1,1,1,1,1,0,0,0,0,1,1,0,0,1,1,0,0,0,1,1,1,1,0,1,1,0,0,1,1,1,0,1,0,0,0,1,0,0,1,1,1,0,1,1,0,0,1,0,1,0,1,1,1,0,0,1,0,1,1,0,0,1},{1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,0,1,1,1,1,1,1,0,1,1,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,1,1,1,0,1,1,1,0,0,0,0,1,0,0,1,0,0,0,1,1,0,1,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,1,1,1,0,1,0,0,1,1,1,1,1,1,0,1,0,1},{0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,1,1,0,0,0,1,0,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,1,1,0,0,1,0,1,1,0,1,0,1,0,0,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1,1,0,1,0,1,0,0,0,1,0,0,1,0},{0,1,1,0,1,0,0,1,1,1,1,1,0,0,0,1,1,0,0,1,0,0,1,0,1,1,0,1,0,0,1,1,0,1,1,1,1,1,0,0,0,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,1,0,0,1,1,1,0,1,1,1,0,0,1,0,0,0,0,1,0,1,0,0,1,1,1,1,1,1,1,1,0,0,0,1,0,1,1,0,0,0,0,1,0},{0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,1,1,1,1,0,0,0,1,0,0,1,1,0,1,1,1,1,0,0,0,1,1,1,1,0,0,1,1,0,0,0,0,1,1,1,1,0,0,0,0,1,0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,1,0,0,0,0,1,0}}));
    }
}
