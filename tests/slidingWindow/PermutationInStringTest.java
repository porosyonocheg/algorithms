package slidingWindow;

import org.junit.Test;
import static org.junit.Assert.*;

public class PermutationInStringTest {
    @Test
    public void checkInclusion() {
        assertTrue(new PermutationInString().checkInclusion("a", "a"));
        assertFalse(new PermutationInString().checkInclusion("b", "a"));
        assertTrue(new PermutationInString().checkInclusion("ab", "ba"));
        assertFalse(new PermutationInString().checkInclusion("ab", "acb"));
        assertTrue(new PermutationInString().checkInclusion("abc", "dcabf"));
        assertFalse(new PermutationInString().checkInclusion("abc", "ababab"));
        assertTrue(new PermutationInString().checkInclusion("store", "toster"));
        assertFalse(new PermutationInString().checkInclusion("store", "reesto"));
        assertTrue(new PermutationInString().checkInclusion("gniqbcb", "xsvamfvbingcqbsfwigd"));
        assertFalse(new PermutationInString().checkInclusion("mavfdgxsignqsbiwfsn", "xsvamfvbingcqbsfwigd"));
        assertTrue(new PermutationInString().checkInclusion("ycnmmmvfv", "cdhnxutbnmpidvfzxfbvvfmnycmmataqybcahazmzgvyhvebxk"));
        assertFalse(new PermutationInString().checkInclusion("w", "cdhnxutbnmpidvfzxfbvvfmnycmmataqybcahazmzgvyhvebxk"));
        assertTrue(new PermutationInString().checkInclusion("osjsukaydwfwgopmacnuufmeycziqvvwyfkqxjxyjavsgplsxjzqphrissbsnoorvxuplxehtavmtefzgbdqpiqtbfajatfaizpgnjvqiglndhlshyelyekpqcmpmmzuulobdfklmqlzznlgnfnaji", "osjsukaydwfwgopmacnuufmeycziqvvwyfkqxjxyjavsgplsxjzqphrissbsnoorvxuplxehtavmtefzgbdqpiqtbfajatfaizpgnjvqiglndhlshyelyekpqcmpmmzuulobdfklmqlzznlgnfnaji"));
        assertFalse(new PermutationInString().checkInclusion("sssbs", "osjsukaydwfwgopmacnuufmeycziqvvwyfkqxjxyjavsgplsxjzqphrissbsnoorvxuplxehtavmtefzgbdqpiqtbfajatfaizpgnjvqiglndhlshyelyekpqcmpmmzuulobdfklmqlzznlgnfnaji"));
        assertTrue(new PermutationInString().checkInclusion("jfkzaiblrpzeexeufsrdduuikaykyyrvqbeviefbouxnpkqcfmbdzxlwdeowtklzkamggztzzzqamnvbczwagtgixrvnzpllpwscchpbsrkgcbteqzjirpxlltbnylktunazzzsqepauewbkqnuyzd", "hdvlqhwbhknztngniuvxnhwlanifffstpvncwujuxtyzrwwcfykskkwazaxdrkxninughflehdobpyutcxqbcyesfqsyunxqusoadiyftvtzphnnsuudjkuooroqzqcgvaaxskbritlaysfvpuauczrnbgarttnwhmsemdnxqbqxwynvqmnmhwwimysptibtueexffywllndfpncxodcqphwlgxgpmduswgupsoqwhkwvcanwrbcbtfkjzkodfqjldhrzzctomokngukspxypxonbzmpvuuuunyxkqzfjakqzuuxypywpwcvizhwpottxgveyarkdizdkfmqfglqfbymbcnnpabbdwbtdnlrsksztbrqqeuxvekgczalryqrgkdltrcpepgnuapkvfelcfapzuzynapzbmzlwzlcpiqkeuvixzxzepvimageulbiaznzfkkhsfydqzdjzjbbwrwanszonbgtiuekotxzyktluyxwqmec"));
        assertFalse(new PermutationInString().checkInclusion("kywgxqlidebpkeyhedvtwunmxtzgtxzkpbkcqzkjqvwaftamfuqbpjzraryewlzxcoudczgkpfknacldzbqmncpzlseiqazzxslglssbqvlitieezluydpueftnvakbearyrznurpnzgzuobwbibrz", "hdvlqhwbhknztngniuvxnhwlanifffstpvncwujuxtyzrwwcfykskkwazaxdrkxninughflehdobpyutcxqbcyesfqsyunxqusoadiyftvtzphnnsuudjkuooroqzqcgvaaxskbritlaysfvpuauczrnbgarttnwhmsemdnxqbqxwynvqmnmhwwimysptibtueexffywllndfpncxodcqphwlgxgpmduswgupsoqwhkwvcanwrbcbtfkjzkodfqjldhrzzctomokngukspxypxonbzmpvuuuunyxkqzfjakqzuuxypywpwcvizhwpottxgveyarkdizdkfmqfglqfbymbcnnpabbdwbtdnlrsksztbrqqeuxvekgczalryqrgkdltrcpepgnuapkvfelcfapzuzynapzbmzlwzlcpiqkeuvixzxzepvimageulbiaznzfkkhsfydqzdjzjbbwrwanszonbgtiuekotxzyktluyxwqmec"));
        assertTrue(new PermutationInString().checkInclusion("atfbfruwbvibushfjwgsjydwsgugfzhkwtajaiwfiuycdputnwxrfdpkrhmtpdyphphxkvtqbsvtohoivmtvuqorpqibvxurxocywsuceaaeirp", "xwbdodufoghmsvhrptnlorvymumsamgingouytceivxwaboksesvmgvrovyzueaqfmrqcjbrwjduumqxrgdatihtfohdaavsohffwvspubdtuypwtfrbnxiecijtpuxyfhobiuryqxhpavyswhawibvspmkrwittfpgkgvqzkreupuowvcslyfkidqrjuskkdjkdfvriwluxpyvvbqltotqhvcapygmxbwtftbnqkvrojeaeffdezdoagkhgzxwfishvwuegzzvigpbwhaccgrkwvgbsfckqrgenquviiolebjivbopuoengvuqdnqdsxisujuuypacwixyvioglfmrcgxkcpvhaghrrnecvvabxmbanezmqegkorvhshychqczyoawwhlyjjrntnncxkixsfgjodxkdozjbgjilkgtnaoafwzhouuyuagehmivnsapaxquilutaviydnkxwjvbswvrclmzuqapqmmboejczoxyoqxtjkpzlbozzkazyoahbctdyxaexbxpnddlmgeodmlynqijyqmfmsswernxybripcwfiydnezcjqgvznkfpbbpfewslnadnydvezmbvnbfbygwiemevgwhnkszwepfadnwvrblcmocjbyjfektwhkjcxpbpkzjspxcqmqullbrcirhjhwjevemfbacmfwmmhwtafvbeezoksswphdztbrnzygxvmjvhhjvolagkbjraahmzyudjtxtzablswfjudmhnxpfevrowfdjohnhiaqnpprttulkuypjicrzmnxprhadyzmdcteszbzuytejhdsfueuvalazfvusmdpkmxkbfccurxjvoewpcacfnrnfftgsndfvzkudpdczjtmxqsaeirqlfugthbzpzwegfxcagfzavkqryvdufvyxporvicnozjxhwlxzyyyhjqseetlyxsyjhgdtrbqlcevyuiqoguvbsobhonatjkxsjvjflnhwnpcncnunyoxdrnbhdenduvxswyrzwjasrvnzcalykgwmlvmbpblybrjdlksufdutxfrgtqvhtxbjsmhgbkdqcexghqdmqgprphlcaylysdypuhqdfdpfrdjjmxylptvflloaypccbhxbxafaxyegcifrlaoighqpahtlnrnogpfoufutpspfveemqgyugemgnaqheqccexgtupunlzibknxnmkuuuyesuflobbrbmazmsqpaktedtvgmtfiauxxvsrklkbvxojujngrrosyfkkndvcailcsgptzkyplhomkkpxafzlrwlezfqwxzandzcrvsslgjxidfaydllbtbikvwnbuotmamgkhhiyxiqhjejdvmsarzbyhjldujgjvsqjckdmfyoxkchjsvxerfskvyojnhykxtcyhdvslvanhvdupdeewwbztuvkwmrzegirksglgmrhektdfyrxompeeocupqbazoecxiopmxpothpekrpnupqyacgzuklq"));
        assertFalse(new PermutationInString().checkInclusion("wjqxufpunopmdsaufaefthvbacgwhiuituwwtxgypibkiyorbudvryafiopdbjaeistqjhmvbdfpogxvtfshcvvryrqutkstkzxhpwruswhpwrcsfald", "xwbdodufoghmsvhrptnlorvymumsamgingouytceivxwaboksesvmgvrovyzueaqfmrqcjbrwjduumqxrgdatihtfohdaavsohffwvspubdtuypwtfrbnxiecijtpuxyfhobiuryqxhpavyswhawibvspmkrwittfpgkgvqzkreupuowvcslyfkidqrjuskkdjkdfvriwluxpyvvbqltotqhvcapygmxbwtftbnqkvrojeaeffdezdoagkhgzxwfishvwuegzzvigpbwhaccgrkwvgbsfckqrgenquviiolebjivbopuoengvuqdnqdsxisujuuypacwixyvioglfmrcgxkcpvhaghrrnecvvabxmbanezmqegkorvhshychqczyoawwhlyjjrntnncxkixsfgjodxkdozjbgjilkgtnaoafwzhouuyuagehmivnsapaxquilutaviydnkxwjvbswvrclmzuqapqmmboejczoxyoqxtjkpzlbozzkazyoahbctdyxaexbxpnddlmgeodmlynqijyqmfmsswernxybripcwfiydnezcjqgvznkfpbbpfewslnadnydvezmbvnbfbygwiemevgwhnkszwepfadnwvrblcmocjbyjfektwhkjcxpbpkzjspxcqmqullbrcirhjhwjevemfbacmfwmmhwtafvbeezoksswphdztbrnzygxvmjvhhjvolagkbjraahmzyudjtxtzablswfjudmhnxpfevrowfdjohnhiaqnpprttulkuypjicrzmnxprhadyzmdcteszbzuytejhdsfueuvalazfvusmdpkmxkbfccurxjvoewpcacfnrnfftgsndfvzkudpdczjtmxqsaeirqlfugthbzpzwegfxcagfzavkqryvdufvyxporvicnozjxhwlxzyyyhjqseetlyxsyjhgdtrbqlcevyuiqoguvbsobhonatjkxsjvjflnhwnpcncnunyoxdrnbhdenduvxswyrzwjasrvnzcalykgwmlvmbpblybrjdlksufdutxfrgtqvhtxbjsmhgbkdqcexghqdmqgprphlcaylysdypuhqdfdpfrdjjmxylptvflloaypccbhxbxafaxyegcifrlaoighqpahtlnrnogpfoufutpspfveemqgyugemgnaqheqccexgtupunlzibknxnmkuuuyesuflobbrbmazmsqpaktedtvgmtfiauxxvsrklkbvxojujngrrosyfkkndvcailcsgptzkyplhomkkpxafzlrwlezfqwxzandzcrvsslgjxidfaydllbtbikvwnbuotmamgkhhiyxiqhjejdvmsarzbyhjldujgjvsqjckdmfyoxkchjsvxerfskvyojnhykxtcyhdvslvanhvdupdeewwbztuvkwmrzegirksglgmrhektdfyrxompeeocupqbazoecxiopmxpothpekrpnupqyacgzuklq"));
        assertTrue(new PermutationInString().checkInclusion("wmrlllvipgmvkhovtwnwdkmmsmtkzwyxporusxjronrydpozgihkersxnpqpenrjbvgllpdxiuqfdeckgsfwyjjoetzsmywmyzijymidbxfsuapsdmtsqxhtlvwrudkuhdcwrkicppquolbjbzfmqaajzopoojpfbumystoeqyggfwqgrvfxuoreoowfqosckhksuujbsivvqmozknbhjjdgxfebyjfawondpxlugdrnttybsazlfslhblgpeqsqlvrijlhwnhockmyxcjusnktaavlttcrlinemcxgbeiupzcdhxstfywbiumzkgrfymtrxhrjrttklapxnjqsmkhxkjghxdewzztxmqjilnzibfqyydfkdmbtxwoggnjdfccvymgwkinszddgevmrlcacaejobuuofipnsivtqqcfjvbobctbhbkwluglvoaqcvwxaonfbgidjlhdijhfkwmulgmxhaaezyvvwtvcnckfppqpxzhqclnnabbmnuknscnmjacyhwceiriltnblieszvmxjsfbhneukzreqodliewcafqrxhsgnmvzndjffxrzqyedsuhfeftnulkrcaosxdlayftwrnqqpnbiowfaywkflsfjsfblknkfepzxvuiucswzqvrgdqxpkctvrouutvonolnglbxnpohcoknyufmdsytxkllnozzbccwznpxjubpnnuksgsjrdmdupnoqmocmqlevtihysboyoflnbfurpmpzcteuebvnmttnwhlkdonbldkwzkpwebmbcnykqamlwahdreoruhnqpvxrkaxppatltyvrughnrzicsatkarschpibfkctyxjzzijjeemrlcczlncggpvmtozolqdyvmhkaeafpylzlgmmqtayolbczgyowtuadeqjexqtzbaqvnzmfhsfmiffzyeahyqzlmosvrtixhnauajmqwgzqappladaqwgiuecsoslnefttzpuoocdmpjslnvpjtgnrkpzdfywcurfzasrtvcgnryzaevlndtihysxxsqbxshdqvhxrumzgwnjlpzpwkwsgdlovrkiqsbmpzugzfcjgudqiypbibojeyyuuvkzcvudarpwfxgxnvshpxrnmxvniwjccygqljjlwdobbxczgfpmgqoqeaprnrdamnjfpouuwxckniaqxnreionuuprycdmknrdcisvndrpqzkcnjcgtxwhsqdhcqcmtgkwmlfetcqyltbbwxqokwhlfagigldvtwbkfzzbvtxdfjsctcdqkdybaeozprssjspuphvmvqrjivideyebdfvunsvtmqncfkeevlkolgnfcvcpgqasdwohbliwaizhpxquccebydqlxadxepljbgesbjwlgepaowmxtincgbhuupizciqcjffwuqwnziumqsiqgfhyexkuctywdvpqduyiyaptwkzhjacdcphnjvqhtolkslihnabvjpnsaleohunkkikqiatjbdrxxznbcuquzparomlhsjinxsxmprwpfeyyjogbyrcefwoaarsaazuauzdioxqxcsdwtyqnzhlyzjuiqmlpfwhtwtzwudqgrbpnkefxpygssfnrftilnevnyztzicnqftyyoojlwuiankcypafrrivggzuajfgawxjhkaxiknpujlfzdlxerpfdrsmeckvlkmdsfygmmkzwsqixwnoorzuyjksvltqyjlihxatuuvdzdmsbyvgmrwdtmilzgyqdkygxodytprgfqfztazkwqfhpvytphoeituuvxmglfyxebaqthcmzwqbejtapxijlajnqgmcfhiihgpuocnojguwrugoqipoksvgztahblormloaqizvkaunbatiuyfksepanhbjodgxvptahsrjxvwghsnebbffpxvhwvngyqleafyijfomnaorpkoxixmwknealkwruxqadgbbbbnuacbtdnfcmnlrofztihccaoxoslonmhwcxxzlwqdmckuiibimbauhccbpnbgwrdqeedfmqmopsqnacdntvkxzczfxqozhiaigcjpnxxmracmgtcfupngtqzyybbjadpjdpkgdinrfnqdwqvvgbozcninwkzqfikdnvgprrkpdkmyxbfwvpibzstsnxpighznckuaxbmawyixdnvkvxtwnaaxaggkoreuqbabmdjpyfjtnvyniolayogmaylrrgiqhgellphacncakwwvfagejxypeunuqueirwnwztnfvgfcovnatfbnmrwytjlfixprohxargnncyltjyndypoofeerjwroowlzkxmfeqtzsrbzadqmtzmriypytsobjzgslsoihmhneuttvxryihtdufljciyovkmmdswnsltafggzlyvxnjwsweejbnymhzpatqrpdgzhjpjwkxxepyhzvvbelimaarfgycsqnsrrlzldhwgvdrrvjjvvaipstcmkbltfktsrvpdvpacywzjfxurwsjpsbolzfoxjfcwogagbuqghsjarfusisrrvndwewixgmynqiutiiifgpcwhcgszykfvhopcpkkfaxffnnjndrxkxnizsbrjjagidsxthzugrjuigfuikdtvbmrwwunzkbxqbqjnexlqkrgqwtacdfmmcefivipuvzsvduauacktlfjtjisvezrycssddwwdamxvrrjlohntywvgmilersvsuwbybvhwrjcbevkwfffxhvndsbekvptbpwgrqwbjbgyyknwzmyiiwdhhohpjebrookqwxcrttthdcrrmqvmjwuddgvwpjecywxvaymgjczfdpmslhjoadgxciveyogphclooelmwmgkobcrnvsvpnryzcrniuujwghccwiduirpgnjqhfmbkeedvzfqlzedabxdesazyldalpakxrcnxgokdzrhhhfchibrmogdncyqztpcdhffeuknfyibbfkewowazahqytjvhmjqdhysgcnuopdmqokiruokienplnpavmvmxyfzdtbyjrvzgqcgawpqqdamabrkouwgnazvxehxhxoyjbenntefszdmcwoyklzrxhxawowiblijgslrqrstfqyrofdwsluyolyfwxosjlawugrcassinmldnxrxlwdutbpxyltfwywhodcdvmqgcybwegevnkqgqrjqhnwcwmtletvfdqczsxikarcebqismfurtujujydurevgilarwjkxouyleesmuglqhhnlapdkspymjtbscrykblbpoxogwjfjzkvvkywwihubopryfiideaouyjuecimkppevbqokvtlbygyxnuurfssbaxmtfbodlluateuctunmmxtqxdxicwyriczdouzpphrjwmglmbahlnvporkwnhtexcreuozjtmoiackbycygwkmrrtwiczegyscldhiagtjbijipaefmjrzydjmrwxaqojecwvhzzorzkbimeqovayrllbajuhsbxydaybdsgvakdmwotgczydtahozutxvbovsfkphjevpcknyehpwmiaitigsqlanddtwfuapdcfqftuhuddtzrhkcvvomcffmfsioqvfskijfswdmfzmrimiwtucltjudodzmuszftukchdyicqbzcmgpburxzrbhoyqdoglagcpagjjjzrlprmiiddjbdtxiotvhiounxutuumcixiyxplcvbhisklfuesrfirfaxlawuvrguodlgihbpkmtrxjicbpaxvocqxvyykpjdhujivzrkdcofjlquhmqqxqmyxznwhtiwwkgctumloafcbzitshwyewpbikjfnqapeqnqngdefkphseyapdfhfwaiqklsizrlhjkoqnpzjywycvrtqctoifdnvggedbxetishefyopczdkbitznrxylkulodjhsizpbcffdujphwrsxrbggdohxmomjzpcgnxoubnzmensppoylofbayuksofrjpewmelobgpoxtiweljbqvvnguucvggyhworqdehziighsrxhmooanfynyqspwyfupltsenqolpvcykjtuaucmsfbtjoejsrfdxezuvobjtjjyvzqugtsciguaovtpbqkwbxoaddcppaxrvzehtpiztalnszhsznsuxuoysjaigodqtmmmtiaonodmfcennlxzziufqkbfglrahfobcwrogrrzeqcncdeaxapzdcwzlqqlzqjdxnibahborzajpgpskalstdccqyqbmhbavhcngtrflajjxknyajfcmiswjgwdktnpcafnhtxuudiwjukuihrxhswbbbroxjjdjrqmyjjjfckwahzycfapbabgsqpkavxmtbwgqlehvympcyoxklntuviwtgfvouftvbiscmiilqvxsuhixjnuqpxjzqhdxwmhbnksyiejkynvisjrpktopdodzpxrhfvgzrctqyverjhwnbpayzfpebpltvakkaemctjrdewkkcufbxpyjwgkpiiuhowavylbroboyovwtivcqiavingbgwwakjkicogdwtfnylbrcszpdyjziqxiyrzcpgtjjgnxemaqrkmcvxxnpgvwhbpcsqvsuknfjbxnxqmekcfhpgszwxlygsvrlhbplnmjqkygnwsawgrjesobckuersnvdqtwjywqfshmeuqovpogcweyvzmrllkxwlssadqbsjynsgpcawdactveknkhutrdyicbqomiqamipyhfmvhhuaosedygyaqpjlizzikboebzyjbehtyrrkirbdgeahiwswoosogxrgrktuktnlowxgnmpgvacfnztmmacnajikaetjdmmbadokvwsldqrfjbubhtwkabzyynqozfclihstfvwckeifxszusobynaydczuuuzjileqqqutwutdzapydfhppmwkwyhyanivebzabathzdjnzwospjhsjhztzahissmnkyuyhhxwndndeijfgzvbmcyectjrdy", "lzhtyfrstfcamusecaeiazepiirwemhgwdrqikdizghxainpbzoltprjyzfxkofcapnskmjodqgxoaezauwvoionxcqqmqutrovvxokwtikcingnjgybbghnzcqavsmodfjurmrotgxpxpctzhsvgkrluhwumrrlfeimumzvpmbloiejngvtiigigrsjjsxsvgcuyhbkvfqtxsjhbtrwyhothpjhfzrdrfkincedykpkpfwuzurzfoforbeufiahgzsshawximynnyyzxutpyysaftcrlpvkcywxvzlxpbdobsitiibtxntafznkfvzactxwzhzadkboqrppyucqmswvdamkvwdbobdnrdilxwhopyvxrkqqntcsmwtskiknusqvutsumjoffqrnqoqsqxzbxtmtgsmvpftirhbehqeaddojsepukpzttmbnepastgbpiplofciiunzrxrxrcfusptdwemfnmrkjknoshszvggmyhxtakpiqinxbnkqltphmefrwyjjklilqeivnxkqcbcpttgfditooqvxaawtygkgyjqascbfywamyjbtsgfcigomkmjiqiexqxnlkgsksclrjhnktogftpplfgoinsjskqqoadpkqpwrdxaltkmugfunibnnyynblrvtqimblsrspioprdfxufdiuyozwmhxbnvetmpiyrluguibytfxymusapqswgyasrunwyoqklglifcjktifmpfmoinfrhauhpnkotvtmjeigjgcwcabrtqdeztrwbmfqspxxoawepcpnavwqhksqbqfthlsvrtzhvwdujysfjxvseuwjbcsbceozingakjdjsjlxtmdqqtxbcujjxasdprcxngulonoayglqaaandonuaalrfoynlooykuwjpiesyzsjhwcdibqcifgylzyyzuuabinejtxfnajcubifcqgegzgenagwpvabrcotsijigkdcqqmmdvorhqvzswofhwrqhziwiujmnxpbootoatefgvatlegrvgcwvdowuacukgsieqzyjcsenuwmqoscyburjbtuvjchhplkeasjfcpymrkofgocxdvgvngkbdanhkxthlxiqxbbbaqwtwladdmrnkiupfyadhmvulqyucqawwyfkqoblccujctzigsvhmjkyxbayqkzjsnxgvirbahqeniabqzajdjbeywfawdyeuqtuidfhuipclxcfgqaoisytunwdtcxxxzymnmwejsgmwndoxpnrvouwgiqprlubcwsynlwqgehwrwkkrrjdpgkkehmbcvzgwcsbkdtpcwtjrymtwyvkefvqfjhyrcpomgdmbtfmqohbsanzocdnjxltzfbzplsjpmohwouexlbyettskbgxmzxrhpyieqcgcfpcbhftpcnwvsdrrfsqlwhissjqsqychehgwtszvltumzjifjdrioywglcllkzqdweejttrxgsmjcbegilkdlvlrqavaxvdyciiiftmrvddsghrypysvsyamfxjzkrhgvrxflmzwuhndsgiljxvqulntxijsdynvgthuvjvskggxogzbpgvkaehrsgchyqgfalmoscizvkgynvmvrrgotjnvjipcliwdcgsvnodcsyrjgmifyuxcnxjhbxqekeimimotbckljbudocwawrxqpkxjoxreclqjrddseuwipvlcmcouzncgquselillgrfnmomardkphanctpqdovuzucgxpsqgcelxdoluizxzbkpohxvniniawpzyzyqkolxovbmbhrcnbyfyodkhfljvwwiotixfabgqsibewnadeycbfkrxwefvqneqkzfixvzycfzmbjhqljowavihuamabvlrlflixbujhzhdzmbwsslhdblukfuaaxzfyolcdgvvdzbjdwzcktcsibmzrkylfytfvrdrwvskkzrsxlitwwtyzaoyonjhopbazucoehaqufkvqysjslwnspdvirpsnakjtczrboycwmbfpprphoddrktmkmddasgnxtsgsojlpnxmkmwuxwkebrbnekrngvbbltjnfcyjrqbtquarrwzysfinjsgseuynzmwvexowqmterovecjeszutmikcjrzzmgzlxtzadrjhwwolpoaccbjmpyjfyqvjyybppfhbfgnudxlmdmjuziarhlatyqbisoeilgmncjqpvkdmnecggztrioyckohthxslbwzsfvzsxspgvkjhfcvrjhzssoroaktjeknfzuhlkdopwcndurgrtgkwqldtecqxmxltoqhmpiunjazomehfkwnrmbknrlgnerwnfdfchungvfpzddtbcmiqtzvqvrgrialjjpunptaxicxiheyoywlawtxahmmoaibvmrgxqkpgviynkahmdypyatlqpnayyjcttawayfrnksbtydxdwrzgucwtkofjiwmsflkrqlfaddhnxfvtsixahbqdowupxiukgjadbelgwfomiiywzzafdfdvanpfjbkhcdpwxhqyktoypwqildkfnrqacjkpsliopevmbzkzbvqcgclhlsbkhoqadwxbkqxkptbxefzpctzfvyaobjvbnrjyfocffezjzqzcjsbayozfcpkbntegkqozhluundcbolzlwbkadsanpdmwalqqebmqiwjidmiesoibjzifuwjzgopbusekhbfnbkbownzosgwsjbxaiflfirsecvaxewhcpiartwpuvaynuprkjpberbmryqoysafzpwzbifnueakqvqomyljweauztztynovanheegyjukfcdfmaovnpoliighyntajjkfrdsbpuqzblindkmidhturwxwymgabayojidhmuyififuiubclvdipddbdauoauwuhldyzwcqxfgmppwiecaqxoschoavnmoozlrsurdpumeonbdhpfngttdfpxflezunkjdfkwtqddlypjgvobyrrtvnwdkzyubgjwvuyhadcrpcwlzkwmdtfxuvfrzutufeyrjyhcvbgcazbymhaajvhrkcmitychixhlyxgpbznkucffcwdxkspenqlwumiiyvqthngyqahedyywvjyfumgctfvyzbjgiurnafcgaeonssnipwjghusbbqxuoowjcixlojzzvdsanbyuhiakvdzaohduxfhzgtpyuxvoyyjirhkjldgxjvcaqmdtsvnwcvrdjdxbpgfqtwpovqeaitrcegarhioqxoaedwmnunroguattgbrcqyngdoxhkmmfhaurqadbvikivsgvmdytmyixyfgjtskyukfkhlyknsktiwnbjicfhxzdlzmldpgoceamaspmmljdwihcgntlawihxneazznfausodmlamqoltnpqpuiausxsksrqfhwrlzbdolzpqkxrxmjjfgrxikhksihzcwhyngapnhjllshxcistqydnpewfbauvtilpcauncqgvwkdkgxlnwsoaymxcpohjihcbsxcuokyinsjgfmlygazwbtnstecxenxgqfvnmjrpnrpxkzxupfbmrrngykcqozmlxqswoyhkgagiekghtrdmcnsnsabvzoqpenndgezrjimeghofdylwdxefvfrcvnbjlvikwilaigyeavlssxoontjmtzhazvvcyyzwaygiwetawqqsesxddjpwnagcxarnqfdbcgjzaadfzmkghnzbuysepomrzcgxqddxenbtzjwhzqumtsithfdacpcjxymmaoizzezituglivjjwhbgmjcgljpvllnbagrlhnmdmidckndhyknzshzuxcvgqusxapsunjgfppjxpzqeolfuqzftrvuwuvyynsgbphdhrmmcrcksicchedbrcvfzfaaymqdfxpejwwlvkfpvurufpeagdxotzdrkszjwtlbmrztynhwlnwomblcyddjzstigbngcuxslpgayudporrzahouhuwpfeqqdwjjucubdgnlglchnqkkdodszlzqdmovpxfuwyhcbzhrtubdiufbbvtepjgadddrykurajckwdfzgfhdryqarjaijubvcvfgxfsgqqrnjefrwccxtmqcseceiqkeswkmzonrbdvbvpfrukemphpxvflhlxezonpoqpwiskomenuhfitronvjjkpgkdlxxzfrbtbrdlzrybpptzmdetdlxijxiaiqmfhfauzqqjvndieoluwlyowanomhvpxlpkawzjwcoewpimcwesznvbvdxzxkjijumfmglzvxrwqnhekpzygkquyjcweqvqqlwurprxcnuttzlayouumxucrpaeebipvuzstaooewwazocqmlnwlbjicvumyfgbnckekmqymmyowojoprdkjhhpwnuvcdsqroppunsnvopcpbwtcchxseatvxhywlwmhbojicehytvlacedohvcnlanotisfybvbokufieaezrfwqzmfrdbpwbvfhptjhoagovmndpvphnmlbeoamxnfzfqtjuqjxetcueviolyelpxjkfjbibrwnquixgvcjqpcjernmoukfkdotcwymcvolbdzpngnpmpvvrmzxliylyjttywvhiucaaaiwqawxdntwzlhajmwwodumoanpadqgyzbyhjprfurxychwxassqjpnnfoxwxrotnanjveuddzeteayhqcyaufjefcgribrroaetrhaujnxqkhmpemhelcylnqtkglucnsnkrfswgkybytnrdfibppoznbckhwaygsinbptzujjduzoqrvowrwvstyownpydwbyjrkxhrbobqgiklmhmuweonizongpkxtxqjyehdancwyssxtejcsjewkgrigpestbxylnbvjfpvvedbvlvvejlpnyjwirzhcprusyhzdlmgcglalfngnjrqtbxrlaxzipzhylbctvqdbfmftwwamhkrijptxpiucqeidxqosyyspiqpydcsuejznnrquzwubt"));
        assertFalse(new PermutationInString().checkInclusion("jwucuknxpisycbqmjgacgngirsprsearymnoetaxilatmwqhrtqrejkofyuofanghyxwaowgvkmuqvoeoxnamktdmminvvjfsuldcorqywpleeryiwxqkzcqqwwhgppsnxdtitsftwxudgmtnhviyeuvtpkucbpqeigwciqrajkjbexnsfagznmujycqjyqrakycelycjjburgwnkvhtjuqfbbfrjepshpazwpwdboqyttlquqzdvhociajufoevgoyjnwyhfiyuxzjtfineuciiwrdmydazobdkwygipmeppqjhykogjvgshsmxatqezowycsfylantggmocfyitnayzrtdvbsyaodsozlfjjwjahaoeuexplgppkcouswhnwwrsxqqbrstuiltnruojnuavocsiiifncjqbhvjapaqblcoltashgwgcvalneolmjclxxwaquivpptrsrqsibumakvfjzwxmvulxfnlkqgmuusxxdvkbtwdgqxnuqufanstudxflbdzywqrwbhhuxhbirsddckzxmafdhmgwknsyqzggcdcjxkfjiytuadcbrcukabzdbsziuywlfwrhbwbbcdabdpaacqenghcogiciogbolageoeffjkdifnwv", "lzhtyfrstfcamusecaeiazepiirwemhgwdrqikdizghxainpbzoltprjyzfxkofcapnskmjodqgxoaezauwvoionxcqqmqutrovvxokwtikcingnjgybbghnzcqavsmodfjurmrotgxpxpctzhsvgkrluhwumrrlfeimumzvpmbloiejngvtiigigrsjjsxsvgcuyhbkvfqtxsjhbtrwyhothpjhfzrdrfkincedykpkpfwuzurzfoforbeufiahgzsshawximynnyyzxutpyysaftcrlpvkcywxvzlxpbdobsitiibtxntafznkfvzactxwzhzadkboqrppyucqmswvdamkvwdbobdnrdilxwhopyvxrkqqntcsmwtskiknusqvutsumjoffqrnqoqsqxzbxtmtgsmvpftirhbehqeaddojsepukpzttmbnepastgbpiplofciiunzrxrxrcfusptdwemfnmrkjknoshszvggmyhxtakpiqinxbnkqltphmefrwyjjklilqeivnxkqcbcpttgfditooqvxaawtygkgyjqascbfywamyjbtsgfcigomkmjiqiexqxnlkgsksclrjhnktogftpplfgoinsjskqqoadpkqpwrdxaltkmugfunibnnyynblrvtqimblsrspioprdfxufdiuyozwmhxbnvetmpiyrluguibytfxymusapqswgyasrunwyoqklglifcjktifmpfmoinfrhauhpnkotvtmjeigjgcwcabrtqdeztrwbmfqspxxoawepcpnavwqhksqbqfthlsvrtzhvwdujysfjxvseuwjbcsbceozingakjdjsjlxtmdqqtxbcujjxasdprcxngulonoayglqaaandonuaalrfoynlooykuwjpiesyzsjhwcdibqcifgylzyyzuuabinejtxfnajcubifcqgegzgenagwpvabrcotsijigkdcqqmmdvorhqvzswofhwrqhziwiujmnxpbootoatefgvatlegrvgcwvdowuacukgsieqzyjcsenuwmqoscyburjbtuvjchhplkeasjfcpymrkofgocxdvgvngkbdanhkxthlxiqxbbbaqwtwladdmrnkiupfyadhmvulqyucqawwyfkqoblccujctzigsvhmjkyxbayqkzjsnxgvirbahqeniabqzajdjbeywfawdyeuqtuidfhuipclxcfgqaoisytunwdtcxxxzymnmwejsgmwndoxpnrvouwgiqprlubcwsynlwqgehwrwkkrrjdpgkkehmbcvzgwcsbkdtpcwtjrymtwyvkefvqfjhyrcpomgdmbtfmqohbsanzocdnjxltzfbzplsjpmohwouexlbyettskbgxmzxrhpyieqcgcfpcbhftpcnwvsdrrfsqlwhissjqsqychehgwtszvltumzjifjdrioywglcllkzqdweejttrxgsmjcbegilkdlvlrqavaxvdyciiiftmrvddsghrypysvsyamfxjzkrhgvrxflmzwuhndsgiljxvqulntxijsdynvgthuvjvskggxogzbpgvkaehrsgchyqgfalmoscizvkgynvmvrrgotjnvjipcliwdcgsvnodcsyrjgmifyuxcnxjhbxqekeimimotbckljbudocwawrxqpkxjoxreclqjrddseuwipvlcmcouzncgquselillgrfnmomardkphanctpqdovuzucgxpsqgcelxdoluizxzbkpohxvniniawpzyzyqkolxovbmbhrcnbyfyodkhfljvwwiotixfabgqsibewnadeycbfkrxwefvqneqkzfixvzycfzmbjhqljowavihuamabvlrlflixbujhzhdzmbwsslhdblukfuaaxzfyolcdgvvdzbjdwzcktcsibmzrkylfytfvrdrwvskkzrsxlitwwtyzaoyonjhopbazucoehaqufkvqysjslwnspdvirpsnakjtczrboycwmbfpprphoddrktmkmddasgnxtsgsojlpnxmkmwuxwkebrbnekrngvbbltjnfcyjrqbtquarrwzysfinjsgseuynzmwvexowqmterovecjeszutmikcjrzzmgzlxtzadrjhwwolpoaccbjmpyjfyqvjyybppfhbfgnudxlmdmjuziarhlatyqbisoeilgmncjqpvkdmnecggztrioyckohthxslbwzsfvzsxspgvkjhfcvrjhzssoroaktjeknfzuhlkdopwcndurgrtgkwqldtecqxmxltoqhmpiunjazomehfkwnrmbknrlgnerwnfdfchungvfpzddtbcmiqtzvqvrgrialjjpunptaxicxiheyoywlawtxahmmoaibvmrgxqkpgviynkahmdypyatlqpnayyjcttawayfrnksbtydxdwrzgucwtkofjiwmsflkrqlfaddhnxfvtsixahbqdowupxiukgjadbelgwfomiiywzzafdfdvanpfjbkhcdpwxhqyktoypwqildkfnrqacjkpsliopevmbzkzbvqcgclhlsbkhoqadwxbkqxkptbxefzpctzfvyaobjvbnrjyfocffezjzqzcjsbayozfcpkbntegkqozhluundcbolzlwbkadsanpdmwalqqebmqiwjidmiesoibjzifuwjzgopbusekhbfnbkbownzosgwsjbxaiflfirsecvaxewhcpiartwpuvaynuprkjpberbmryqoysafzpwzbifnueakqvqomyljweauztztynovanheegyjukfcdfmaovnpoliighyntajjkfrdsbpuqzblindkmidhturwxwymgabayojidhmuyififuiubclvdipddbdauoauwuhldyzwcqxfgmppwiecaqxoschoavnmoozlrsurdpumeonbdhpfngttdfpxflezunkjdfkwtqddlypjgvobyrrtvnwdkzyubgjwvuyhadcrpcwlzkwmdtfxuvfrzutufeyrjyhcvbgcazbymhaajvhrkcmitychixhlyxgpbznkucffcwdxkspenqlwumiiyvqthngyqahedyywvjyfumgctfvyzbjgiurnafcgaeonssnipwjghusbbqxuoowjcixlojzzvdsanbyuhiakvdzaohduxfhzgtpyuxvoyyjirhkjldgxjvcaqmdtsvnwcvrdjdxbpgfqtwpovqeaitrcegarhioqxoaedwmnunroguattgbrcqyngdoxhkmmfhaurqadbvikivsgvmdytmyixyfgjtskyukfkhlyknsktiwnbjicfhxzdlzmldpgoceamaspmmljdwihcgntlawihxneazznfausodmlamqoltnpqpuiausxsksrqfhwrlzbdolzpqkxrxmjjfgrxikhksihzcwhyngapnhjllshxcistqydnpewfbauvtilpcauncqgvwkdkgxlnwsoaymxcpohjihcbsxcuokyinsjgfmlygazwbtnstecxenxgqfvnmjrpnrpxkzxupfbmrrngykcqozmlxqswoyhkgagiekghtrdmcnsnsabvzoqpenndgezrjimeghofdylwdxefvfrcvnbjlvikwilaigyeavlssxoontjmtzhazvvcyyzwaygiwetawqqsesxddjpwnagcxarnqfdbcgjzaadfzmkghnzbuysepomrzcgxqddxenbtzjwhzqumtsithfdacpcjxymmaoizzezituglivjjwhbgmjcgljpvllnbagrlhnmdmidckndhyknzshzuxcvgqusxapsunjgfppjxpzqeolfuqzftrvuwuvyynsgbphdhrmmcrcksicchedbrcvfzfaaymqdfxpejwwlvkfpvurufpeagdxotzdrkszjwtlbmrztynhwlnwomblcyddjzstigbngcuxslpgayudporrzahouhuwpfeqqdwjjucubdgnlglchnqkkdodszlzqdmovpxfuwyhcbzhrtubdiufbbvtepjgadddrykurajckwdfzgfhdryqarjaijubvcvfgxfsgqqrnjefrwccxtmqcseceiqkeswkmzonrbdvbvpfrukemphpxvflhlxezonpoqpwiskomenuhfitronvjjkpgkdlxxzfrbtbrdlzrybpptzmdetdlxijxiaiqmfhfauzqqjvndieoluwlyowanomhvpxlpkawzjwcoewpimcwesznvbvdxzxkjijumfmglzvxrwqnhekpzygkquyjcweqvqqlwurprxcnuttzlayouumxucrpaeebipvuzstaooewwazocqmlnwlbjicvumyfgbnckekmqymmyowojoprdkjhhpwnuvcdsqroppunsnvopcpbwtcchxseatvxhywlwmhbojicehytvlacedohvcnlanotisfybvbokufieaezrfwqzmfrdbpwbvfhptjhoagovmndpvphnmlbeoamxnfzfqtjuqjxetcueviolyelpxjkfjbibrwnquixgvcjqpcjernmoukfkdotcwymcvolbdzpngnpmpvvrmzxliylyjttywvhiucaaaiwqawxdntwzlhajmwwodumoanpadqgyzbyhjprfurxychwxassqjpnnfoxwxrotnanjveuddzeteayhqcyaufjefcgribrroaetrhaujnxqkhmpemhelcylnqtkglucnsnkrfswgkybytnrdfibppoznbckhwaygsinbptzujjduzoqrvowrwvstyownpydwbyjrkxhrbobqgiklmhmuweonizongpkxtxqjyehdancwyssxtejcsjewkgrigpestbxylnbvjfpvvedbvlvvejlpnyjwirzhcprusyhzdlmgcglalfngnjrqtbxrlaxzipzhylbctvqdbfmftwwamhkrijptxpiucqeidxqosyyspiqpydcsuejznnrquzwubt"));
    }
}
