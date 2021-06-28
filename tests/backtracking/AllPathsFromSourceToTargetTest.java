package backtracking;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AllPathsFromSourceToTargetTest {
    @Test
    public void getAllPaths() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(0,1));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,1,2,3));
        result.add(Arrays.asList(0,2,3));
        result.add(Arrays.asList(0,3));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1,2,3},{2},{3},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,1,2,3));
        result.add(Arrays.asList(0,3));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1,3},{2},{3},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,1,3));
        result.add(Arrays.asList(0,2,3));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1,2},{3},{3},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,4));
        result.add(Arrays.asList(0,3,4));
        result.add(Arrays.asList(0,1,3,4));
        result.add(Arrays.asList(0,1,2,3,4));
        result.add(Arrays.asList(0,1,4));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{4,3,1},{3,2,4},{3},{4},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,1,4,13,14));
        result.add(Arrays.asList(0,2,6,8,9,11,10,13,14));
        result.add(Arrays.asList(0,2,7,8,9,11,10,13,14));
        result.add(Arrays.asList(0,3,5,9,11,10,13,14));
        result.add(Arrays.asList(0,3,5,10,13,14));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1,2,3},{4},{6,7},{5},{13},{9,10},{8},{8},{9},{11},{13},{10},{14},{14},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,1,2,6,7,8,9));
        result.add(Arrays.asList(0,1,2,6,9));
        result.add(Arrays.asList(0,1,5,9));
        result.add(Arrays.asList(0,1,6,7,8,9));
        result.add(Arrays.asList(0,1,6,9));
        result.add(Arrays.asList(0,2,6,7,8,9));
        result.add(Arrays.asList(0,2,6,9));
        result.add(Arrays.asList(0,3,4,8,9));
        result.add(Arrays.asList(0,3,6,7,8,9));
        result.add(Arrays.asList(0,3,6,9));
        result.add(Arrays.asList(0,3,7,8,9));
        result.add(Arrays.asList(0,4,8,9));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1,2,3,4},{2,5,6},{6},{4,6,7},{8},{9},{7,9},{8},{9},{}}));
        result = new ArrayList<>();
        result.add(Arrays.asList(0,1,2,4,7,9,6,10));
        result.add(Arrays.asList(0,1,2,4,8,9,6,10));
        result.add(Arrays.asList(0,1,2,4,8,10));
        result.add(Arrays.asList(0,3,2,4,7,9,6,10));
        result.add(Arrays.asList(0,3,2,4,8,9,6,10));
        result.add(Arrays.asList(0,3,2,4,8,10));
        result.add(Arrays.asList(0,3,5,6,10));
        result.add(Arrays.asList(0,3,5,7,9,6,10));
        assertEquals(result, new AllPathsFromSourceToTarget().getPaths(new int[][]{{1,3},{2},{4},{2,5},{7,8},{6,7},{10},{9},{9,10},{6},{}}));
    }
}
