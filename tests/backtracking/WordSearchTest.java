package backtracking;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordSearchTest {
    @Test
    public void exist() {
        assertTrue(new WordSearch().exist(new char[][]{{'A'}}, "A"));
        assertFalse(new WordSearch().exist(new char[][]{{'A'}}, "a"));
        assertTrue(new WordSearch().exist(new char[][]{{'A','B','C'},{'D','E','F'},{'G','I','J'}}, "IEB"));
        assertFalse(new WordSearch().exist(new char[][]{{'A','B','C'},{'D','E','F'},{'G','I','J'}}, "ABCD"));
        char[][]table = {{'f','o','V','r','v','g','p','P','p','D','I','f','B','a','R'},
                         {'v','y','P','R','i','e','X','R','y','f','p','o','c','v','h'},
                         {'q','f','M','T','l','n','S','h','l','f','D','q','M','Q','r'},
                         {'B','O','m','Y','G','w','B','P','h','a','R','L','u','h','c'},
                         {'p','J','X','s','A','X','Z','C','Y','p','R','t','f','Z','V'},
                         {'e','U','S','V','S','S','y','P','P','d','m','O','C','G','b'},
                         {'g','N','n','e','e','S','a','D','B','B','S','e','Z','J','T'},
                         {'X','m','Q','T','s','i','T','v','Z','R','n','t','W','K','G'},
                         {'S','a','C','e','s','E','X','e','D','o','F','l','e','e','U'},
                         {'f','q','F','H','g','J','i','t','U','R','q','u','K','T','w'}};
        assertTrue(new WordSearch().exist(table, "yZCPPYpaffypPp"));
        assertFalse(new WordSearch().exist(table, "SSSessEse"));
        table = new char[][]{{'M','A','G','o','y','a','U','H','I','S'},
                             {'d','p','j','m','U','E','g','h','u','S'},
                             {'i','S','t','g','m','N','B','f','s','n'},
                             {'L','G','r','y','C','X','m','s','Y','n'},
                             {'R','w','c','R','Z','s','O','d','X','Z'},
                             {'q','i','m','y','w','M','T','y','A','x'},
                             {'J','P','v','w','F','H','Z','T','O','V'},
                             {'h','j','q','o','N','R','t','Q','l','W'},
                             {'L','v','P','W','j','J','f','v','q','r'},
                             {'q','n','i','P','g','V','G','F','m','G'},
                             {'x','c','P','A','p','F','e','B','L','l'},
                             {'C','b','m','Q','a','N','H','J','V','a'},
                             {'B','X','l','x','F','T','k','o','g','R'},
                             {'D','N','L','k','P','j','a','N','h','l'},
                             {'f','y','d','n','K','v','W','i','L','X'}};
        assertTrue(new WordSearch().exist(table,"XLhlRgoNiWvKnkx"));
        assertFalse(new WordSearch().exist(table,"BLlaRlhLiNh"));
    }
}
