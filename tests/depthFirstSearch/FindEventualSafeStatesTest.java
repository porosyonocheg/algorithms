package depthFirstSearch;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

public class FindEventualSafeStatesTest {
    @Test
    public void eventualSafeNodes() {
        assertEquals(Collections.singletonList(0), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{}}));
        assertEquals(Collections.emptyList(), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{1},{0}}));
        assertEquals(Arrays.asList(0,1,2), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{1,2},{2},{}}));
        assertEquals(Arrays.asList(2,4,5,6), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{1,2},{2,3},{5},{0},{5},{},{}}));
        assertEquals(Collections.singletonList(5), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{13},{2,5,6,9,15,17,18},{2,3,4,5,6,11,12,13,14,15,16},{2,4,5,6,8,9,10,11,14,15,16,18,19},{1,4,8,14,16,18},{},{0,3,5,7,8,10,11,12,15,16,18},{0,5,7,8,14,17},{0,2,4,5,6,7,8,9,12,14,17,18},{1,2,3,5,10,11,12,15,19},{4,6,7,12,15,17,18,19},{18},{0,1,8,10,13,15,18},{0,1,2,4,8,11,12,15,17},{0,1,2,4,5,6,9,10,12,13,15,16,17,18},{2,4,5,6,9,10,11,13,18,19},{3,5,6,7,8,12},{1,3,4,6,10,13,15,16,18,19},{0,2,4,8,9,14,15,17},{7,8,9,13,15,19}}));
        assertEquals(Arrays.asList(2,16,35), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{1,2,6,10,12,13,19,25,26,29,30,33,34,39,40,41,43,44},{15,18,49},{},{1,2,3,4,13,18,19,25,28,32,33,36,39,40,41,43,44},{23,25},{22,28,30,42},{3,11,13,15,19,27,28,33,34,36,38,42},{15,18,25,35,38,42},{1,2,3,6,7,10,12,13,14,19,23,29,30,37,41,45,46,47,49},{4,10,11,12,15,18,21,27,31,36,46,49},{0,2,7,8,9,11,20,23,24,26,29,42,44,46},{0,6,7,8,12,14,15,17,19,20,22,23,26,31,42,45,48,49},{10,17,19,21,26,31,43,45},{0,2,9,10,19,20,32,34,35,38,43,45,46,48,49},{6,10,15,16,19,28,38},{0,7,8,9,10,11,12,14,17,22,23,27,29,37,39,47},{},{0,4,6,8,10,11,12,13,17,19,27,28,29,42,45,47,49},{2,6,9,12,15,19,27,32,33,34,35,39,40,46,48},{2,7,14,17,18,19,20,22,25,27,32,35,36,47,49},{1,3,5,7,13,16,18,19,20,25,35,37,38,44,47},{7,18,22,28,32,35,37,41},{5,12,19,24,25,26,27,28,30,34,37,41,45,46,48},{2,10,13,14,15,17,26,28,29,30,32,36,40,43,45},{20,22,23,27,37,41,47},{1,4,9,13,18,19,24,29,30,33,34,44,49},{0,9,23,35,40,49},{3,9,11,12,13,18,24,27,36,39,40,41,42,44,49},{0,10,16,20,22,24,26,28,31,33,37,39,42,43,48},{1,25,27,35,39,40},{4,7,20,25,28,30,35,42,43,49},{0,2,6,14,18,19,22,37,38,40,41},{5,7,15,17,18,22,23,25,30,31,36,38,45},{0,3,5,6,7,9,11,13,15,17,19,21,22,23,25,30,34,41,47},{3,5,8,10,15,16,27,37,38,42,47},{},{5,9,11,24,26,43,44},{0,6,8,12,13,14,15,16,17,19,21,23,24,27,31,32,34,39,42},{3,7,9,12,17,23,30,34,36,37,43},{0,1,2,4,5,8,9,12,14,17,22,23,25,26,31,34,35,41,42,47},{11,15,17,19,24,27},{0,4,6,7,8,12,13,15,20,25,28,29,32,34,38,41,43,45,46,48},{7,47},{5,23,43,48},{0,9,10,14,25,27,33,35,37,38,43},{5,8,19,28,34,38,46},{0,8,14,17,18,25,26,27,29,32,34,36,37,38,40,45,47},{0,5,10,14,19,20,28,31,34,35,36,39,41,44,45,47},{2,3,4,5,18,19,21,30,31,39,42,46},{3,5,6,7,8,11,15,18,20,21,23,25,32,34,39,45,46,49}}));
        assertEquals(Arrays.asList(4,13,27,42,54,60,63), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{5,25,33,61,63,70,82,91},{59},{0,5},{56,79},{},{22,40,58,89,97},{7,10,12,49,53,91},{10,13,18,31,66,77},{12,25,27,55,69,72,90},{18,43,45,65,86,87},{5,8,9,20,35,72,73,76},{18,24,56,60},{30,50,88},{27},{0,8,44,72,89,93},{3,14,36,37,50,53,95},{12,13,18,29,33,52,57},{0,12,32,42,74,97},{15,19,31,35,44,45,77},{40,76,98},{9,21,34,44,45,64,81,82,88},{6,25,28,38},{48},{1,43,46,72},{11,71,86,87},{86},{20,45,58,88,99},{},{6,69,88},{56},{37,44,45,46,52},{24,36,37,50,58,66,67,85,94},{9,15,49,90,96},{41},{15},{47,67},{15,27,42,64,69,94,97},{13,74,93},{27,72,86},{18,23},{5,13,21,43,50,53,61,98},{8,13,18,21,39,43,90},{},{17,47,64,67},{52,81,88},{0,5,21,38,42,80,84,91},{1,29,31,87,93},{19,23,65,71,75,78,98},{31,51,71},{31,54,79},{8,10,20,26,29,52,69},{16,45,47,68,79,92},{3,16,23,46,58,65,82},{16,20,23,26,38,58,65},{},{0,2,50},{33,34,52,56,67,72},{2,4,9,10,69,73,85},{31,47,81},{32,34,43,60,93},{},{42,77},{3,13,65,76,77,89},{},{22,31,58,71,81,83,90},{0,24,30,70,72},{1,4,25,53,58,83,89,94,99},{23,69,83,87,88},{7,17,35,39,61,65,69,72},{86},{47,51,60,82},{39,42,67},{3,46,50},{4,19,36,56,57,84},{72},{5,17,29,32,45,51,78,98},{7,18,19,33,52,55,83},{0,36,58,63},{1,33,35},{23,25,51,65,86,93},{62},{45,79},{0,1,61,68,93},{12},{24},{23,87},{0,5,13,29,32,38,53,54,95},{14,20,40,58,75,78,81,86,94},{1,16,57,60,64,69,96},{4,7,18,34,35,98},{7,26,49,51},{12,21,40,46,68,84,85,94,95},{10,22,24,43,44,66,77},{11,30,31,46,85},{70,91},{20,49,60,66,81,89,98},{20,36,39,48,50,60,97},{5,20,24,33,55,74,80,98},{57},{13,18,29,57,70,78,90}}));
        assertEquals(Arrays.asList(1,2,3,4,10,12,13,18,21,22,24,29,30,31,39,41,43,46,48,52,54,59,60,62,63,70,78,80,84,88,93,103,105,108,121,123,129,132,137,147,149,155,159,161,164,165,172,176,179,180,182,187,188,189,190,192,195,201,203,206,208,214,215,221,224,229,236,237,247,250,252,253,255,258,260,261,270,272,273,276,278,283,286,288,289,291,292,293,294,297,299,303,306,307,311,312,315,325,328,331,332,333,334,337,339,345,348,349,350,351,352,354,355,357,358,359,363,364,368,370,371,372,373,378,381,392,394,401,408,414,420,423,424,427,429,430,432,433,434,436,439,445,450,452,455,458,462,463,466,473,477,479,480,484,491,499), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{404,491},{},{},{},{},{21,54,343},{115,156,209,317},{162,244,458},{409,420},{52,341,445},{},{177,271,279},{},{},{46,154,178,379},{72,195,243,470},{53,102,161,447},{2,60,171},{2},{52,212,383,488},{100},{350},{},{139,363,448},{286},{195,251},{325,481},{169},{121,148,402},{},{},{},{189,461},{59,80,117},{132,290,374,429},{356},{11,183,393,394},{5,136,185,372},{41,223},{368},{136,424},{},{174},{84},{375},{199,357,418},{},{20,258,346,397},{},{174,313,461},{374},{43,422},{293},{88,167,274},{},{239},{51,75,348,445},{145},{48,71,138,281},{},{},{47,390},{272,273,289},{},{177},{162},{240,279,448},{325,389},{120,225,404},{127,272,284},{430},{63,259,413},{111,419,448},{295,319,355,486},{244,246,262,425},{101,107},{31,241},{74,422,428,456},{21},{213,307},{258,270,394},{343},{417,456,471,475},{1,98,204,303},{},{13,107,256,373},{28,97,197,307},{100,133,332,356},{179,455},{178,456},{15,69,136},{87},{69,325},{88},{40,287,309,382},{30,66,488},{33,156,177},{182,265},{24,174,224,496},{184,279},{30,192,205,326},{16,470},{314},{},{417},{},{216},{244,268},{292},{257},{157},{222},{54,83},{53,66,402,480},{177},{186,220,236,240},{76,184,283,317},{78,128,275,351},{407},{378,390,437},{67,97,129,193},{},{9,12,109,339},{},{125,312},{85,107,261,314},{94,114},{76,253,379},{10,86,105},{},{76,244,496,497},{91,109,398,442},{236},{205},{48,429,464},{42,383},{110,376,485},{},{83,220,448},{49,238,250,351},{56,102,200},{85,375,439},{409,417},{23,77,78,441},{268,364,479},{59,184,370},{71,365},{},{266},{},{106,163},{9,475,492},{149,378,387},{0,438},{72,97,192,213},{},{293,427,468},{17,68,245},{152,225,289,383},{},{154,310,340},{286,466},{134,330},{364,403,467},{},{},{122,447},{59,235,420},{56,70,132},{336},{154},{167,194,300},{432},{317,360,464,477},{42,380,418},{81,440},{},{4,195,198},{85},{206},{250,484},{454,482},{},{56,146,370,379},{110,221},{158},{105,301,356},{132},{},{},{129},{29,183},{},{115,425,469},{24,379,430},{78},{82,103},{36,234},{119},{35,130,266,437},{5,288,377,444},{},{34,138,176},{},{340,347,490},{20,320,346,464},{},{125,141,170,312},{},{107,270},{438},{17,495},{35},{320},{358},{432},{53,261},{60,369,443},{285,337},{220,249,492},{304},{},{126},{0,494},{},{5},{396},{72,112,322,335},{133,398},{311},{55,414},{219,397,455},{35,306,374,426},{279,424},{26,194,336},{176,201,449},{},{201},{373,379},{8,85,221,226},{36,94,126},{7,63,396},{25,324,373,395},{109,363,424},{318},{151,158,329,386},{118,235,382},{},{14,29,352},{41,135,384},{},{181,242},{},{},{218,285,464,487},{},{97,241,392},{101,465},{},{142,252},{195},{},{210},{46,110,188,254},{280},{152,250,345},{195,222,248,398},{261,350,376,470},{27,74,248,358},{1,65},{203},{332,458,472},{},{},{144,338,451,462},{283,375,405,449},{},{7,16,53},{247},{126,175,286},{109,206,335},{270,280,436,489},{75,389,393},{},{226,360},{19,301,366,412},{},{52,201,213,321},{439},{189},{203,243,319,489},{},{},{31,137},{93,103,439},{37},{197,317,322},{},{107,291,302,408},{253},{92,152,212,242},{220,395},{230,462},{},{118,209,351,392},{198,253,487,496},{433},{},{9},{326,352,486},{26,181},{3},{},{1,146,312,375},{71,94,350},{},{45,60,64},{218},{31,114,368},{111,155,376},{263},{92,196,286,453},{13,304,354,492},{65,234},{314},{},{442},{85,175},{},{47,98,172},{69,136,209},{},{},{},{},{77,89,352,445},{5,165,178,453},{},{492},{60},{106,287,345},{6},{135,256},{166,227,414},{353,357,385,434},{},{281,368,428},{54,286,296},{},{54,354},{},{436},{},{102,418,472},{78},{29,164,423},{99,215,251,318},{},{},{},{78,137,166},{73,114,167,269},{93,142,160,372},{132},{},{142},{259,261,470},{281},{189},{144,152,298,357},{48,371},{},{},{},{90,203,345,443},{13,63,135},{50,190,349,379},{146},{},{65,249,388},{213,220,271,431},{},{206,281},{151,204,333},{197,417},{48,246,291,343},{14,146},{21,189,210},{431},{174},{488},{178,348,367,477},{},{31,227,395,474},{},{237,393,395,416},{137,271,314},{138,244,304},{38,265,333,438},{15,146,326,340},{487},{},{149,261,293,385},{102,333,388,438},{152,213,271},{19,423},{129,438},{46,425,499},{},{95,118,200,263},{328,406,478},{88,229,471},{68,160,196,459},{241},{},{140,263,416},{53,205,283,355},{35,355,488},{274,305},{318,451},{},{202},{46,256,294,469},{2,252},{},{33,55,97},{419},{},{32,237,365,409},{},{},{443},{70},{},{},{3,97,150,331},{215,303},{2,172,219},{47,173,296,425},{},{142,144,318,348},{102},{204,240,322},{105,419},{410},{70},{217,441,471},{204,350,478},{5,220,368,402},{49,143,426},{},{334,419,431},{433},{403},{226,315},{195,311},{380},{297,437},{},{57,283},{55,83,389},{390},{},{},{241},{69,83},{},{115},{17,109},{130,225},{141,150,208,340},{17,97,296},{6,87,333,447},{345},{102},{439,442,473},{37},{291},{32,133,244},{420,491},{},{10,277,295},{192,321,400,418},{82},{},{77,249,276},{116,272},{113,294,435,476},{129,257,349,390},{181,468},{99,101,470},{292,359},{123,321},{12,67,185},{19,32,173,377},{171,414},{300},{30,209,432},{16,54,65,159},{123}}));
        assertEquals(Arrays.asList(1,3,6,16,21,24,25,31,36,38,48,74,78,88,103,109,121,127,131,135,136,137,142,146,151,156,158,170,183,215,226,228,237,248,256,267,293,302,314,331,335,337,345,347,348,359,379,387,390,396,424,445,446,461,477,488,497,501,516,528,564,570,587,591,594,602,607,625,635,639,640,646,648,654,667,678,681,690,692,696,698,700,703,713,714,750,754,756,760,762,763,768,784,785,786,788,791,793,794,804,807,809,816,820,826,833,838,840,850,870,883,891,893,896,912,916,922,930,931,932,945,953,964,967,969,979,980,988,989), new FindEventualSafeStates().eventualSafeNodes(new int[][]{{220,350,488,848,939},{},{44,759},{784},{42,110,608,696,919,996},{169,212,381,392,548,680,831,946,988},{},{144},{59,87,132,138,154,334,499,720},{84,208,365,658,760,852,874,935,938},{572,706,734,900},{731,735},{199,351,698,970},{110,396,513,670,767,799},{555},{814},{},{148,229,336,439,444,648,711,811},{14,178,426,441,502,667,758,790},{5,88,216,288,315,355,526,607,919},{4,186,321,378,453,820,931},{},{249,855},{838,851},{},{},{64,180,236,793,864,868},{61,107,111,194,744},{394},{77,344,583,691,781},{47,60,838},{},{89,298,602,757,777,894,936,995},{137,306,801},{144,544,642},{185,409,460,486,538,572,742,882},{},{93,173,568,791,888},{},{536,592,734},{150,170,277,293,397,701,788,984},{125,158,387,514,542,636,797,800,881},{18,137,151,159,736},{7,75,392,413,530,708,753,849,854},{15,192,210,556,689,782},{17,159,292,367,579,839,917},{201,331,872},{177,424,470,482,691},{337},{171,361,528,614},{121,126,311,364,451,452,486,778,960},{100,261,307,506,627,631,748},{1,163,533,701,747,798,818,941},{323,455,585,692,730,773,830},{155,326,625,777,824,851,869,889,990},{910},{304,340,507,542,544},{68,118,283,306,611,702,772},{74,75,245,468,497,823,858},{160,388,449,512,558,640,872,930,931},{125,412,534,652,933},{451,486,492,636},{278,308,597},{277,463},{24,384,417,550,676,677,794,833},{226,346,382,775,916,946},{120,610},{84,102,241,452,558,826},{150,171,446,517,539,572,870,938},{100,477,599,600,967},{208,351,379,567},{615,898,940},{717,959},{72,114,927},{},{44,717,782,796,851},{88,174,214,221,631,736,872,951},{139,303,573,615,653,954},{},{453,829},{289,373,765},{8,355,423,950},{101,162,522},{1,44,112,472,495,954},{30,238,351,388,649,652},{268,337,765},{85,584,951,958},{500,684,716,830},{932},{378,428,516,579,729},{18,174,191,389,510,758,953,984},{259,418,699,884,889,956},{92,883,995},{382},{179,294,709,924},{40,123,408,797,855,965,984,989},{792},{229,601,650,817},{73,168,395},{578,782,852},{0,172,352},{158,261,277,475,561,714,772,793,998},{104,218,251,442,557,653,667,927,951},{},{177,245,901,992},{263,298,633,806,855},{399,847,867},{23},{502,555},{},{135,308,474,528,742,971},{261},{35,375,389,444,568,781,918,939,961},{53,144,243,358,408,801,923},{29,57,76,223,264,272,450,866,894},{362,503,505,543,553,732,856,857,932},{361,369},{352,379,507,606,781,950},{349,446,743,922},{425,879},{29,36,111,413,490,495},{},{12,50,204,273,324,374,542,659},{374,517,883},{131,140,142,187,914,938},{247,249,313,610,675,759,930,945},{42,92,133,464,530,634,762,864},{648},{41,418,553,712},{596},{228,314,335,722},{},{158,175,205,875,938},{440,952,977},{117,121,240,821},{},{},{},{84,92,93,202,472,498,612},{710},{53,368,369,485,519,654,704,924,990},{202,244,473,619,711,790,817},{},{14,402,648,658,787,873,957},{220,307,437},{157,404,478,827,950,997},{},{474},{168,460,513,518,859},{3,91,116,244,399,518,752,911,995},{69,216},{},{73,341,377,388},{206,471,489,881},{103,180,219,264,337,454,498,645,739},{373,436,835,850},{},{10,62,91,355},{},{84,280,441,694,762,804},{232,358,371,380,444,502,565},{170,206,411,611,620,652,671,703},{57,175,345,381,499,609,730,973},{239,415,566,844},{873},{368},{199,273,800},{824},{398,425,540,607,931},{58,166,168,209,271,307,396,535,581},{},{413,482,519,665,782,996},{60,286,455,459,470,796,804},{225},{184,330,483,523,537,826,958},{363,886},{24,512,787,804,844},{96,141,437,977},{207,401,404,677,847,879,890},{205,725},{190,224},{57,69,245,484,498,715,895,925,965},{49,145,933,967},{},{1,99,286,453,546,676,796},{59,128,216,677,818,892},{878,987},{273,298,574},{255,444,630,668,690,913,950},{196,431,452,872,974,984},{89,168,206,328,363,564},{29,311,802},{224,268,379,472,769,983},{327,458,852,901},{614,769,914},{971},{85,544,661,721,843},{93,116,479,727,983},{118,288,421,542,571,629,890,922},{614,719,791,838,964,970},{132,222,278,580,630,682,789,814},{76,657,898},{44,188,340,444,636,674,878},{97,110,607,681,694,761,783},{10,821},{14,37,146,337,399,511,718,779,813},{100,466,600,838},{18,111,497,616,646,685,716,869,942},{201,208,285,391,680,881,929},{84,149,616,660,700,816},{368,423,438,479,496,719,846,855,886},{201,228,305,416,439,522,778,927},{16,148,962},{114,703,758},{207,966},{},{356,459,532,719},{240,894},{59,248},{305,369,539,546,780,820,859,921,931},{185,283,412,497,526,606,755,938,981},{23,732,996},{22,71,221,358,494,682,855,937},{145,743},{113,507,572,669,891},{229,452,734,836,891,899},{},{397},{},{307,360,414,471,489,631,783},{114,343,467,474,725,738,745,853,893},{45,251},{11,272,444,607,637,716,843,936,966},{43,46,271,547,642,715},{157,266,331,363,503,606,672,788,885},{25,289,351,399,500,569},{52,73,142,209,247,485,584,593,992},{},{115,405,411,415,814,869,897,924},{584,669},{86,345,452,563,708,834,893,954,992},{266,278,660},{62,124,365,379,429,720,807,861,943},{103,355,458,567,668,720,939},{272,306,784,908,929},{357,450,547},{448,834},{127,344,452,455,480,555,661,769,831},{293},{162,459,673,711,764,917,952},{141,322,363},{210,414,442,642,713,980},{171,229,279,454,479,612,696,912},{376,413,719},{265,399,408,418,457,576,912},{448,472,551,792,825,881,973},{},{182,232,351,411,447,711,770,798},{218,392,748,776,939},{713,750,984},{298,947},{194,420,990},{183,271},{150,204,550,819,852,869,957},{31,33,120,412,784,990},{326,773,807},{76,173,283,308,347,453,776,824},{},{74,259,851},{60,238,270,633,876,960},{123,438},{5,52,116,183,199,388,838,850,897},{4,495,498,756},{171,187,461,500,590,637,738,780},{492,541,606,722,909,999},{55,208,403,425,626,637,652,758,816},{515,713,719},{32,152,318,612,811,851},{519,858,969},{485,488,539,899,905},{14,418,419,552,575,709},{333,542,573,721,742,965},{661},{6,548,570,804},{12,103,192,425,457,470,531,760},{292,337,636,730,784,812,993},{493,828,861},{44,90,262,362,818,970},{91,929},{86,162,569,575,836,886,887},{51,103,507,555,592},{95,177,263,529,604,684},{197,371,389,416,489,715,951},{},{162,659,787,902,946},{110},{451,523,526,613,624,768,860},{52,143,629,682,715,789,827,961},{106,188,456,542,639,732},{43,176,182,342,598,683,992},{44,118,354,492,533,700,789},{82,416,496,511},{},{119,248,516},{133,300,395,528,749,893,965,970},{53,159,376,478,541,725,874,895,911},{936},{186,206,440,553,674,718,991,998},{210,216,232,677,717},{533,792},{419,664,692},{161,277,302,430,608,857},{40,64,128,385,477,559,659,833,967},{368,561},{},{41,333,940,972,987},{37,245,586,608,687,756,853,901},{472,554,556,674,777,928,950},{70,154,343,531,625,843,990},{87,132,314,615,655,662,901,984},{13,140,367,472,517,583,929,935},{132},{116,255,391,690,696,821,829},{70,82,324,510,783,894},{400,431,459,504},{731},{257,452,628},{451,772,989},{43,95,358,364,440,761,772,817,905},{1,239,319,358,452,503,636,835,965},{118,457,492},{248},{42,132,346,380,417,475,672,862},{419,939},{180,471,607,632,682,835},{},{206,366,412,418,674,830,878},{681},{5,128,340,416,427,460,482,575,774},{24,29,284},{249,306,368,440,692,927,958,973},{370,561,620,763,868},{354,445,461,539,599,625},{0,451,508,550,564,568,631,674,796},{233,240,435,564,694,864,916},{},{85,324,547,589,767,816},{},{},{928},{108,183,209,214,693,713,739,850},{251,681,760,845,898},{27,60,156,517,521,565,900},{18,396,475,632,913,924},{295,370,396,665,693,771,871},{299,602,632},{77,394,575,586},{746},{122,240,245,272,393,424,526,667,791},{700,891},{62,98,409,499,582,616},{575,753},{218,319,556,620,651,690},{131,602,615,790,913},{202,203,220,476,499,718,904,994},{196,261,531,679,710,786,828,838},{337,378,517},{21,181,306,707,877},{67,121,502,898},{157,179,234,371,394,521,632,663,737},{237,349,538,848},{21,53,657,775,874,955},{291,507,547,739,823,941},{86,170,208,251,274,385,476,533},{67},{130,145,327,508,551,729,882},{72,259,319,323,513,725},{29,244,290,292,593,887,966},{29,35,475,530,730,775,784,856},{},{195,528,541,800,841,922,953},{90,275,347,366,633,727,836,871,956},{393,539,754,886},{691,833},{329,696,892},{243,277,295,585,605,657,664,738,792},{145},{},{200,201,354,460},{67,92,195,824,894},{930,932},{16,884},{40,395,411,451,507,689,706},{362,517,804,841,892},{39,69,321,440,577,632,640,843,865},{372,726,923},{},{67,148,885},{897},{295,492},{36,212,339,356,462,598,695},{0,4},{25,170,194,414,560,732,756,901},{218,318,380,726,784,987},{6,491,827,846},{598},{0,860},{872},{27,151,278,296,388,393,823,957},{268,324,448,827},{123},{268,702},{78,181,295,352,414,514,764,941},{286,908},{129,499,592,765,845},{443,505,990},{136,307,381},{375,849,889},{190,214,412,542,648,980},{270,353,542,718,746,934},{64,149,284,593,743},{186,306,343,388,818,957},{83,176,255,284,380,397,614,734},{167,213,399,410,573,987,999},{},{10,239,431,592,920,922,957},{43,63,89,203,237,303,437,584,704},{211,256,295,536,623,815,973},{263,717,769,884},{44,138,227,768,888},{212,247,338,388,425,428,438,745,938},{30,86,185,205,506,552,874,939},{255,259,960},{65,570},{254,506,522,547,674,911,950},{50,198,517,796,824,833},{561,567},{151,272,482,519,650,814},{56,78,259,497,524,542,748,818,824},{867},{783,940},{219,262,305,341,372,442,474,525},{378,755},{354,696},{789,904},{},{},{277,453,470,616,882,981},{278,306},{67,99,237,295,684,855},{37,285,397,403,759,760},{483},{339,368,841,853,910},{118,192,224,238,335,438,963,992},{551},{110,210,656,714,755,857,954},{71,771,822},{380,397,448,460,668,842,915,986},{186,254,612,684,750},{677,781,866},{118,130,149,197,224,293,317,368},{131},{857},{148},{65,370,969},{34,103,197,213,425,607,659,855},{137,157,158,258,501,540},{907},{617},{48,163,527,675,810},{543,632,679,851},{259,344,423,545},{70,119,390,451,649,856,887},{8,450,715,822,906,935},{113,419,469,512,606,696,906},{215,332,648,734,747,933,973},{30,185,256,577,888},{},{208,367},{529,648,736},{73,249,302,351,436,493,641,767,902},{73,368,431,452,717,731,827,853,904},{4,47,221,333,696,932,942},{907},{160,167,254,713,725,796,801,847},{58,335,794},{26,126,372,716,732,842},{54},{},{260,318,385,566,654,714,723,806,863},{264,480,488,589,611,699,827},{145,176,178,497,668},{112,267,282,514},{303,312,353,592,685,714,845,883},{3,14,119,245,341,381,557,852,911},{358,875,987},{113,322,404,474,543,647,834,847,885},{},{24,158,317,921,976,997},{259},{618},{},{0,180,196,512,613,637,741,796,848},{155,274,324,380,539,553,679,685,934},{98,99,284,496,859},{30,671,675,825,854,942},{176,667,678,730,802,965},{268,307,310,585,683,698},{124,184,398,472,646,871},{179,432},{427,514,515,708,987},{341,750,832,869,876},{424,692,715,814,867},{907},{66,340,461,504,558,666},{277},{},{49,154,286,291,361,558,780},{418},{303,403,709,855,888,954},{259,619,724},{20,468,713,745,803},{226,263,272,347,509,518,701,932,944},{22,48,81,532,597,994},{81,190,243,561,663},{99},{202,238,318,356,480,631,724,952},{238,702,751},{},{221},{85,313,341,366,420,583,684},{149,220,254,491,808,971},{282,391,579,639,791,986},{5,402,445},{52,259},{12,103,162,407,516,587,948},{67,368,574,629},{160,335,594},{34,135,285,514,556,609,694,768},{384,454,462,497,507,654,753,889,934},{204,250,701,752,893,977},{137,154,427,462,720,971},{76,568,684,718,970},{0,55,277,680,765},{40,350,411},{436,584,909},{85,149,372,648,700,758,814,829},{185,419,529,538,910},{233,519,685},{935},{80,374,844},{57,320,449},{132,303},{3,21,441,535,723,795},{213,706,934},{140,958},{282,298,423,431,704,862,928,975,995},{208,215,219,248,306,345,490,728},{451,617,802,900,974},{44,333,738},{818},{255,358},{271,523,626,703,958},{104,132,148,157,426,726,822,965},{},{522},{787},{479},{92,111,167,461,670,890,912,952,990},{282,368,426,458,477,539,695,784},{},{261,436,843},{244,560,668},{201,434,482,567},{103,253,443,522,548,793},{81,339,588,623,747,895,913},{588,920},{598,878},{13,163,544,767,863},{58,114,201,475},{378},{219,270,318,407,439,495,579,905,971},{37,141},{487,547,661},{106,274,867},{73,295,375,466,574,616,659,673,895},{62,588,614,931},{},{30,112,386,877,978},{658,934},{34,367,557,814,981},{},{41,45,58,379,505,673,938,970},{26,421,540,642,996},{},{7,104,217,293,314,532,580,668,849},{151,197,501,530,640,756,780,831,832},{403},{589},{93,258,273,865,939,972},{15,101,415,712},{24,53,383,401,533,559,587,677,938},{446},{1,127,297,544,780},{49,299,635,693,757,833,841,856,921},{61,189,706},{220,483,727,774,792,886,950},{},{109,233,861,887},{11,81,216,384,614,743,912,932,995},{110,186,507,561,625,644,735,960},{118,188,449,818},{40,60,171,233,258,360,427,492,716},{43,89,242,257,354,381,473,919},{490,545},{42,324,443,557,879},{154,610,823,991},{335,388,925},{539,619},{171,340,776},{209,214,452,673,767},{175,216,361,425,635},{217,382,631,677,692,752,822},{120,374,658,720,819,860},{101},{},{11,440,720,756,804,864,933},{22,156,462,480,802,847},{173,183,220,431,473,652,688,768,818},{159,234,277,814},{15,621,662,732,905},{527},{95,189,265,393,679,683,753,795,825},{308,540},{70,271,509,510,690,885,922,957,973},{},{7,611,650,734,814},{601,796},{138,236,268,344,641,728,865,902,935},{},{},{206,500,766},{41,45,165,906},{102,252,405,417,596,892},{45,80,142,235,344,734,807,895,929},{568,617,732},{},{483,488,822,844},{},{144,192,371,379,467,588},{85},{277,391,414,680},{258,279,283,342,387,410,540,697,818},{177,223,433,577,809,835,991},{},{4,107,174,296,403,712,751,878,925},{160,328,541,568,720,954,994},{349,642,825,925},{420,644,648,737,756,808,818,860,998},{332,415,478,854,901},{293,543,575},{90,144,463,554,591},{838,865,946},{18,787},{982},{29,260,758,784,805,933},{30,197,417,568,577,889},{},{312,769},{170,483,501,559,600,825},{97,458,509,523,666,769,999},{39,396,932},{805,816},{229,328,394,654,795,850,908},{357,430,543,594,612,915,962},{12,33,465,554,585,709,807,924},{139,145,235,238,270,403,672,764},{90,565,753,881,940},{},{113,658,683,734,850},{555,596,821,918,986},{698},{0,261,488},{201,296,449,563,651,715,758,966},{481},{2,479,579,587,862,917},{415,894,975},{235,790,942},{49,202,251,683,725,733,962},{95,216,298},{},{37,155,321,371,393,682,899},{},{23,110,186,398,526,555,770},{5,523,638,662,727,892,899,918,975},{43,49,88,308,335,368,425,734,856},{},{227,519,650,710,730,912,987},{},{17},{},{113,162,170,191,561,713,818},{32,130,303,310,466},{},{143},{133,426},{160},{241,301,640,804,905,912,940},{4,131,582,608,889,936},{29,158,172,527,786,805,840,882},{327},{579,736},{231,689,764},{},{},{473},{203,474,522,528,587,624,845,860,907},{257,266,533,550,720},{188,364,555,699,756,902,998},{89,153,242,517,537,804,809,813,841},{177,548},{207,307,319,535,754,801,889},{83,88,304,325,372,478,972,993},{158,413,502},{537,565,723},{29,61,363,510,854},{7,502,541,830},{607,920},{149,173,219,254,553,591,650,682,952},{22,57,93,149,422,515,540,604,913},{863},{446,868},{6,13,174,259,485,502,869,982},{102,181,397,656,681,683,746,796},{304,873,942},{365,366,596,688,838,892,961},{28,45,560,617,865},{1,867,898},{82,144,205,218,271,743,909,950,954},{45,687,873},{50,148,451,573,886},{282,710,982},{81,163,268,560,768},{2,347},{683,815},{445,496,520,709,722,748},{66,68,327,491,637,868,933},{724,912},{46,130,252,458,483,705,748,885,891},{204,350,446,875},{},{260},{47,108,216,374,498,564,688,696,751},{80,142,396,499,556,596,751,820},{},{302,454,467,557,667,669,727,831},{},{220,546,553,627,853},{189,282,412,450,466,562,943},{168,206,298,401,425,723,937,972},{},{179,236,469,892},{},{},{75,683},{116,340,483,943},{82,210,333,427,784,936},{4,248,307,445,534,564,595,773,842},{},{117,869},{61,222,513,774,806,825,872,908},{248,309,376,797,950},{41,268,480,568,680,786,798},{34,102,236,561,712,972},{914},{606},{96,380,996},{257,279,328,520,643,719,978},{293,496,618,667,813,909},{371,514,546,671,800},{70,120,250,506,542,560,728,863,886},{73,153,963,991},{213,519,520,638,846},{52,126,426,542,560,931},{},{314},{},{84,172,365,367,376,579,775,829,958},{},{210,416,921},{3,74,485,578,588,716,907},{127},{3,535,954},{},{},{65,258,283,307,332,451,684,846},{99,542},{4,60,117,216,300,329,657,739},{126,180,283,686,767},{132,160,560,589,663,743,963,994},{85,112,571,592,779,871,895},{297,476,575,683},{5,10,39,586,599,925},{74,142,234,246,434,460},{},{2,321,424,527},{53,489,571,657,716,831,999},{},{129,388,514,779,867},{},{291,311,367,391,438,451,588,637,701},{172,715,780,792,881,921,982},{37,53,190,396,605,671,918,986},{56,150,457,526,783,889},{85,171,247,608,752,915,961,998},{313,582,781},{},{356,495},{199},{356,822,962,991},{570},{60,111,196,271,538,650,711,760,969},{102,236,240,487,506,741,833},{896,986},{67,131,463,776,779},{95,166,228,466,467,749,996},{},{169,527,577,855},{8,25,27,517,579,640,905},{680},{74,245,420,501,601},{23,619},{71,418,458,509,558,808},{},{65,81,303,856,885},{41,139,180,384,501,961},{12,78,380,545,585,622,650,948},{23,220,401,457,634,699,768,807},{},{10,39},{},{132,167,282,473,669,843,856,924,945},{203,436,533,683},{127,199,256,335,684,877},{40,100,158,994},{58,335},{254,331,562,633,700,741,809},{575,879},{744},{158,222,271,614,702,792,943},{},{279,342,496,562,634,735,878},{448,456,722,936},{129,146,409,567,783},{168,178,198,400,493,591,964},{66,205,427,447,751,769},{41,67,185,233,306,434,482,553},{71,197,267,366,682,831,832,961},{224,285,401,563,617,797,896,943},{382,537,661,691,731,857},{45,674,948},{27},{154,393,645,962,998},{84,348,429},{176,256,374,444,526,645},{175},{889},{34,78,410,471,733,966},{17,97,140,372,411,524,589,592,876},{197,590,693,699,859},{809},{2,113,183,494,684,775,927,983},{362,453,491,844,864,964},{513},{575},{167,236,241,290,437,484,598,836,931},{134,371,864,897},{414,480,543,617,789,819},{292,484,493},{164,171,291,422,475,479,528,709,788},{62,105,362,533,671,695,796,870,897},{134},{67,193,706},{},{49,643,652,922},{44,210,296,298,488,808,846},{5,38,288,352,354,509,591,966},{426,634,714,747,794,924},{42,63,802},{375},{622,851,920},{},{15,658,771,863},{},{80,142,194,440,513,816,832},{75,145,146,274,710,960},{},{334},{240,242,475,548,612,637,776},{46,97,139,373,945},{54,804},{104,136,394,949,951},{560,733,773,915,997},{121,374,527,592,698,708},{119,153,180,467},{140,292,590,634,730,758,916,964},{20,94,315,792,871},{90,453,475,550,563,811,911},{340,558,579,613,620,639,689,725},{253,861,966},{105},{71,378,518,624,744,883,986,993},{},{118,159,179,251,268,796},{53,284,376,936},{185,216,446,573,586,886,895},{},{313,465,522,594,926,950,952},{64,121,249,531,611,849},{455},{260,294,362,812},{80,163,683,921},{},{198},{812},{153,578},{157,723},{33,614,690},{1,21,186},{91,655,917},{},{},{},{113,362,623,656,661,988},{0,56,90,350,571,576,792,972},{322},{137,377,429,821,906,910},{8,211,507,585,622,770,851,996},{130,380,402,500,527,845,920,954},{94,342,397,414,447,552,618,639},{47,91,143,618,858,939,953},{247,290,312,360,439,473,513,611,793},{139,447,548,731,805,907,912},{57,60,139,287,582,738,842},{245,343,406,737,752,822,898,984},{},{134},{842},{13,354,446,813,976,985},{236,268},{168,306,646,781,921},{186,422,941},{726},{},{259,340},{56,126,276,391,579,743,839,842,885},{164,372,629,708,799,808,933},{14,640,818,956,987},{5,297,419,637,987},{98,166,234,614,662,680,708,765},{71,524,788},{33,942},{132,351,360,717,849,850,883,960},{41,381,757,970},{},{65,82,465,589,873},{319,415,748,781},{},{302,843},{},{49,131,537,869,908},{653,688,737},{841},{1,58,194,426},{133,264,423,738,926},{96,142,537},{279,652,961},{179,302,483,537,892},{223,325,401,673,745},{},{},{17,458,622,635,781},{167,610,859},{95,271,700},{47,206,253,535,802},{64,90,506,800},{18},{50,249,283,383,460,644,650,727},{},{},{564,852},{68,83,535,545,921,978},{51,99,660,700},{40,89,164,938},{38,283,458,617,815},{106,475,513,594,614,827},{231,268,340,357,420,560,668},{84,227,262,498,714},{595,690},{201,207,334,951}}));
    }
}