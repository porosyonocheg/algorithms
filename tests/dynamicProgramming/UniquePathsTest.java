package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniquePathsTest {
    @Test
    public void numberOfPaths() {
        assertEquals(1, new UniquePaths().numberOfPaths(1,1));
        assertEquals(1, new UniquePaths().numberOfPaths(1,4));
        assertEquals(1, new UniquePaths().numberOfPaths(5,1));
        assertEquals(3, new UniquePaths().numberOfPaths(2,3));
        assertEquals(20, new UniquePaths().numberOfPaths(4,4));
        assertEquals(56, new UniquePaths().numberOfPaths(6,4));
        assertEquals(817190, new UniquePaths().numberOfPaths(10,15));
        assertEquals(44352165, new UniquePaths().numberOfPaths(22,11));
        assertEquals(601080390, new UniquePaths().numberOfPaths(17,17));
        assertEquals(1251677700, new UniquePaths().numberOfPaths(13,25));
        assertEquals(1609344100, new UniquePaths().numberOfPaths(100,7));
    }
}
