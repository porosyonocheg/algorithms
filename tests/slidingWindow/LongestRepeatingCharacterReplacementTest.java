package slidingWindow;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestRepeatingCharacterReplacementTest {
    @Test
    public void getLength() {
        assertEquals(0, new LongestRepeatingCharacterReplacement().getLength("", 0));
        assertEquals(1, new LongestRepeatingCharacterReplacement().getLength("ABC", 0));
        assertEquals(4, new LongestRepeatingCharacterReplacement().getLength("ABAB", 2));
        assertEquals(4, new LongestRepeatingCharacterReplacement().getLength("ABBAABA", 1));
        assertEquals(8, new LongestRepeatingCharacterReplacement().getLength("ZZZZZZZZ", 3));
        assertEquals(10, new LongestRepeatingCharacterReplacement().getLength("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 9));
        assertEquals(17, new LongestRepeatingCharacterReplacement().getLength("ASDFGHJKLPOIUYTREWQZXCVBNMQAZXSWEDCVFRTGBNHYUJMKIOPLMNBVCXZPOIUYTREWQLKJHGFDSA", 15));
        assertEquals(14, new LongestRepeatingCharacterReplacement().getLength("DZWBMTOSSCOLQAUANREEEGWJQMBVXKYKIEOPNRWNDXIYNGYHGXJFJZSNYCLUBOIDQDKSBAFYPRHAKWOGBUWURECXVBMCAPBWIARDBVSUOENEVBYEURFLATDONKALYEROHNPBHJJMOPIBAPMEDEHQWYGFMRCSPVQRRYFOZVASPCFBUWNECKIFJGIAULXAIJMMYQNCEOQGMUAQPUQLLLDXIRUJVMKTHUEPXHUHOFLBXONR", 10));
        assertEquals(30, new LongestRepeatingCharacterReplacement().getLength("VDCESEKWESIPIOKQBTEQJFPGFPDKUDGKFIOLOIKRUXXOALJOYICOJLXVRFZDDAXKLUVPRNWKWHOHLVEUEZOJVAMEITRSLZSIMJSBIZUOAOPZKEVDGTLCIZNNRXIDCVBNHAIEPHLGJULGTWMEMPQWUSNWKZVBEAVCGARJNGHACLXXKYKMHTDRPBGUCQVQIAUBTJFBBYIVEADKSRJGYDQARVHNAEHBILXDDMCJPIPBDNPDSQJYVJWZFBRIAPGENVGPQCEMPWADJTQGYVFMHNSRJBTADLRGQJVLAIWZJLNGMDOQLKYFMRGNGJKUWOPCAGYSXENLJPAFCSCFXFXUVECJGCLKADTMVVNFWFSNNWJRQEWFDYPSGSCEMMHJADCSRJYIKIIBYQVSQPFGTGIGFBGRSSXOVVXNLVZHJCELSYGGBZGYFJJCJPUQGYVCURVCMECJQARIDSIIBGILZVKKFQMVEUTMJJIQULTSVGBOCFEEVLISAJZYEJLACOESDHPQQTJCQNDKTRAPYKUKLJOXQWWGRLFBDYGALSDFYGOVIJLSNCUUMDIETGGKTGUVJYQGXDGXSYUIKOLAGZIYVVXAWKSASXCMUBGMHTLXOZUSDGBMYZWIYKQQUOSHTBIUBNNIWNSRDISLDOFACBEMTWPGWMWKASLTDRPSCVHPKUWWFZTDYWLZVQSNLSBDHKIAQTSZIFVHDMCANFOCMUMRIPBTUAXNMNKHVAMDLGYKYJEMAXKWECKFQVKAXIIAZWDNLFTRGQXIJHRRCFKSFMLVAYGXWOLTQKYMEYIELOOKDXVBMSJWXTYDNQRXIEUAQKKPFPKSOKRKZLYAJQVMKUTOJJYVELMFTRSBYPYYNMJZHBURVJRWSSUUELZUQIDUBFGECMGWXJUUHULCMYCYPMUIXFEZKRONLZPVBTBREZEMPXESKEJWJMMTPLOAFDYCVYRLHMQVKNYBOCYZDUGBHRXTUKFOPCEAKLZAKRIKWFJRGEQHIWQJPNUSVNTXUEQLCPQKXHDSLHEIRDYFELEPUTSLQUDEAJXPJLYZSDVGQQNHZDMWLOJCVYUBUHBLBIBJHPQIQPWQMGFDFYUMOLXUBMJIKXYHWYXATXLOFREFZDHRZQCQZWELYVHDAHUSQZSGZVQJTIPITKQQVMXBYXZYLZWGZFXVAFANLFYUOGYNRTBCNDEGIUTDEDADOXANSTVPRPRZPMELEBJLMZIFSHRTKUJMCZTPZ", 23));
        assertEquals(4988, new LongestRepeatingCharacterReplacement().getLength("SEJKQGWGAKPLCSYWTGJXPVPEHEEXOWNENDHHWWEFVQMOOOOLFHHOPQAEQEGXITNMOAEUOHSTNLTGYFGHOYNRKDDYMYWRTPTZGEQJKKVRIUKOKDJILINORHCYAGPVQXGTBLWBXKUNVSVTUZYMQJSVSVKWUIICHDRAOGMVCKWXCXOGKANQGSJZDIAZAREWLHGJASKTGMHIEJPRYJGVEGSTZXLCBUROGMXZSZIAGULXPILTOAGYXKLCZVEQNHHWQVVLZZAMTBOWMPXFOSEELBDACZJWWGAIXKFNKIFDCGKTSZTGYEFLRMIACQPPCVLGNYDLYINJAMIIHWUNMPZGQTQOZOIYEZVWHEWBUPTTWGOJYLKPVMANOFZYVHBMSUQOPVIRBQMVYUVZIRUEAQHFODKIPTCKGQCOCSVXARRJGYAYWZBZGGDIDZVZUCKHKVLWMFBTMVTUIVJNNVDRTRJGLNGXOPZWMKSEOSEBGSWWLIMKCQGFYXOFHLDNUFYAFJMLPPNFDUKOXGHWPGGEDTPCVDZXXXMFYXOIYKEUDMTEUGMEACSNZATJAOHVLQOBUZTEXDZZPIHAVQQKZFUTPBOMCVPOCJHCJHDBRXUVYHQRPMPJLXSWRNFHFLBMCGDYJFQFVVWYPKEJTIYTNFDDZFHUOITHNNTLVHMMWCSIAWWUXOWRSIFPFONGMQXCKWUOJRKJYJBODAESJRAFHFMEQYWKAFUDLWBYRDRAEOYCWSHNJCBQCPGWQPVAUYFPKDABICNTSJIDCFUHIYXHIIGIYLGNRUELSWMQAVAIPUVFRUGWUNVHVRFJMMYFKPRZBTICQHTGJEMQYFKJZJFCLEHFHFYJVLVFOYVLWVJNHDJPFUEQEJCQUNBPPJUWQFKSBLBLEHPDQDRCSJMMCGMFCUHGQCCYPHHSMPMTQKKTHVRNQBRQLEIHJAQQYXMCNUKIUXAPKHNMOJQCQIWFVVLXZRWAOKSNYOYCVGZSBLXXHACCGQWKANUWDYANGAXKTXRWWYRGTSCSFCDMYVZLFNFUYSAVVYEAFJOUTNZDXRAYLXLWFIQTVAWPPEQVAHQLGPQPCLHTUFQFMJAPTYIFGURHTKHLIWHWZVGDXDTRWMOOEMNHKRZECNGVFNSDFROHHJIGEKLUSUCWBIRERBLZMGTJXTDHQARCYFAUEWJPDCHPXZCHFDGLXYJPYYMUWSWGVJSWMYDVHQPMUDFMUTNFVQPSGHDGDQBINUYLRTCFLQFSXOLVGWKGEKMCBKMCDMOFTGZDWMBPOLNJZAVFEDKAKYARYGICJQMWTXJFFANJQZUVYMMIEYHMKFDHAAUCXPQFGKUXNPAUSEAXRHYUAOAPGJPLGLKZGLRPBDGDKBYBPYIRFCCJMJBALZJHFBJZRKIBWVNYNBDJRGDAWLTYCVSVEKCTBHECOEFHCEPWDQNAXIDGAAJBHBFBENZCRZIUFWMRFDSCVABGENBVYADHTFJTKSRLBBPBURZHHXLBPTVASVYNSWZPAVDVLZUZAMEQLOSURTDFAXLWFHOYSXGWNLVZPLGXDPHMYJGWYNLAYTUPMDBWEQJXJPDYTXCBALCNGXVKHVFKBMYOCKCHBBSPAUZPIZPPMPRQLNDVUIVCCIGQTXTMYKBCVEXAECQWNBIUCYALLHHRAWUEDFFJRVVUUZJGEDXSBOHTPCTFVDAIOOBPYZKDRRYYUOTIVWDVFWIOZOEZSVULYQWQIRWAAUVWXLEZGDUNRSBTSWONEXSYCALLFEZOFDPMBTWBBWOSKRCJDLDERCRDPTBLHGMUXULRVAPQCQTBPGRRSLPNTBDVPQJVALCZEWMNSXOBWGFKURLRWCALOMROGTPDYCMMMCTDHKFKNUIPIFRGXGWNDILDXWOXEXMTUHHGZHQGZSHGENJIFZLGFJJOKNEZICMVVIUTWTBLGHODNNYJUSLEGZYWNSCQLUDURGFQVIOIIJWOJFDFWJVNRCWOTPMIKRLUTOUDYBEFUHBAPCWUXAYUHPKFJRLKJQRCSYFBZUYBDALGWHURWMTBCVQBRAEGTCEJUEGMLZRGEPKJOTQJNKRZIJGGOWXQCDQJPDHSNNOZNXBJUTGCKODLPYFBHLLDMILUSFLGPYDMTNLTZMNWMDYEIXALKAUEBIQLXZUISTUVIZQOLDTMQTMBTQCVCEDAWDKLKCRNQEWWADMOLDEIXIKCQLKDUMUZWKVYQGRPUYWGUWFQFNYWKIJDRJIFUDZGGBSZUVKRURCYIBQQOSXTBHGJYSTDJGDMBCZREFUQVZEAOUICJOIZBOMVRMPGBZDAUPXHJYRUVIKJSSDSSKZLCJOAEDFCBDBFUHYGXRGRIZOYHTEQVQLQGWBCBQOUGACXFARQCQIHZYXGQDODUKWQVYNZXSCJXNVITLXODEMLEPLBKMYSXQHJRSCZVMGVIJJHNNDKJRJKTEMBUGAEZDMBNRUPOECCZSHFYJMKWTTUJVIJDMFDDEKZWURKPADGOYLBBGEPKNDSPRHTXRSSPEOKSGRIWWODYSAVFGFWKGIETFYIWAYLBRFZYYEJIJOEIKDYWJOJIIQSRASOMVXPULYYWQMBXYXJZLMKMXVAIFUFWQOJJGBNWEMDOFRUZWYQWHCIXZJNXYVHVUYMOCJLKZUXHAVTQIRIQNQWAOJIGUIHSRGIHFOFKOIELWDVOFEBABTJLHHBGAXHDSCSQRRWQFUDYWUZWSCRIRVNQBQEMBYVLJFFATXSVNSYGPQNPKTSEZVZEMVSQYNCWLMIGRLGAWSQBWJIYOBTNKLIGUJNYWUEHIBMMUCCJOQKNFUIESDJXKPASXMMHZFZCUARWEPEZZIAZCPFPIRDBFXTTUPHWTMWGVATYCIBECITGZZOQWAUSMZAPAIECELXSTKXSEPXUBZCAZYAPFIBKOCZSRUAPJJHYTHGRLUEAKSFTNOZFZREZNBOYLZWOMFVYLJSKVXAFZTIGJOASMCDAZPSGVKIJASCFTHIYSJPDRRLKVFIAPDVPTIZGYDPKVAIHDBPXDBXKBSLDLMRJFBSKZYMSGWLDBDXFAYCOSROBECENKGYURKPWMTUGPPRMYHCJJHNEHEFQBIAKWBCKPLOUGBJOSASHWTSVRAVUMNVHAKPACVANUBLCFIFPSTKJSSNMZUNZPXNCKOUYWCWBSAGXMGLDVJFKQOLTMGNDAXKBMUZHJHNKXEYRMESQTWMKVJGOAMASLCUQWILHCHILUHSVPUGHWJFFSQMECUNCQRVGUKFXDJIPRTXNYYPHSDRIFDOXXUOFKUXOXPZTSGFNCWWQPZJLBRTCLLFMXMZYSMXDHSJLXNCVHBRCPZLVUGDZRZBAJYGJGPELPVIYPCCYARDJUPCBKMCCHENCHZJMXGDZNUAIUGOLOUADMTTMOLEGHCCGOFJCYBXWPHTRCOBQBIVPQASRWTKRVYMIKFAXBJHEBLDKMIEAYMIKAXILBAQTDJKRAESZUUYGFCPRHFBRWHVKYPFOHODJSEOAKNRLHZXPTTFAKAPEQQJKWVYMTJLSOLOYTBIGHUFOOSPMWXPFKGDBSZUNMGOPWRNLLBBJDKWUQFDOOOIIMDQHZRVWOJFPZHNWFZAGJXCFIDOAFYFXUHGUKHHQHVLQJGSAPAJLIDVKYXOISEANCMARRWDBYSQZDEEKJHRMEUGSDHVRNMYDJJVQSKWDNGLDOPQCYXRBALXGGAJHLPGEZAJERDPLWEGIZFVHURCJJLWNHDWUQOZKVJDDUIKDBQRAZXOTRUUUVKCXLYLYZFXZGHVMBBYGWVQUTLUYNSHVZKIUXARPIQAIFOSFGMDJVOHIQZAQBQKFRHVOSQWYMJUMAIOWIELGBJIYBGXBGXDIKBTFACLYCWBKXTRWBWBAXKWYRNGQLRWTBVMVPVTBXQAZFWDHPHOMGIAPUNBQICWKRVLTNIBEHCPRQRMATKQNNOFGTNXRKMSLXPZLCLRVADUHSQGVHTIDUNIOFARQRTOSFPOIFBPTFONSQFIEJGEIBRNDWJJQPIBPRAGCQTCLQXRNGTBTMWZJVECKBSHQBDVPZWMXWBVECTIEMRTMLALPCDIRKILXYQETLAVGBRZJIXHXQUTATXKYGFDJNXDWURCXPBLWFAWSZAWRIBCDDDCDNCPUHPXJQAFJUYHVSCLGUOULOHEKJRTBOQTXEQPWCIJVFZADZPOCBSSRVKBKGBKCJYRHWUWCAQJPYDVDNEBTPZKYVVJYDRZEETBREWSDXQRUQTSTAYENMMVCDBHMEOPRBKNKBELDXOTDVBXKYMNFLCYLHOXYNHFVHKSHDVTDZFMWHKMSDUTDJMBFBXTYZBKDIAHSHVGHIAUXZNNXZNDKAFIHXFQRSFMHYJKZJKWZYWMALAEWJUUDAUOIXQNVLWTGIIBVPAYWSPRWREBJITMLEBFVRNCDPSFKAMILRDIFICXOXACKTWRGVPOSSDCKCKEJMECIPNSOXPAXXOMAHBRNUBJCWNEVWUPMJCTTMTJONDBZJLRBPLGSFPPGERYRGQGDSWOIRWXCEHJMOPDJWYEPYWIUWUKRXOJWSEQWZKOTXIBWHJVLKRJBXBGGREFMYFJCLSZKROLEFGRKDSGUTWCJYJYUHTTPAPCWWUYRZUHGUMCPXXODVUKTUJSFHOACCVAULATKJKIBGOVTDDFLKJXWGCSFAWZKFBXNNFKPZQKFNCFBISMKWJTAXACTZBDDNMOEFOTDDVKNBCHNWHMCCQXHQMOZFCHQOAYHMFXMIXUYNNPNPHJXURMVRFEDJHOFWTNTPVUCFCPOWXMLNXUTVMRVAFGUIASEWWVAOOCIBZQAFLJLQBQMDTQITWUHYWVSTAGACGFLMQSEOIMUGNXONXSLVIWRFCVFYLGNSZVBDEIWECVDHUYAXXZWDCMLDIUTQXNOXOJQWJRDRMIEDOYOWBXPRTMYZFCXPJQMZQVJGSRNCLGPKYQEJXMUDHYXETZTEKWPTXCGBTJUIJVGHSENOVECPHOAGPNEQIJCQLCLCIPPUPGKWUK", 4777));
    }
}
