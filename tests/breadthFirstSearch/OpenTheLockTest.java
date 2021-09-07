package breadthFirstSearch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OpenTheLockTest {
    @Test
    public void getMinTurns() {
        assertEquals(0, new OpenTheLock().getMinTurns(new String[]{"0001","1000","0100","0010","9990","9099","9909","9990"}, "0000"));
        assertEquals(1, new OpenTheLock().getMinTurns(new String[]{"0009","1000","0100","0010","0090","9000","0900","1111","1001","1010","1110","0111","0110"}, "0001"));
        assertEquals(8, new OpenTheLock().getMinTurns(new String[]{"9990","0999","9099","9909","9090","0909","0990","9009","9000","0900","0090","0009"}, "9999"));
        assertEquals(14, new OpenTheLock().getMinTurns(new String[]{"3214","0635","1199","5882","8357","6688","2125","9788","7303","7180","5097","9079","6206","6559","1605","3480","9366","0867","2276","6474","8778","1114","2735","1691","9069","8086","9923","6041","1958","7119"}, "5678"));
        assertEquals(8, new OpenTheLock().getMinTurns(new String[]{"0001","1000","0100","0010","9990","9099","9909","9990","9991","9911","1999","9199","9100","1900","0099","0009","1009","0109","0190","1090","0999","0199","1099","0090", "9000"}, "1199"));
        assertEquals(6, new OpenTheLock().getMinTurns(new String[]{"0201","0101","0102","1212","2002"}, "0202"));
        assertEquals(-1, new OpenTheLock().getMinTurns(new String[]{"1000","0100","0010","9990","9099","9909","9990","0000"}, "0001"));
        assertEquals(8, new OpenTheLock().getMinTurns(new String[]{"1172","7969","4576","7641","3116","4261","9673","2105","9859","7974","9898","7439","6335","4729","8448"}, "2288"));
        assertEquals(-1, new OpenTheLock().getMinTurns(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"));
    }
}
