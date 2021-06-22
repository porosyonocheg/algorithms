package depthFirstSearch;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class ConcatenatedStringWithUniqueCharactersTest {
    @Test
    public void getMaxLengthTest() {
        assertEquals(0, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Collections.singletonList("")));
        assertEquals(4, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("un","iq","ue")));
        assertEquals(6, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("cha","r","act","ers")));
        assertEquals(7, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("q", "qw", "qwer", "qwert", "qwerty", "qwertyu")));
        assertEquals(26, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Collections.singletonList("abcdefghijklmnopqrstuvwxyz")));
        assertEquals(16, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p")));
        assertEquals(0, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("azxcvbnmsdfguytrewqpkdjhaz","bazxcvnmsdfguytrewqpkdjhab","cazxvbnmsdfguytrewqpkdjhac","dazxcvbnmsfguytrewqpkdjhad","eazxcvbnmsdfguytrwqpkdjhae","fazxcvbnmsdguytrewqpkdjhaf","gazxcvbnmsdfuytrewqpkdjhag","hazxcvbnmsdfguytrewqpkdjah","iazxcvbnmsdfguytrewqpkdjhi","jazxcvbnmsdfguytrewqpkdhaj","kazxcvbnmsdfguytrewqpdjhak","lazxcvbnmsdfguytrewqpkdjhl","mazxcvbnsdfguytrewqpkdjham","nazxcvbmsdfguytrewqpkdjhan","oazxcvbnmsdfguytrewqpkdjho","pazxcvbnmsdfguytrewqkdjhap")));
        assertEquals(3, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("abc", "bac", "cba", "cab", "acb", "ab", "ac", "cb", "ba", "ca", "bc", "a", "b", "c")));
        assertEquals(26, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("qwerty", "asdfg", "zxcvb", "uiop", "hjkl", "nm")));
        assertEquals(24, new ConcatenatedStringWithUniqueCharacters().getMaxLength(Arrays.asList("mlop", "njki", "bhu","vgy","cft","dr","zaqw","sxec")));
    }

}
