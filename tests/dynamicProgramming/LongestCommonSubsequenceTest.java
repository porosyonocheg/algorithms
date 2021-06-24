package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonSubsequenceTest {
    @Test
    public void getMaxLengthTest(){
        assertEquals(0, new LongestCommonSubsequence().getMaxLength("abc", "def"));
        assertEquals(3, new LongestCommonSubsequence().getMaxLength("atbfutc", "bducat"));
        assertEquals(4, new LongestCommonSubsequence().getMaxLength("abcd", "abcd"));
        assertEquals(5, new LongestCommonSubsequence().getMaxLength("stepx", "bosltiertpaox"));
        assertEquals(1, new LongestCommonSubsequence().getMaxLength("dcba", "abcd"));
        assertEquals(10, new LongestCommonSubsequence().getMaxLength("qwertyuiopasdfghjklzxcvbnm", "zaqwsxcderfvbgtyhnmjuiklop"));
        assertEquals(3, new LongestCommonSubsequence().getMaxLength("srhfyutwcbzzq", "ubqftm"));
        assertEquals(0, new LongestCommonSubsequence().getMaxLength("a", "qwertyuioplkjhgfdszxcvbnm"));
        assertEquals(1, new LongestCommonSubsequence().getMaxLength("qswedfrtgyhjujkiolpmnbvcxza", "z"));
        assertEquals(11, new LongestCommonSubsequence().getMaxLength("tyrueiwoqpalskdjfhgbvncmxz", "alskjdhfgvbmcnxzqpwoeiruty"));
        String s1 = "qoqnyaredmmuaipfpkutpdliuiobnsfogbrmlpkmewcwdtxbaajingnizdoscguijltcbrftcpkzqbaionqowicjhchrhaxqrhyhcejiguhpsybbrrgorgzdbsrtwijrlobfvpqutacerxliaqtpuviyjxgyfdilqicrphahjmjmamzfhsfweuoddaxbjmgqwkrfsezcykaxmxzatiqjbatxjppcnjfdboaygksprsrgsemqneahpzxjxxfblsopvvscmvtgzvjlzbcforpgsprnhbywpwkarzkmwusglxgwfrwgpudhabmeqhqxevxcxnzmimnuycyqccirmurnigpihmthkjkhgrqytbqfhlpkyebeqpnrdapkdwdukvaokrurkhsbwlxbavddagiimccitcjwtpjcykkbgpkinkmdvofkzmptwawffnhwwpqmphsswynjzwnyhvonqtgwvjtxrqrpjyuwnervzgdkgapoiimdjouihcjgxxgeogeocwkhgfnzgvyilwbtrpegnqraavzymugxrqhmbvqdwbplyyxofvnrcnbqtckwxxpjyzmzvsodgsdzzkkvaeqsktlyscqyxegufuvqjlmhfqovhicbcuxqyjvbcuccfzewdqzbsdndwkkmtfhzdnqlkaxsiuzdkiaenjmbxhntvoadnmbfsskpocdrjhpbuwgarxnrizbihujfhyfplyrvrxvszzcrxegyrkrabcxhlvsapzxsnlwocdugjpqdgkaccnwvpbmckeunyoeiokigaqwayylixwvfvxwavptxziepmounqtbfnhxemgkvykinlfslexizacbnkuoxpccjzlcippvqoithkcmcdbwsygulmnpxmyqvqgjkdshuagmbvnnjvmlqhohktyxolbdyjlazcabqesuulhnsdyrywqhmnkpjtivkshxsuynvxj";
        String s2 = "jheyixdrkfkzbagbhaxtjvgixohdjqtgbvfhwnfzpyoghwtiervyatamdpixxfsogbjajnnznynupatjwzjodvlnornmlgquddcxbrcqmhnycctmqtdxvdctpoaccleggdrixqoznsicohxunhdngmpyinqnvdtfqreaqhbgwxpjaeaxabrdvyqmpqdtpnmsqxwdpjkjppyycbyxrsxuhqizeckposskjiiuhhrnonoijdzovhemgrxykgfwqnpgbimnvmybgcuiakrsctauummwsodugffsgwhfxlcsoujmsrzcpogxqedkxtofhmkyjzaerqhvakmvulldsvavclicanespwoolhvnhgfcvqmunpujzjuzsnmxifopfhxfhzgtjizobfkfacqphgsszjwhlxcakwuzurgrydanxyfbxrsyinbmdgqnarbsnxnijclnkwhbizxuojwmhelaqkfhhcasgibdwglcyjvuwvanmqyrqhfwhfwefcnljgkapurtbmlmyvmaahgtornzgeraqxvzfouxongyoeqlaqogdhwgekgwyslywjhpzhrxehemkixthmeasytihwjtargygomouudhycuufphcqxhxvljqjapzfmxrkkaeieranlntwnvipovhllkxpuzzrjumfvhdojbccwseewvavlozhcyqmwgzguepmbucvakmvyzidfaouikwbcpdkoyllhhsrbhhawuhtclagzxujixqvifopdclajcruiosgfrxwgshaloehxdfpjllghynsxdruahnkwzshgnhvdsqhykyglzmcsckcmoiwefikehyysdjalvbugwnsuwkzgxrxhogjfleihbogftkhorzvcvrkxuctzutlzvvtudozrovkmengmzmaenltgdgpujbhdqgutjtsdntkftweolecwcpfjwziahsfktvzkgfjqmztqoqeyzwmlajhuxqblranrwiogjootdsgxxsqogw";
        assertEquals(311, new LongestCommonSubsequence().getMaxLength(s1, s2));
    }
}
