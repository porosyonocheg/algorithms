package greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class VideoStitchingTest {
    @Test
    public void getMinNumberOfClips() {
        assertEquals(1, new VideoStitching().getMinNumberOfClips(new int[][]{{0,3}}, 1));
        assertEquals(-1, new VideoStitching().getMinNumberOfClips(new int[][]{{0,1},{1,2}}, 5));
        assertEquals(2, new VideoStitching().getMinNumberOfClips(new int[][]{{0,4},{2,8}}, 5));
        assertEquals(1, new VideoStitching().getMinNumberOfClips(new int[][]{{1,3},{2,5},{0,7}}, 7));
        assertEquals(3, new VideoStitching().getMinNumberOfClips(new int[][]{{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}}, 10));
        assertEquals(3, new VideoStitching().getMinNumberOfClips(new int[][]{{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}}, 9));
        //assertEquals(2, new VideoStitching().getMinNumberOfClips(new int[][]{{}}, 1));
        //assertEquals(2, new VideoStitching().getMinNumberOfClips(new int[][]{{}}, 1));
        //assertEquals(2, new VideoStitching().getMinNumberOfClips(new int[][]{{}}, 1));
    }
}
