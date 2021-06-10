package backtracking;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void asserting() {
        List<String> result = new ArrayList<>();
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters(""));
        result = Arrays.asList("a","b","c");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("2"));
        result = Arrays.asList("p","q","r","s");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("7"));
        result = Arrays.asList("at","au","av","bt","bu","bv","ct","cu","cv");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("28"));
        result = Arrays.asList("gw","gx","gy","gz","hw","hx","hy","hz","iw","ix","iy","iz");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("49"));
        result = Arrays.asList("mmm","mmn","mmo","mnm","mnn","mno","mom","mon","moo","nmm","nmn","nmo","nnm","nnn","nno","nom","non","noo","omm","omn","omo","onm","onn","ono","oom","oon","ooo");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("666"));
        result = Arrays.asList("dgj","dgk","dgl","dhj","dhk","dhl","dij","dik","dil","egj","egk","egl","ehj","ehk","ehl","eij","eik","eil","fgj","fgk","fgl","fhj","fhk","fhl","fij","fik","fil");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("345"));
        result = Arrays.asList("wjdp","wjdq","wjdr","wjds","wjep","wjeq","wjer","wjes","wjfp","wjfq","wjfr","wjfs","wkdp","wkdq","wkdr","wkds","wkep","wkeq","wker","wkes","wkfp","wkfq","wkfr","wkfs","wldp","wldq","wldr","wlds","wlep","wleq","wler","wles","wlfp","wlfq","wlfr","wlfs","xjdp","xjdq","xjdr","xjds","xjep","xjeq","xjer","xjes","xjfp","xjfq","xjfr","xjfs","xkdp","xkdq","xkdr","xkds","xkep","xkeq","xker","xkes","xkfp","xkfq","xkfr","xkfs","xldp","xldq","xldr","xlds","xlep","xleq","xler","xles","xlfp","xlfq","xlfr","xlfs","yjdp","yjdq","yjdr","yjds","yjep","yjeq","yjer","yjes","yjfp","yjfq","yjfr","yjfs","ykdp","ykdq","ykdr","ykds","ykep","ykeq","yker","ykes","ykfp","ykfq","ykfr","ykfs","yldp","yldq","yldr","ylds","ylep","yleq","yler","yles","ylfp","ylfq","ylfr","ylfs","zjdp","zjdq","zjdr","zjds","zjep","zjeq","zjer","zjes","zjfp","zjfq","zjfr","zjfs","zkdp","zkdq","zkdr","zkds","zkep","zkeq","zker","zkes","zkfp","zkfq","zkfr","zkfs","zldp","zldq","zldr","zlds","zlep","zleq","zler","zles","zlfp","zlfq","zlfr","zlfs");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("9537"));
        result = Arrays.asList("tgam","tgan","tgao","tgbm","tgbn","tgbo","tgcm","tgcn","tgco","tham","than","thao","thbm","thbn","thbo","thcm","thcn","thco","tiam","tian","tiao","tibm","tibn","tibo","ticm","ticn","tico","ugam","ugan","ugao","ugbm","ugbn","ugbo","ugcm","ugcn","ugco","uham","uhan","uhao","uhbm","uhbn","uhbo","uhcm","uhcn","uhco","uiam","uian","uiao","uibm","uibn","uibo","uicm","uicn","uico","vgam","vgan","vgao","vgbm","vgbn","vgbo","vgcm","vgcn","vgco","vham","vhan","vhao","vhbm","vhbn","vhbo","vhcm","vhcn","vhco","viam","vian","viao","vibm","vibn","vibo","vicm","vicn","vico");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("8426"));
        result = Arrays.asList("pmjgd","pmjge","pmjgf","pmjhd","pmjhe","pmjhf","pmjid","pmjie","pmjif","pmkgd","pmkge","pmkgf","pmkhd","pmkhe","pmkhf","pmkid","pmkie","pmkif","pmlgd","pmlge","pmlgf","pmlhd","pmlhe","pmlhf","pmlid","pmlie","pmlif","pnjgd","pnjge","pnjgf","pnjhd","pnjhe","pnjhf","pnjid","pnjie","pnjif","pnkgd","pnkge","pnkgf","pnkhd","pnkhe","pnkhf","pnkid","pnkie","pnkif","pnlgd","pnlge","pnlgf","pnlhd","pnlhe","pnlhf","pnlid","pnlie","pnlif","pojgd","pojge","pojgf","pojhd","pojhe","pojhf","pojid","pojie","pojif","pokgd","pokge","pokgf","pokhd","pokhe","pokhf","pokid","pokie","pokif","polgd","polge","polgf","polhd","polhe","polhf","polid","polie","polif","qmjgd","qmjge","qmjgf","qmjhd","qmjhe","qmjhf","qmjid","qmjie","qmjif","qmkgd","qmkge","qmkgf","qmkhd","qmkhe","qmkhf","qmkid","qmkie","qmkif","qmlgd","qmlge","qmlgf","qmlhd","qmlhe","qmlhf","qmlid","qmlie","qmlif","qnjgd","qnjge","qnjgf","qnjhd","qnjhe","qnjhf","qnjid","qnjie","qnjif","qnkgd","qnkge","qnkgf","qnkhd","qnkhe","qnkhf","qnkid","qnkie","qnkif","qnlgd","qnlge","qnlgf","qnlhd","qnlhe","qnlhf","qnlid","qnlie","qnlif","qojgd","qojge","qojgf","qojhd","qojhe","qojhf","qojid","qojie","qojif","qokgd","qokge","qokgf","qokhd","qokhe","qokhf","qokid","qokie","qokif","qolgd","qolge","qolgf","qolhd","qolhe","qolhf","qolid","qolie","qolif","rmjgd","rmjge","rmjgf","rmjhd","rmjhe","rmjhf","rmjid","rmjie","rmjif","rmkgd","rmkge","rmkgf","rmkhd","rmkhe","rmkhf","rmkid","rmkie","rmkif","rmlgd","rmlge","rmlgf","rmlhd","rmlhe","rmlhf","rmlid","rmlie","rmlif","rnjgd","rnjge","rnjgf","rnjhd","rnjhe","rnjhf","rnjid","rnjie","rnjif","rnkgd","rnkge","rnkgf","rnkhd","rnkhe","rnkhf","rnkid","rnkie","rnkif","rnlgd","rnlge","rnlgf","rnlhd","rnlhe","rnlhf","rnlid","rnlie","rnlif","rojgd","rojge","rojgf","rojhd","rojhe","rojhf","rojid","rojie","rojif","rokgd","rokge","rokgf","rokhd","rokhe","rokhf","rokid","rokie","rokif","rolgd","rolge","rolgf","rolhd","rolhe","rolhf","rolid","rolie","rolif","smjgd","smjge","smjgf","smjhd","smjhe","smjhf","smjid","smjie","smjif","smkgd","smkge","smkgf","smkhd","smkhe","smkhf","smkid","smkie","smkif","smlgd","smlge","smlgf","smlhd","smlhe","smlhf","smlid","smlie","smlif","snjgd","snjge","snjgf","snjhd","snjhe","snjhf","snjid","snjie","snjif","snkgd","snkge","snkgf","snkhd","snkhe","snkhf","snkid","snkie","snkif","snlgd","snlge","snlgf","snlhd","snlhe","snlhf","snlid","snlie","snlif","sojgd","sojge","sojgf","sojhd","sojhe","sojhf","sojid","sojie","sojif","sokgd","sokge","sokgf","sokhd","sokhe","sokhf","sokid","sokie","sokif","solgd","solge","solgf","solhd","solhe","solhf","solid","solie","solif");
        assertEquals(result, LetterCombinationsOfAPhoneNumber.getLetters("76543"));
    }
}
