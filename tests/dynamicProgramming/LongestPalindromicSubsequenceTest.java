package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestPalindromicSubsequenceTest {
    @Test
    public void getLength() {
        assertEquals(1, new LongestPalindromicSubsequence().getLength("q"));
        assertEquals(1, new LongestPalindromicSubsequence().getLength("abcdef"));
        assertEquals(2, new LongestPalindromicSubsequence().getLength("tgg"));
        assertEquals(3, new LongestPalindromicSubsequence().getLength("aba"));
        assertEquals(3, new LongestPalindromicSubsequence().getLength("abdfga"));
        assertEquals(4, new LongestPalindromicSubsequence().getLength("wwwow"));
        assertEquals(7, new LongestPalindromicSubsequence().getLength("sssssss"));
        assertEquals(10, new LongestPalindromicSubsequence().getLength("cdpstryooytrpsfc"));
        assertEquals(17, new LongestPalindromicSubsequence().getLength("aabbaabbbaaabaabbaab"));
        assertEquals(322, new LongestPalindromicSubsequence().getLength("jvpykwdbsruukdmsgpscxswnyjqtyoxuroecceofcswgbycdhwslissfeccotpgujybbsofuyrbyksainkqzltniiqhmnuwmihzvxtixkbxbtxztkfyavvoxqzxuwyuxlssjbdxxuveftacuptkreokyecyhpsyxcyrpaiwbipmhcgyevqttyeeedytzqpluhcsubmlzhddcqybuwsurwwbmocyialcdusgffrsszwhtprmmyfjuvfblaromopgzkhpaqnospzibeouligduyaybdfvuhjtbztojkztnrmsdglipcnarzjormbstmnmjclhulshbgrnoownidkjjusfppvdxxzqdlzgsthaxduxgxuqlrdzknpofrjbgyeswaatpyvpcjykfpbplqerbcilcvrcxqdnrekivxzmzzhlzlqkyqdaljyixgdkqhdluhlucvcihbmnsrjijxrgdxonpehnfuraqascgkmsrxhciezpaqsltrxfdjlrpbgwrvpwwhdwhqpcxffoeszcggzhcttkkpzmxpvvqxpvrxkpkblqriqsvzepwgnizjbtjqiunheycxnrsbduodlwrbmmtwxzffnmcwjpplfgpqznpyyhaqujqqbmqejiyameceyqttuobleyjlzqtqjqgsxktzdenkizugiextqjvsuylxbogdtqxwzkqbezsvjflkxkiagmywnqhoqtrkmolhlrmkwsnmptiyknjnhkrvlisophsfgjwgdcrmvmvyvxkieyfzghxeebdsnsxolviqjendyqqsblbftyargejgyflgebzjuskxxkhcqyddzxldunlkicoyzfwrdnspkiqzhqomjgpqueitgmarqxeagabjtxvobzdvizsxpbtbigkknuhfidxqjhtwlrdnolvxypqgrvlikkkthattgafdtzgtbdemokkcycxnewfmkhtqflhwdwpzcmlrquwfpwbtpzyymjpqyrokexvhbvu"));
        assertEquals(69, new LongestPalindromicSubsequence().getLength("asaasasasdasasasasdasadaassdadasasasasdadasadasdadadadadadadadasasadadasasaaaaaaaaadasdasdad"));
    }
}
