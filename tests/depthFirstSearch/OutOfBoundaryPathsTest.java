package depthFirstSearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OutOfBoundaryPathsTest {
    @Test
    public void getNumberOfPaths() {
        assertEquals(4, new OutOfBoundaryPaths().getNumberOfPaths(1, 1, 1, 0, 0));
        assertEquals(6, new OutOfBoundaryPaths().getNumberOfPaths(2, 2, 2, 1, 1));
        assertEquals(12, new OutOfBoundaryPaths().getNumberOfPaths(1, 3, 3, 0, 1));
        assertEquals(119, new OutOfBoundaryPaths().getNumberOfPaths(5, 2, 5, 1, 1));
        assertEquals(917, new OutOfBoundaryPaths().getNumberOfPaths(4, 10, 7, 3, 4));
        assertEquals(29833, new OutOfBoundaryPaths().getNumberOfPaths(12, 8, 10, 3, 7));
        assertEquals(0, new OutOfBoundaryPaths().getNumberOfPaths(21, 21, 10, 10, 10));
        assertEquals(449869632, new OutOfBoundaryPaths().getNumberOfPaths(32, 24, 25, 2, 2));
        assertEquals(313317347, new OutOfBoundaryPaths().getNumberOfPaths(35, 47, 38, 27, 32));
        assertEquals(276775132, new OutOfBoundaryPaths().getNumberOfPaths(50, 50, 50, 24, 24));
    }
}
