package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeleteOperationsForTwoStringsTest {
    @Test
    public void getMinToMakeEqual() {
        assertEquals(0, new DeleteOperationsForTwoStrings().getMinToMakeEqual("f", "f"));
        assertEquals(2, new DeleteOperationsForTwoStrings().getMinToMakeEqual("s", "a"));
        assertEquals(1, new DeleteOperationsForTwoStrings().getMinToMakeEqual("sa", "a"));
        assertEquals(2, new DeleteOperationsForTwoStrings().getMinToMakeEqual("sa", "as"));
        assertEquals(2, new DeleteOperationsForTwoStrings().getMinToMakeEqual("sea", "eat"));
        assertEquals(8, new DeleteOperationsForTwoStrings().getMinToMakeEqual("stack", "aaaaa"));
        assertEquals(5, new DeleteOperationsForTwoStrings().getMinToMakeEqual("soccer", "poker"));
        assertEquals(9, new DeleteOperationsForTwoStrings().getMinToMakeEqual("fkdxdyryco", "fqdkdxryvnycvor"));
        assertEquals(32, new DeleteOperationsForTwoStrings().getMinToMakeEqual("lqagejqvxejnynwuozgofpbgq", "lpeuwchakkepqkjfwfctafnpb"));
        assertEquals(148, new DeleteOperationsForTwoStrings().getMinToMakeEqual("rveoaonqrpnwjwcyrfzqmnnrquqlfaxpvtueraeqgsjbjjwubmcwgwjgsjqzcexxvfitwezjlrbmzbwbjqxnguatwdzvlsylulsy", "qcfptsywrbbtzkwdejnpfcpwyhhqhmocinvoswlszrksmxpukwmtbldlpcfzptttfpmycxnkhphsrjcllkupsocjthxfmuqmqcui"));
        assertEquals(492, new DeleteOperationsForTwoStrings().getMinToMakeEqual("lhcgligdamidckfahhmkgeblfbghkmfafjkicgmdfdkehbglabddhhllehhbifckmkdjlgcgmambklhjbihiffdfglbfblimblkfkfjkddgijfbhmdkhahglldkbgicmcckggabkgehgmclfldcmfgdmmaicdhlhiflbghkklamfmbadheidgcgjigdhhlimjehfmbcekcgdmebgimmefkhlebimdafacdmbecfdefghhedfakbkeeilamagkbgfddggkigcbgclfgkbhgmlefeccelagbddfeelebiihammmddialkdefgbhjhjcldgdiamfcdeiigbjfabgkbmjjcgaakhlf", "heigeclemgabklfmehihcidahbeigchkchiklckfeahhbkghfigiagcikgjecllbkedhgigkmggclkdhcmjjmkedhcakladdfmamfjjbabggcccebgbjbbgkmdlilggbjieicfiahghccckeakfhmbkcbmahgjhihgmaiiighleklicmmjccbkgkemmibfkcmkfhlijlkcdbillmgafflcgehkldhjcaeljjaldcakhmhdflcejgkmamidjfmjfkejmihkhflahbbgmmjlbdcmjljgciamigkafghcblgefieghceicjhcieimkikhalgmabjhlmbfkgmgmfhdfbhelekaehiclhbeecibjbdkabadddhdaflmmmgemgafkjggdjlcgahhhiffmfbeiijgecllghfifeimabhckekehamibcaikadelekmgkbjiallgeidicmhhfihfgfmajgiaajlmclehjedkagkhaimkgfhdfbgkf"));
    }
    @Test
    public void generate() {
        for (int i = 0; i < 350; i++) {
            char c = (char)((int) (Math.random()*13) + 'a');
            System.out.print(c);
        }
    }
}
