package greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimumNumberOfArrowsToBurstBalloonsTest {
    @Test
    public void findMinArrowShots() {
        assertEquals(1, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{5,7}}));
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{5,7},{8,12}}));
        assertEquals(1, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{5,7},{3,6}}));
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{10,13},{1,3},{3,10}}));
        assertEquals(2, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{10,16},{2,8},{1,6},{7,12}}));
        assertEquals(3, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{10,11},{2,4},{6,9},{4,8},{5,7},{1,3}}));
        assertEquals(10, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{36,38},{18,21},{1,2},{8,12},{28,30},{5,7},{13,16},{33,34},{3,4},{23,27}}));
        assertEquals(6, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{-12,8},{-6,42},{-41,-26},{-29,47},{-6,29},{-27,29},{-29,40},{4,35},{12,38},{-43,-17},{-23,12},{-42,26},{3,28},{-24,10},{16,35},{-25,22},{-17,5},{27,38},{-27,30},{-43,43},{-42,-21},{-11,16},{-35,-10},{30,35},{-42,-24},{13,31},{16,34},{-27,0},{13,24},{-29,1},{-33,-7},{-47,36},{-16,44},{-26,0},{21,24},{-40,-31},{-8,43},{-44,5},{-24,21},{7,36},{-22,-4},{25,31},{-37,42},{-26,8},{-44,41},{-47,-41},{-23,24},{-6,34},{-25,-23},{-6,28}}));
        assertEquals(47, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{241,248},{175,197},{118,148},{-39,-24},{83,107},{187,197},{-193,-168},{-68,-57},{-246,-242},{-143,-138},{-17,-3},{-244,-217},{-219,-198},{146,154},{18,32},{164,178},{150,174},{-43,-41},{28,37},{-19,-15},{-164,-151},{-70,-43},{172,198},{218,223},{-14,-11},{-128,-100},{-205,-194},{224,244},{5,12},{-147,-136},{-176,-166},{-239,-238},{-160,-145},{-175,-145},{-86,-82},{159,177},{-169,-155},{-72,-53},{2,29},{-240,-213},{225,227},{0,28},{218,237},{-88,-62},{24,47},{138,157},{130,144},{45,52},{41,54},{160,168},{178,204},{-225,-207},{79,93},{104,110},{-144,-141},{22,31},{-115,-86},{-118,-97},{-97,-88},{-134,-118},{71,88},{-149,-135},{-7,6},{148,165},{38,50},{-213,-210},{-62,-36},{-194,-188},{62,70},{-18,-12},{-67,-50},{-236,-229},{48,75},{42,69},{70,93},{-122,-112},{-204,-203},{27,45},{-8,-6},{36,39},{18,42},{8,9},{-242,-213},{-171,-143},{168,194},{108,135},{9,25},{-236,-235},{-244,-241},{154,157},{160,167},{-45,-15},{-7,11},{111,133},{-240,-214},{-132,-113},{-189,-174},{222,233},{86,107},{31,58},{-32,-25},{-163,-137},{-179,-162},{63,91},{143,156},{-172,-150},{211,220},{-111,-99},{150,178},{-247,-234},{-106,-86},{-79,-77},{-110,-99},{130,156},{-23,-16},{129,140},{57,65},{-25,-3},{92,117},{-86,-62},{-105,-84},{84,103},{38,50},{-104,-93},{-77,-49},{53,76},{-106,-101},{233,240},{49,60},{101,103},{-199,-174},{-31,-4},{-71,-62},{147,160},{232,233},{-36,-24},{31,41},{38,55},{-190,-170},{-59,-47},{20,38},{35,63},{105,112},{67,71},{-162,-160},{10,29},{-96,-79},{-121,-105},{214,231},{83,86},{-1,28},{195,217},{-232,-206},{152,154},{-117,-107},{140,158},{-51,-35},{-169,-141},{-98,-86},{-30,-16},{-248,-237},{103,123},{72,100},{-89,-75},{15,37},{36,41},{86,112},{188,201},{-66,-45},{224,243},{-196,-177},{-154,-135},{-110,-80},{-133,-111},{-240,-230},{-170,-166},{-78,-63},{-70,-45},{-220,-202},{-141,-140},{-150,-148},{-179,-174},{-226,-215},{-68,-46},{145,173},{69,95},{89,119},{198,201},{-37,-13},{23,39},{193,204},{-99,-95},{5,14},{-22,0},{-137,-122},{-17,-9},{-198,-171},{77,106},{30,55},{188,209},{152,161},{79,98},{-236,-235},{81,101},{-242,-225},{92,116},{103,131},{98,109},{-86,-84},{-101,-76},{103,104},{-118,-89},{-218,-189},{202,211},{-172,-165},{0,21},{25,54},{-118,-103},{188,203},{87,98},{218,240},{179,196},{27,42},{190,200},{170,172},{167,191},{208,212},{-3,15},{189,211},{-176,-171},{9,34},{-176,-175},{-248,-241},{-197,-168},{229,235},{-249,-222},{-139,-127},{-132,-114},{-118,-112},{-193,-187},{-153,-139},{6,23},{56,65},{-179,-165},{-224,-208},{-46,-31},{14,18},{-119,-96},{-16,-5},{96,114}}));
        assertEquals(179, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(new int[][]{{-1461,-1366},{-488,-469},{-1502,-1448},{345,375},{-2299,-2217},{1068,1083},{1980,2007},{-1632,-1550},{-1389,-1313},{875,881},{-801,-783},{-1587,-1572},{-1881,-1861},{-923,-823},{-868,-838},{-1465,-1409},{863,945},{620,639},{2482,2487},{621,673},{-1184,-1109},{580,588},{1124,1151},{-1561,-1493},{-420,-323},{-2009,-1987},{-884,-882},{-1102,-1019},{-1321,-1252},{-919,-847},{-184,-129},{722,819},{-1879,-1792},{-1089,-989},{-113,-68},{779,841},{-139,-61},{-2345,-2307},{136,169},{2294,2391},{-1189,-1112},{420,458},{-733,-644},{-1720,-1668},{-2386,-2367},{-1564,-1481},{-204,-105},{-337,-314},{-2133,-2130},{-20,9},{722,749},{-205,-154},{-1147,-1138},{-906,-814},{-1116,-1114},{1312,1370},{1073,1112},{2449,2469},{2361,2362},{171,241},{-1287,-1226},{2005,2054},{181,273},{1063,1109},{1927,1963},{864,895},{-1548,-1469},{1455,1456},{363,429},{-1549,-1520},{897,953},{189,264},{-218,-149},{-227,-175},{-321,-290},{-345,-319},{-653,-556},{1836,1905},{1694,1709},{381,390},{-904,-819},{2021,2090},{1754,1844},{1803,1868},{-2410,-2342},{-1170,-1124},{-336,-299},{482,555},{1862,1873},{-2442,-2354},{-263,-176},{-2352,-2271},{1852,1873},{-141,-136},{1237,1315},{1030,1038},{-2477,-2408},{-2338,-2283},{1203,1228},{837,907},{1379,1402},{-478,-419},{-1062,-1057},{225,291},{-2368,-2273},{486,550},{2226,2323},{2131,2227},{-1350,-1323},{-215,-161},{1732,1764},{547,623},{1981,1994},{1713,1757},{-565,-534},{-2497,-2399},{-1977,-1905},{-240,-197},{-2257,-2226},{1273,1351},{843,876},{-942,-926},{-1699,-1599},{866,915},{-2401,-2354},{-913,-894},{-1341,-1249},{-673,-665},{-2497,-2421},{-1517,-1477},{557,580},{-1426,-1414},{821,841},{638,697},{-1553,-1518},{2144,2200},{2043,2126},{-343,-303},{1529,1614},{131,191},{1170,1263},{-1558,-1539},{1480,1565},{-1826,-1756},{-2202,-2130},{975,1070},{-1786,-1759},{-2499,-2497},{964,1005},{156,233},{2210,2217},{475,508},{1333,1397},{2014,2102},{-126,-71},{1161,1239},{-1740,-1701},{200,286},{2271,2316},{2186,2269},{-1562,-1547},{1779,1858},{1467,1557},{1495,1517},{-1733,-1680},{-1242,-1226},{-778,-689},{-2009,-1995},{2327,2330},{886,896},{-2259,-2243},{-990,-937},{-2213,-2211},{2010,2015},{891,942},{-1757,-1693},{-1343,-1295},{2170,2176},{-799,-700},{-2405,-2330},{-326,-280},{2342,2441},{-83,-58},{392,425},{-1219,-1173},{-2300,-2268},{509,544},{964,984},{1095,1143},{533,601},{1841,1891},{243,286},{-290,-273},{-964,-906},{-284,-198},{398,399},{2195,2208},{661,717},{-840,-801},{1008,1022},{944,986},{-1172,-1130},{-1657,-1561},{150,161},{-1513,-1448},{-2026,-1957},{-964,-900},{2394,2488},{2106,2174},{-99,-45},{-1859,-1791},{663,709},{1588,1632},{239,297},{-237,-180},{-2497,-2469},{-210,-167},{2431,2437},{903,995},{337,430},{-1253,-1221},{-27,65},{1032,1131},{377,476},{1313,1391},{-612,-562},{-2132,-2102},{2487,2491},{2320,2404},{-1046,-1044},{1339,1415},{919,943},{64,121},{1288,1369},{306,369},{-894,-810},{2048,2131},{-327,-302},{-893,-846},{-920,-909},{-791,-774},{2159,2209},{1800,1880},{1097,1117},{-979,-904},{33,74},{814,821},{-2000,-1965},{1962,2042},{-944,-942},{2229,2235},{294,322},{-2455,-2422},{2178,2217},{-1433,-1427},{-1443,-1380},{1144,1184},{1351,1356},{-1550,-1523},{583,592},{-1824,-1814},{2263,2286},{-2044,-1975},{2448,2456},{689,752},{1231,1259},{-212,-117},{2077,2151},{1083,1168},{488,547},{345,379},{-1483,-1394},{-2342,-2341},{-295,-273},{-1847,-1799},{-1386,-1364},{761,838},{-1842,-1822},{1106,1151},{-228,-181},{1470,1471},{2400,2478},{1809,1903},{-45,-8},{1374,1468},{127,188},{-673,-603},{-1761,-1744},{-2414,-2396},{1215,1224},{-1357,-1345},{-1237,-1141},{466,544},{-2397,-2380},{1278,1329},{1848,1853},{-35,-28},{-1055,-1010},{266,306},{835,859},{-1436,-1429},{-2383,-2378},{-1541,-1518},{-1825,-1750},{1854,1862},{1002,1015},{-244,-235},{2386,2421},{-2317,-2243},{2155,2161},{-220,-216},{-2490,-2396},{-547,-510},{-755,-668},{145,235},{-449,-403},{-742,-734},{170,210},{1563,1632},{1261,1296},{-925,-844},{1277,1371},{-2216,-2156},{-1067,-985},{-513,-444},{-1742,-1738},{-1685,-1684},{682,749},{2199,2215},{-2063,-2036},{447,515},{69,166},{485,509},{-2476,-2471},{-2451,-2427},{-39,-3},{744,784},{1943,1958},{1022,1105},{-2013,-1950},{-489,-427},{-889,-873},{-1467,-1368},{1248,1277},{-236,-234},{950,978},{-2207,-2163},{1463,1492},{-1278,-1224},{-2209,-2153},{406,430},{576,595},{815,893},{538,591},{-2082,-2000},{-2233,-2201},{125,178},{-43,13},{-1338,-1311},{-480,-445},{2264,2287},{-452,-364},{1799,1800},{-350,-260},{867,965},{-2282,-2250},{-592,-536},{736,835},{-1875,-1818},{41,86},{-679,-629},{-2027,-2020},{-870,-855},{1951,2045},{-810,-736},{-1842,-1797},{-68,-49},{-2094,-2025},{-269,-175},{-1241,-1226},{1184,1274},{2047,2126},{1000,1027},{351,420},{-923,-904},{496,551},{1566,1624},{1893,1968},{9,78},{-1982,-1907},{-15,11},{2435,2444},{1263,1353},{1794,1856},{-2171,-2103},{87,112},{1048,1137},{488,551},{1411,1475},{-2370,-2310},{1656,1678},{2097,2191},{2055,2121},{1304,1361},{1679,1738},{-84,-47},{-1353,-1265},{1211,1238},{-1258,-1213},{-855,-772},{1737,1748},{-1186,-1171},{-2062,-2019},{685,720},{-1615,-1570},{-1129,-1040},{-2447,-2419},{1864,1950},{-254,-191},{902,964},{742,747},{-742,-698},{-972,-914},{2295,2368},{-918,-902},{1512,1593},{-4,35},{-315,-279},{-735,-677},{242,340},{584,681},{975,985},{-881,-834},{-2268,-2193},{-460,-362},{-877,-790},{-749,-685},{-1594,-1500},{6,20},{2249,2294},{-1534,-1478},{-1152,-1107},{1137,1213},{260,325},{-819,-763},{-2041,-1991},{1769,1831},{1348,1354},{-2167,-2135},{-2096,-2043},{1574,1639},{2476,2485},{-1279,-1261},{137,153},{2048,2075},{643,654},{1298,1386},{2297,2359},{-369,-296},{-673,-623},{-2455,-2411},{2472,2495},{-603,-581},{-223,-131},{-277,-274},{-1925,-1897},{1294,1359},{-1526,-1456},{928,968},{2005,2097},{460,479},{339,431},{1679,1768},{2455,2459},{1968,2027},{136,232},{-527,-481},{-42,-1},{2283,2362},{1381,1441},{2158,2220},{-1224,-1223},{-2046,-2023},{1786,1800},{2376,2469},{-1032,-980},{-1778,-1718},{-1863,-1838},{2116,2138},{660,713},{-2117,-2112},{1049,1144},{-1290,-1240},{-173,-108},{-1319,-1294},{-2150,-2097},{-2126,-2049},{1659,1746},{662,710},{1456,1474},{102,172},{2071,2095},{1863,1898},{1102,1183},{-613,-520},{-731,-692},{-831,-782},{1561,1621},{-1945,-1879},{2178,2210},{-885,-862},{1016,1042},{-1322,-1310},{42,62},{2231,2288},{1275,1333},{-2454,-2435},{739,826},{-959,-954},{-1895,-1879},{-869,-783},{450,469},{-919,-885},{-1605,-1543},{-925,-904},{-2460,-2403},{-2324,-2304},{1266,1310},{-2144,-2109},{-1272,-1238},{-7,77},{847,939},{-1494,-1414},{823,857},{-1413,-1333},{-1164,-1091},{2401,2430},{-2249,-2203},{-2496,-2444},{677,687},{-2219,-2218},{2075,2129},{1900,1908},{-1272,-1269},{1401,1460},{-1895,-1861},{-2464,-2458},{-2123,-2101},{-1150,-1082},{-1971,-1909},{-1202,-1167},{-692,-682},{-1413,-1327},{-932,-839},{1528,1583},{2077,2155},{-2397,-2304},{107,182},{-1140,-1074},{411,457},{-1699,-1635},{2030,2083},{1549,1627},{-2256,-2226},{2453,2472},{1817,1868},{-1487,-1394},{-1044,-974},{-1218,-1132},{-1972,-1928},{753,761},{1560,1601},{-2348,-2258},{-1506,-1435},{392,485},{1965,1974},{-825,-743},{273,363},{-2298,-2270},{8,108},{2356,2445},{-2430,-2388},{436,533},{971,1030},{-2057,-1959},{2139,2154},{-620,-545},{-483,-457},{-1516,-1432},{-1547,-1508},{1345,1390},{-1032,-976},{754,842},{-1797,-1731},{-2474,-2408},{-479,-379},{-1171,-1121},{820,835},{-42,-10},{-2063,-2060},{-1589,-1522},{1391,1392},{-690,-617},{1165,1253},{-1104,-1049},{971,1024},{211,213},{2183,2233},{-1872,-1842},{-2467,-2466},{-2372,-2292},{2037,2082},{-1588,-1495},{2373,2452},{107,151},{1680,1711},{1756,1768},{1039,1134},{488,547},{67,166},{-1869,-1823},{988,1059},{-1169,-1079},{-2008,-1938},{-1583,-1533},{2041,2126},{1352,1416},{-2083,-1985},{2048,2134},{708,732},{1,26},{265,358},{1134,1161},{254,292},{1399,1418},{499,530},{991,1055},{-2347,-2291},{2128,2141},{-2229,-2184},{-508,-452},{1615,1650},{-1506,-1443},{-108,-46},{2347,2442},{-1993,-1906},{1161,1197},{-147,-142},{-115,-91},{977,1023},{277,340},{-728,-713},{-1668,-1573},{-1296,-1240},{596,628},{790,875},{-2055,-1957},{-1032,-1018},{-1590,-1570},{-830,-749},{-933,-844},{-1954,-1880},{-236,-165},{-2354,-2297},{883,909},{-897,-881},{981,1047},{1327,1410},{1352,1429},{1639,1657},{-770,-769},{-807,-754},{-1713,-1697},{-1804,-1726},{-425,-368},{-174,-128},{-701,-664},{366,438},{-2365,-2333},{-2417,-2379},{-1432,-1371},{-398,-329},{172,189},{1801,1879},{-2200,-2136},{-753,-698},{-2485,-2431},{924,1020},{-585,-485},{2242,2341},{1706,1778},{1899,1943},{-2047,-1962},{-1691,-1601},{-651,-556},{991,1005},{2434,2449},{1500,1542},{2194,2293},{-2288,-2270},{81,98},{388,472},{-618,-598},{1156,1191},{1329,1356},{-1055,-955},{998,1070},{-650,-636},{-1082,-1015},{-1700,-1673},{-1475,-1454},{325,338},{-1316,-1246},{1273,1305},{2186,2200},{-2231,-2220},{-1038,-1001},{-1194,-1162},{215,232},{1259,1262},{2313,2351},{-1745,-1700},{-2032,-1980},{94,117},{-2257,-2246},{1259,1273},{-498,-434},{-1212,-1180},{359,364},{-518,-480},{2246,2308},{-2388,-2370},{2045,2100},{1384,1472},{-1233,-1155},{2402,2428},{1035,1132},{663,739},{1408,1443},{-373,-279},{-496,-456},{-1123,-1070},{-1222,-1203},{-81,-15},{1463,1544},{338,370},{-1244,-1231},{-102,-61},{1339,1355},{-2214,-2117},{2378,2439},{-1234,-1172},{-2159,-2109},{752,788},{1806,1846},{-2359,-2334},{2073,2171},{1468,1469},{-1102,-1090},{447,474},{-706,-697},{961,967},{2409,2454},{-185,-113},{-1108,-1075},{161,224},{1415,1430},{-2465,-2449},{-2497,-2422},{-1131,-1106},{-1890,-1797},{1880,1932},{-2328,-2243},{1582,1593},{1052,1106},{-1443,-1425},{1385,1390},{-1345,-1317},{1180,1207},{1105,1174},{-1434,-1362},{1944,2013},{-802,-737},{1827,1865},{-1847,-1788},{2215,2260},{-2200,-2138},{2250,2268},{-1166,-1080},{-1918,-1849},{-1950,-1860},{1538,1541},{-458,-365},{-2127,-2100},{-1765,-1757},{-426,-418},{-2431,-2385},{-1003,-985},{1076,1162},{-919,-906},{2296,2362},{-2203,-2194},{1602,1621},{-2153,-2080},{-1091,-1071},{-804,-704},{-2256,-2186},{1416,1507},{-450,-401},{1081,1153},{-2076,-1997},{1547,1632},{-1289,-1263},{-1840,-1810},{-2248,-2196},{1613,1694},{2064,2070},{-1176,-1133},{1922,1997},{944,1034},{-1974,-1951},{1950,1952},{-1838,-1818},{-1237,-1148},{242,334},{-42,20},{455,547},{-1069,-1068},{914,941},{823,851},{-2028,-2001},{516,550},{-1835,-1750},{345,385},{1580,1641},{-2286,-2282},{221,318},{1127,1142},{-1272,-1195},{1100,1133},{-290,-198},{-2344,-2288},{-1935,-1908},{-604,-533},{1011,1030},{987,1074},{-1408,-1358},{-943,-881},{2292,2372},{1130,1182},{2212,2247},{2303,2319},{-597,-546},{298,354},{-2354,-2328},{305,313},{2149,2225},{2123,2134},{-1477,-1398},{-2191,-2108},{2141,2167},{-1976,-1924},{-1982,-1951},{-493,-394},{693,770},{305,329},{-1125,-1114},{1586,1637},{2329,2371},{-863,-794},{-342,-293},{-643,-603},{-1194,-1148},{2278,2352},{121,152},{-1352,-1287},{-990,-973},{-2193,-2117},{2086,2123},{-2483,-2432},{-2108,-2093},{-1190,-1115},{-1052,-1004},{69,150},{629,661},{2253,2289},{690,731},{-2084,-2017},{-1576,-1531},{1596,1639},{-21,43},{-944,-932},{-1235,-1154},{1794,1890},{1058,1121},{-2368,-2353},{283,353},{1661,1726},{378,459},{1984,2060},{-1442,-1373},{-1459,-1436},{1645,1651},{-1792,-1740},{1355,1398},{-310,-249},{2202,2277},{-1857,-1824},{-1293,-1255},{-1713,-1614},{-1442,-1352},{1669,1683},{874,923},{-2005,-2001},{-1600,-1582},{1781,1859},{1750,1825},{2451,2453},{-414,-398},{-447,-401},{-2311,-2288},{-887,-868},{-2328,-2294},{302,362},{-1089,-1000},{124,166},{-441,-407},{2147,2233},{1638,1718},{-2066,-1973},{-1044,-983},{-1447,-1352},{-2210,-2118},{738,814},{951,958},{135,199},{-1531,-1473},{109,123},{1404,1455},{1588,1663},{-1837,-1795},{-206,-113},{-289,-221},{2311,2342},{-1970,-1911},{140,225},{-1623,-1608},{593,685},{-1986,-1954},{356,387},{-1354,-1305},{-258,-215},{-22,42},{-1006,-982},{-1782,-1714},{-449,-390},{1075,1153},{1741,1771},{404,413},{-1221,-1176},{8,101},{-1386,-1348},{-158,-59},{1135,1214},{238,262},{-2143,-2111},{-469,-397},{1295,1341},{2365,2443},{-848,-753},{-862,-782},{-1816,-1727},{-739,-718},{108,183},{1879,1886},{965,1046},{1657,1714},{388,455},{1176,1271},{-1076,-1002},{-2000,-1944},{-32,21},{199,243},{-172,-125},{-2442,-2361},{139,190},{-358,-353},{-854,-840},{96,104},{-1815,-1795},{1212,1266},{-244,-192},{2218,2310},{-1512,-1469},{-2198,-2167},{-1182,-1171},{-1535,-1513},{-156,-85},{-1352,-1287},{-389,-299}}));
    }
}
