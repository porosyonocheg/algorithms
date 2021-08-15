package greedy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ContainerWithMostWaterTest {
    @Test
    public void maxArea() {
        assertEquals(0, new ContainerWithMostWater().maxArea(new int[]{10}));
        assertEquals(1, new ContainerWithMostWater().maxArea(new int[]{1,5}));
        assertEquals(10, new ContainerWithMostWater().maxArea(new int[]{5,2,6}));
        assertEquals(4, new ContainerWithMostWater().maxArea(new int[]{1,2,3,4}));
        assertEquals(9, new ContainerWithMostWater().maxArea(new int[]{1,5,2,4,3}));
        assertEquals(40, new ContainerWithMostWater().maxArea(new int[]{9,0,6,3,12,8,5,4,0,1}));
        assertEquals(833, new ContainerWithMostWater().maxArea(new int[]{17,13,0,4,17,22,11,10,12,4,22,3,12,5,19,17,10,5,21,7,11,13,13,8,12,18,22,23,10,0,15,10,7,9,14,4,24,5,2,13,1,19,22,20,14,9,15,1,6,18}));
        assertEquals(20064, new ContainerWithMostWater().maxArea(new int[]{14,38,12,4,88,57,76,0,97,92,70,43,31,49,65,67,71,97,68,55,49,24,26,34,94,19,77,99,26,87,3,64,66,65,39,23,30,51,7,40,46,22,1,6,69,83,10,15,27,23,4,54,5,76,84,20,81,86,33,15,76,10,9,7,42,21,30,88,91,90,56,2,19,78,22,40,1,74,23,10,29,89,21,49,67,29,75,0,14,32,93,47,74,82,20,41,65,5,14,33,59,39,29,93,78,7,44,63,49,7,60,61,16,53,98,55,47,38,65,62,37,65,93,65,83,71,88,73,31,33,95,0,39,48,71,52,67,20,4,4,14,27,33,55,39,66,46,21,68,28,96,90,67,11,56,1,87,68,56,81,99,43,74,46,48,79,41,29,5,46,97,71,66,23,94,95,65,82,45,42,64,40,72,51,2,71,39,31,99,87,59,61,99,18,2,71,20,65,17,91,98,11,34,29,67,38,40,66,96,2,8,9,9,92,78,20,46,27,0,61,91,86,44,4,65,40,51,67,52,86,25,53,89,54,19,9,15,7,52,15,17,33,66,63,61,79,15,16,67,57}));
        assertEquals(467484, new ContainerWithMostWater().maxArea(new int[]{166,16,4,480,282,482,210,402,302,265,408,417,202,193,22,210,101,383,156,167,250,19,188,316,204,409,196,354,187,252,185,394,278,356,261,205,429,113,9,376,301,387,302,452,491,67,164,333,16,421,51,352,298,18,97,204,446,376,392,89,293,193,327,201,494,408,335,418,427,98,118,334,257,105,15,74,250,102,198,98,338,237,273,52,412,289,116,39,40,291,487,26,53,372,491,493,457,115,443,272,134,75,499,449,109,167,193,108,442,14,104,94,390,445,427,469,76,236,116,229,217,331,41,375,392,200,344,383,400,185,199,161,459,109,182,43,373,174,320,484,257,124,120,84,65,412,26,220,436,119,301,77,280,148,229,14,86,263,349,296,133,344,167,349,110,329,331,356,155,105,297,150,393,277,346,58,366,68,102,33,107,255,346,113,172,466,481,471,104,305,423,82,145,214,36,233,469,197,441,450,286,479,152,112,455,396,466,412,76,347,449,66,110,347,142,58,180,294,256,23,70,343,226,260,339,307,420,220,84,398,149,227,88,133,371,99,485,149,91,258,54,251,485,355,426,440,183,411,254,276,863,843,714,791,135,780,768,317,573,483,588,714,358,172,513,269,711,703,230,493,478,695,302,67,482,767,374,999,134,322,931,312,659,497,600,696,891,115,394,141,12,762,945,753,817,377,755,609,14,73,688,737,859,265,504,33,942,553,958,221,247,240,148,750,715,784,77,869,413,996,99,987,61,275,805,818,123,727,122,765,865,574,884,413,812,883,896,52,795,253,558,623,345,776,462,579,560,293,958,697,661,673,600,42,385,612,540,886,44,257,411,607,555,734,952,279,975,577,655,913,141,867,26,91,801,875,607,30,228,886,775,956,684,913,493,41,263,973,574,41,560,678,769,212,370,922,928,58,77,598,790,920,717,361,483,480,732,652,648,793,293,397,208,529,690,984,222,760,693,434,879,757,991,926,717,929,750,176,305,286,135,540,229,509,120,51,935,17,257,63,129,204,168,586,766,377,369,889,284,770,745,465,712,431,382,959,422,690,709,283,841,406,904,689,159,136,289,250,139,961,8,829,477,681,635,348,716,759,463,856,699,438,158,693,612,161,139,804,229,575,499,106,612,109,570,644,605,394,231,157,728,511,885,609,643,419,643,163,269,702,589,68,713,178,201,923,644,786,911,856,427,624,524,169,315,936,698,171,277,392,998,999,570,963,69,421,11,322,344,802,3,719,309,650,766,951,767,404,887,160,725,426,276,903,507,477,832,117,427,315,651,380,915,424,395,114,277,317,539,194,383,277,550,781,451,907,704,17,730,342,186,688,365,539,286,815,900,604,28,666,917,760,304,629,58,140,656,922,273,306,166,178,440,54,523,532,680,807,237,937,551,671,135,110,15,979,735,665,558,16,809,729,44,441,507,552,980,809,653,415,627,525,455,445,18,496,698,767,323,716,652,821,121,66,329,528,134,591,446,472,644,654,429,176,350,402,58,81,691,186,897,845,722,663,495,129,485,575,446,144,433,384,780,830,872,211,851,695,593,828,813,36,802,759,45,447,235,909,370,296,883,515,729,95,16,633,52,520,363,825,410,158,118,182,201,929,127,318,18,541,62,544,72,245,566,956,520,646,406,807,805,297,408,166,191,339,545,496,966,499,867,543,440,358,107,583,708,887,702,889,373,960,638,49,831,646,31,578,484,885,285,67,134,166,4,264,69,473,345,317,401,115,348,123,385,409,288,451,11,263,378,368,465,419,366,201,417,126,381,126,317,441,192,489,18,87,144,76,308,321,88,86,373,46,39,186,225,430,106,140,375,113,450,123,334,169,102,482,1,305,482,359,148,401,327,294,424,372,476,71,235,456,171,325,381,439,23,119,15,8,272,459,301,334,272,451,133,216,371,92,344,56,448,460,111,176,385,370,123,496,134,398,108,330,319,473,492,112,498,120,242,128,253,281,422,424,251,19,53,343,252,332,108,281,265,162,327,65,207,169,77,7,403,249,82,57,198,227,183,149,232,158,197,227,130,120,9,157,422,436,258,140,496,222,325,490,238,252,314,107,250,139,362,220,205,428,388,495,412,250,293,372,86,317,193,52,136,126,451,339,497,379,126,155,96,276,409,340,70,485,260,5,186,283,205,25,215,52,147,443,141,8,96,435,157,280,399,148,315,195,361,180,47,355,128,150,480,403,294,286,71,122,435,174,127,332,161,327,97,365,301,478,388,232,1,40,50,430,312,467,305,222,304,295,298,84,317,1,322,430}));
        assertEquals(8587674, new ContainerWithMostWater().maxArea(new int[]{123,444,623,535,158,480,192,384,891,533,107,924,541,677,661,189,122,100,130,233,260,811,721,601,692,328,387,464,533,432,392,745,812,663,703,481,7,784,796,127,313,21,189,522,145,573,95,725,970,488,923,21,862,750,916,959,352,124,179,418,12,60,452,335,911,765,491,913,575,366,625,847,284,930,85,339,630,4,991,443,28,244,477,612,478,661,278,121,275,968,251,435,493,543,733,481,9,550,323,208,578,831,683,791,948,301,209,328,285,679,962,883,260,592,97,325,981,257,128,448,574,183,748,525,642,597,623,554,11,582,510,178,120,242,282,432,217,551,992,246,987,950,857,877,611,137,171,291,307,970,472,798,318,871,974,158,920,621,152,759,524,989,614,381,102,197,850,563,214,833,224,526,683,453,633,202,510,787,566,891,990,152,925,736,107,391,853,265,188,459,980,920,495,503,973,691,888,166,986,641,969,650,642,408,112,998,468,487,637,927,281,439,955,528,894,12,891,101,641,486,559,425,645,513,85,767,471,101,225,59,763,386,371,710,762,310,786,714,132,372,925,842,345,129,558,906,9,274,43,341,887,674,499,560,54,944,815,876,568,799,401,65,286,620,355,41,970,456,215,440,604,914,821,387,966,216,874,125,801,43,677,665,648,643,185,158,227,86,937,177,571,470,663,727,499,366,358,350,856,752,389,362,942,246,797,915,930,459,240,262,639,929,222,334,945,173,99,525,287,56,79,321,158,867,885,270,237,190,7,630,804,913,500,910,398,481,105,447,253,807,43,85,902,104,243,42,483,258,888,0,708,254,123,554,156,621,478,182,534,798,72,27,827,837,924,900,789,873,789,91,77,340,761,759,417,19,512,909,606,606,463,219,806,639,338,268,562,306,558,41,178,879,658,943,654,232,444,919,115,221,942,724,822,455,251,798,136,375,329,714,510,395,351,635,481,265,767,800,817,753,361,598,518,200,653,402,66,493,734,974,426,528,214,905,585,305,294,270,67,341,93,378,711,266,301,280,210,60,859,479,334,610,905,102,517,953,422,658,487,824,79,379,939,908,575,56,786,489,377,251,455,28,125,702,748,583,132,786,295,863,354,922,271,160,912,882,60,345,758,56,816,620,358,898,409,742,317,878,75,988,743,528,215,204,737,351,151,927,840,648,349,702,415,586,551,382,964,173,508,447,75,141,515,88,271,139,746,89,320,30,472,357,671,555,607,265,555,91,650,851,946,745,44,327,13,561,144,263,924,198,508,288,852,18,950,125,813,190,882,336,555,48,774,160,24,658,173,458,89,272,641,878,102,100,103,993,560,621,586,366,602,498,40,196,335,968,970,446,6,517,892,115,847,517,200,659,34,484,913,345,554,566,891,755,943,903,544,493,794,520,755,639,664,505,731,400,480,300,754,954,873,100,358,451,880,499,293,754,345,711,718,528,946,949,506,951,188,775,169,440,913,543,895,481,802,380,407,868,148,466,888,372,667,828,992,174,459,200,68,172,302,0,50,616,355,941,140,412,995,283,314,796,956,300,892,55,149,83,900,403,554,423,709,116,350,141,499,577,19,895,412,902,490,195,875,445,543,85,460,556,560,711,836,658,440,776,796,851,941,709,101,991,962,238,890,423,317,918,700,320,378,104,733,888,526,785,837,547,764,689,851,530,972,72,360,290,241,628,598,499,435,65,269,393,632,954,273,724,378,623,898,589,755,9,859,965,98,601,696,874,833,808,388,707,317,377,770,403,732,734,251,834,72,497,584,989,15,696,964,272,981,693,493,504,21,133,189,45,253,775,6,760,448,479,38,440,27,149,954,689,161,990,948,209,893,971,956,877,200,35,660,18,692,182,857,774,211,256,90,561,942,941,45,148,763,206,129,59,484,196,795,603,289,357,645,58,204,403,75,213,612,594,244,736,924,652,448,607,284,595,550,151,806,691,994,57,210,699,57,126,873,620,416,393,274,160,835,708,491,237,724,806,954,913,620,401,911,313,177,865,129,223,73,600,218,277,374,301,564,855,252,934,286,87,672,386,802,638,572,446,585,273,328,967,408,556,796,811,937,417,28,472,824,740,833,24,570,566,718,459,274,994,388,258,70,344,895,518,472,736,748,831,77,747,764,599,79,472,226,469,815,898,927,70,148,200,68,313,817,248,509,95,25,348,844,357,435,987,884,117,431,158,612,254,983,662,415,545,690,609,393,702,613,265,860,931,337,282,736,818,265,283,356,228,566,793,418,222,301,472,151,934,256,665,552,758,660,364,475,180,1596,2300,1946,129,1899,2227,715,319,278,2138,1225,860,1838,1827,1287,160,2330,2505,860,250,1220,1167,1238,1276,266,1852,340,291,2903,1120,1521,780,1967,2144,898,2557,1904,1982,1556,2523,2528,2818,1267,168,712,294,401,2722,2978,2533,657,458,1968,2915,1003,861,58,2337,823,146,2063,1384,735,30,966,1644,2827,592,954,303,220,681,746,158,843,1464,2220,2267,143,1478,1721,1631,114,1897,2173,2607,1568,705,2161,1085,2920,2945,562,2949,1961,1425,2088,900,161,2928,144,2351,914,337,2894,2882,900,1981,2196,536,294,1034,2178,2224,994,2884,2733,480,2308,114,990,972,2641,1999,999,1360,694,336,2381,2402,2472,883,2498,637,48,771,1940,2429,1530,907,2630,775,2982,1658,1723,953,1246,955,720,1859,1629,2400,1759,2758,1267,1018,1972,1130,1701,1904,2034,2365,740,273,1650,190,84,2224,632,1975,2410,2957,537,399,2716,2188,1447,1378,1635,1114,2440,711,2203,1474,634,1478,175,48,2316,982,435,327,2717,811,1364,44,1282,2488,146,1867,1026,1203,1007,1683,1576,1181,1184,688,1871,437,1129,841,1243,2941,1942,2196,1630,1588,2407,166,107,832,1204,890,671,396,917,1645,2301,2128,2369,2523,764,2817,523,2545,1421,1615,1794,1862,2412,2651,2037,2839,1077,2445,730,2473,1268,2861,2998,2917,1398,527,87,754,1542,2992,664,1161,2772,2251,1006,1142,2093,1814,591,1721,881,2025,1964,1210,1597,2078,895,1544,1798,2906,1903,101,972,2023,1046,1504,2720,2334,1603,488,2976,1022,819,189,1606,723,2283,2017,653,2502,731,1676,770,1429,1166,2940,1025,1023,1097,370,226,1349,2479,365,2223,1154,537,2733,1327,2176,124,1350,1955,2537,1555,2465,2987,1052,2,761,1992,268,1538,476,528,1150,716,2622,1081,2492,2285,2719,954,2435,2133,386,2459,1828,2915,1698,187,2618,1046,328,2885,47,1766,2241,555,65,2898,2026,2850,98,639,2855,590,183,1318,605,402,396,2486,728,907,517,934,1213,728,9,412,2224,1731,2608,705,918,2435,107,1581,419,1344,338,2741,1974,181,2841,1385,2028,2506,299,1356,1168,2088,512,991,778,1644,1433,818,2679,1085,2689,114,2057,2346,2961,41,662,2128,2640,2617,419,2456,2362,190,1502,933,1233,1303,1258,812,2916,1933,434,2668,185,1999,1741,1422,62,1819,1986,1750,290,788,2807,2623,598,1020,429,678,2026,2998,1816,1503,477,1401,2209,2571,665,2295,170,2649,706,666,2030,2815,1784,997,987,0,619,2052,2061,4,2799,454,2633,346,1532,797,2453,2081,926,2109,713,1781,537,378,122,1356,1697,581,2820,137,2957,1229,492,806,2910,1898,1135,1198,1709,1437,2649,842,1667,1710,1689,2246,1607,1634,115,450,871,111,2872,210,2346,1079,1166,1368,1332,1402,2506,486,1689,2641,1426,1737,2354,1926,2556,1204,123,183,1160,2377,1452,2803,2308,488,984,569,1475,1606,2586,1202,1588,11,822,1271,1384,286,1030,1469,336,2879,1514,1309,421,491,796,1252,2628,1631,1391,1015,264,2985,1211,1453,952,920,1378,830,2561,420,1072,2623,1319,142,2929,1132,911,2914,480,2155,541,79,2249,2825,1702,1446,2268,1382,1736,2326,1079,156,1241,215,644,2427,1891,1067,1047,3,399,895,2443,2424,66,479,349,609,696,2455,1116,2450,546,1810,276,1501,1542,2943,1357,1287,1026,929,2841,52,1075,2431,987,1862,1654,1880,2527,2950,800,1013,2499,1974,2499,1749,2907,521,2970,1538,1389,1657,2779,1870,2657,2664,2422,498,1163,295,910,2174,1218,1857,2303,2222,658,2338,1211,2223,123,2476,2893,2314,2064,217,832,212,748,1412,473,997,1781,2838,239,3,2996,701,941,2766,2001,1724,316,956,1186,1657,2609,1547,646,1699,919,125,1140,2745,2408,2247,2060,689,1457,1097,2256,158,2422,1393,1576,2014,1812,522,52,2844,470,256,2861,2265,2691,2132,2460,2455,172,1640,1661,631,2211,774,2879,1446,1713,2247,2346,1275,1317,2778,737,2318,1233,2294,2381,2116,1337,2675,2097,2720,567,793,614,125,1756,2079,2541,2895,2765,2659,2022,1983,1033,1259,365,2713,2595,1582,1293,2721,1037,2714,1837,2244,2993,2301,388,678,1419,768,2034,2636,2135,2733,1964,904,1010,1005,514,1748,1595,1091,2302,1837,42,70,841,789,2798,938,2117,2892,799,1126,719,2929,1684,2822,400,2289,1997,32,1256,625,1326,1927,160,237,976,1005,1603,134,2909,2898,1723,2336,536,1336,4,445,2302,760,1961,789,2973,2434,1990,617,2151,601,594,1788,1655,248,1257,2238,2209,2436,446,179,2214,1868,1465,1506,333,1424,1298,1257,1156,1830,989,2147,1362,339,2724,1304,493,2434,1373,155,1826,1991,2043,1217,2696,1112,2000,84,172,992,1271,2337,65,633,1244,381,1971,1040,1726,329,317,2703,1111,2971,2290,651,1645,2732,1985,238,1132,1096,197,1986,982,516,1948,2358,1023,2124,2084,2212,246,1759,1160,900,2370,1815,1253,2553,2033,2313,2402,988,349,1272,2989,1948,629,34,646,1949,2248,2558,36,2991,2828,969,335,1628,2305,711,2203,1566,846,2571,1668,1888,2107,2635,2532,1351,1971,2820,704,2842,1583,2099,239,2095,1336,845,871,1100,345,2823,362,1352,949,409,1190,2091,1877,2383,837,2087,1867,1359,2304,239,1853,419,2428,1308,2153,888,115,1539,2585,2366,2728,1658,1004,235,631,1833,360,2695,2170,1634,1182,1160,324,2815,1183,1406,2753,1836,2636,1305,78,1576,1194,224,1926,2432,1954,1302,1564,1218,754,762,2839,747,1034,1223,1602,831,1973,605,2898,1642,2100,737,834,1883,197,2064,1333,116,2962,78,1800,2816,1698,1067,1223,1272,1152,2671,2214,2378,1600,2427,183,2598,1321,33,2041,4,779,463,651,2202,32,1296,1679,269,279,2702,2487,1434,846,2462,2332,2219,2468,1152,1326,1063,2322,1247,2394,120,987,361,1884,2920,1335,2109,2416,1920,2216,2263,2173,2685,834,1830,1986,453,1792,1519,1312,2219,2934,749,2592,1203,2442,852,395,1630,1977,1501,1296,1147,1119,2595,2612,978,1951,2872,2781,2986,232,2439,1566,285,2403,119,119,2795,2464,108,1496,2282,2725,869,1305,900,441,439,2842,2042,464,447,2412,2505,274,108,1366,2431,2031,2235,909,2382,1721,970,1765,2044,1947,1427,2496,2652,2496,1749,2486,2033,1527,1280,2508,2460,1970,1560,2181,1009,610,2711,1726,1079,1294,1493,1014,1929,1753,1858,164,2744,689,231,758,1629,1006,952,152,249,1430,1452,2388,440,161,2601,2800,2112,2768,471,616,1037,1109,360,654,840,2821,2372,2569,2441,697,166,133,2596,1181,1600,2557,1858,2218,20,57,2300,1757,746,1634,2750,420,2999,350,1971,107,12,2398,1325,2671,1469,1734,2839,288,569,230,2353,2670,102,3,1534,1960,2813,1920,1977,838,2039,178,379,1282,2226,1383,1945,1273,323,1644,595,1843,1339,1912,422,2915,2452,2067,1951,2649,20,1161,1300,292,2644,2687,156,2923,2067,2825,685,1007,192,1297,1038,1234,1838,2691,2963,1822,994,1994,2295,214,2404,2532,2623,1008,126,2508,2371,1875,445,1031,762,2324,1063,1705,747,287,2875,1689,2914,2770,1891,1576,2676,132,2928,407,2656,2007,2635,2785,186,392,183,211,1125,66,1543,2603,861,184,2762,2292,2394,1749,2932,1810,2708,504,1671,1340,350,1846,2968,871,163,393,1029,1846,508,1063,1463,2480,2005,1781,2657,833,924,1290,1556,2285,741,2033,257,216,1124,1605,1892,1366,1746,1942,165,1740,713,2145,1631,2799,2209,695,2407,1186,1098,2727,417,378,2658,1066,2539,2305,471,1865,148,1311,2637,852,496,2681,2984,2566,1157,2477,1799,1306,444,456,782,2037,1154,2554,1481,1094,1349,2635,2312,191,52,1107,2535,2018,2756,1410,1068,2601,2502,2452,1976,2534,2998,2703,1705,272,1778,864,720,816,832,2881,2173,2369,1335,2470,2475,2880,208,2337,2308,811,2169,1887,2565,2036,677,1394,2025,1328,1825,434,2232,1671,1648,2718,1052,1407,654,492,715,1128,1489,205,864,240,2683,1338,2140,192,193,1033,1231,563,2203,1525,22,454,95,2323,2556,2037,1920,1630,1917,542,2866,622,1915,1538,1289,1951,1519,1013,1771,2142,1470,1508,2377,2473,1241,2383,1913,2468,675,1246,358,1174,87,1585,2952,1173,1435,776,1512,2499,332,1849,2521,550,2146,2689,1310,582,331,780,1328,1393,2272,1071,2956,1526,1485,127,666,550,898,1441,1494,2831,1150,525,1822,1680,396,2294,320,1776,1055,2205,2602,413,149,1673,1718,352,1500,449,1964,1874,1993,2877,773,2051,387,1286,485,263,1786,217,761,2593,1872,2702,141,932,2280,1432,2878,1413,1194,1373,1633,1180,2220,177,1908,1488,2952,1679,1241,2688,1323,1696,2190,1822,1893,1518,1927,322,1565,1585,2986,2660,2992,2173,183,724,945,1268,2113,2271,2377,248,840,1915,634,590,1424,851,1375,1440,1829,842,2196,1639,1525,894,749,645,2615,585,2268,1705,809,86,882,2678,792,1646,1908,2011,2662,557,1496,2603,2067,1558,484,2584,2471,2064,1154,1439,616,723,1815,2422,1757,1426,621,1758,1532,1208,947,845,1566,283,2858,437,1861,935,1754,2644,2952,18,209,2569,446,1462,2270,444,1177,2392,50,296,2559,316,2433,1393,2965,2237,2965,2086,1062,2561,2636,1081,928,1275,1235,699,563,70,1282,317,2018,879,178,2873,1809,2677,240,2154,604,1367,2633,1467,2288,2180,873,2291,533,130,2649,2604,781,2882,1066,1758,2287,2698,2136,2046,328,1118,1411,2492,1079,1535,2065,829,1862,979,2475,1222,505,1168,1469,920,2466,1166,2809,773,2095,952,2319,399,999,2685,2130,1694,888,555,1049,2437,2572,833,2827,834,2860,988,2282,2073,2095,663,732,265,2839,1749,1045,2557,2885,2890,1792,676,236,1411,523,2778,1055,924,94,2138,1718,721,1135,14,2180,499,387,2859,2666,2044,2481,2050,2454,2070,1028,2339,31,2717,460,1395,2327,956,1022,1041,2937,1642,1581,133,1355,901,2564,1473,2141,190,2285,646,1733,1531,2269,1322,1204,246,1803,1252,754,1875,986,19,2981,2957,851,484,1168,2925,2880,1874,1776,521,2202,2552,167,1922,2198,2674,2284,2085,2930,2234,2487,1818,1875,1365,159,571,1869,206,1850,118,914,1232,824,1015,1579,1585,1729,39,2202,1676,872,735,2856,2185,161,708,169,514,1170,1406,2594,757,2105,1823,1480,409,1513,1865,529,1209,552,1991,655,1835,2446,2221,160,2594,382,691,1305,1698,1591,2588,1894,2350,702,2555,383,2519,2609,1533,2206,72,2135,2425,637,1797,1623,37,1354,1818,1290,2372,167,951,737,2570,1950,1720,1406,1648,1762,1973,2986,1577,2421,2401,2892,244,1436,2677,828,1482,2156,1467,1237,520,324,2188,1040,999,2883,1085,2534,1108,865,2045,610,349,575,2404,1592,2023,2933,1073,0,1701,1910,1336,362,1696,1335,889,2863,1907,1101,2959,1168,368,1849,699,84,1353,619,547,2961,1049,1713,2758,2754,2515,1114,999,2592,2994,1237,2636,412,2529,577,2163,812,1386,2958,2181,686,2850,1527,2341,1505,1684,499,2804,1170,2836,1770,2961,2371,833,2055,486,151,1824,2033,2190,31,2278,2179,1628,538,2012,1500,2009,306,499,2267,1653,1102,2247,1051,986,1133,493,942,970,2876,509,1750,2789,353,420,2214,1713,2333,2705,1867,2176,357,1353,128,1368,676,55,2487,986,315,842,1276,192,2374,1180,2483,2396,464,2720,379,1057,770,1696,419,1444,1702,1376,1823,2093,393,2893,653,2585,2445,1429,843,1291,306,2824,699,2799,1502,2498,761,2925,1615,881,631,2499,1425,2537,2446,1455,981,676,1080,2267,1589,1908,1915,277,1748,2805,2110,1158,955,168,2748,470,38,820,1019,1111,1272,2243,2724,425,2924,483,2861,1702,2185,466,1863,2986,1525,2122,1226,270,1476,1647,1767,496,2648,665,1576,1169,2432,1158,2960,1882,1311,1688,1172,2657,1060,1697,1611,1665,2266,1524,2402,2689,1630,1217,2836,1540,1374,292,2033,2624,1780,1183,2483,896,437,388,1686,600,166,134,1064,2430,840,784,1595,101,2375,1240,269,1730,117,1199,406,2973,1602,293,2212,2472,1286,972,602,1893,1298,2347,2334,612,563,2202,1810,66,790,1951,640,1707,813,493,1057,2653,587,666,2668,1266,2839,1364,1753,190,867,1329,374,2746,2369,2161,963,1022,364,249,1852,1604,340,29,231,2493,640,2301,2541,2520,1843,292,2029,1430,476,595,1357,2690,825,290,2612,1159,1855,1194,898,825,2413,2516,1811,76,1774,61,660,2237,460,612,77,1536,1858,191,1916,153,2664,2565,1807,1567,2521,1632,1684,1148,1379,163,2746,1671,134,2837,1951,1320,1958,1542,6,1728,448,1547,1068,610,2249,1395,1010,763,2243,2159,987,2389,578,1171,2377,1081,1938,1276,1757,216,2354,339,568,45,1637,1882,446,2380,2120,530,817,2492,850,2354,412,1641,2683,2146,651,570,861,252,1580,2279,1657,757,39,483,480,577,156,1358,2538,346,955,2427,1649,973,2937,1835,161,1249,1917,2715,2155,2042,2135,894,2146,2343,2768,864,1397,1739,1395,2656,1686,825,2774,1139,971,2550,1403,135,789,638,2799,1838,530,877,1277,1092,816,2386,2127,2311,2162,866,636,2164,941,2291,2206,1481,1256,2592,36,2411,867,1544,369,1383,2605,2328,1169,1156,1920,1098,2319,2978,2199,1324,16,776,1363,2738,1915,251,1966,2317,2853,2803,2550,2011,569,368,2425,702,2787,1504,1262,1323,1283,2382,2982,2078,2241,790,2337,287,114,2768,1358,2608,2553,126,1450,2150,1636,798,2373,1400,2600,807,2649,860,1657,1502,2071,850,1137,737,1995,1117,1266,2742,904,2653,1238,615,422,1454,2976,1659,1477,1931,1037,138,1664,206,530,2496,1067,672,664,2641,2862,914,1642,2566,1898,2433,2058,2273,1198,499,734,2878,2915,2007,70,630,1671,1282,2444,675,522,2501,19,1457,2856,1672,2467,2904,2524,22,1635,1826,1276,2091,1007,1375,251,2933,1032,1901,1712,474,1886,1119,594,352,155,2208,578,397,2113,2216,1432,2378,1854,22,217,1682,1443,1090,1685,2212,2500,264,1703,1035,2223,52,2972,2138,822,57,2530,1042,574,2577,2596,66,385,2805,2274,2615,692,2606,2351,2073,1850,1458,2096,1683,822,862,1370,1152,2980,326,2687,2738,2187,949,2004,1117,1008,1592,1,2518,2923,1754,1446,355,1832,411,2906,2949,2809,396,2607,891,2172,223,1578,2122,333,2756,443,944,1620,676,2265,2921,401,326,2741,1936,253,1293,1777,1593,704,1906,1078,1659,1223,1761,782,362,571,2410,441,31,2491,1496,2802,1888,1816,2778,731,2657,1627,1857,483,1162,1904,771,1140,2136,2336,145,2506,150,1451,2158,130,1812,143,1287,2248,2266,873,547,488,429,388,1827,42,1501,717,886,2692,869,2459,620,2650,2774,2958,382,570,1951,1927,1358,2288,2832,2329,362,2983,1955,7,2830,1329,2780,2453,330,1003,1358,1503,526,2523,1056,2330,1229,1830,1946,1164,4,2353,432,1479,682,2420,279,1112,1129,1869,357,763,2712,1556,1189,768,87,2113,730,698,2205,2844,2775,437,2807,2996,1910,2797,1136,863,1078,468,2171,1215,1551,2219,304,449,407,2671,1163,1588,1582,2797,1105,2846,989,387,2827,2889,402,2208,1595,1201,2413,1405,2683,1065,121,848,1852,1641,2064,2618,1983,2409,2413,1698,1407,2896,1481,1103,943,1078,316,2222,2255,219,1360,1040,840,2028,1046,1096,1693,2073,2635,636,2610,254,1644,1301,2024,809,1844,963,2334,1916,2048,889,1859,1329,2725,1403,2744,2714,2892,2444,552,2457,749,1088,644,1622,2127,1051,18,501,23,2521,879,2838,2267,1305,940,1230,2784,2300,234,1537,1860,649,154,255,2418,2589,2409,809,2478,101,2681,544,2701,2785,2946,2871,331,2144,2710,1545,2729,524,759,2407,1303,1331,2518,146,1714,1961,635,1651,3,901,1092,2470,611,2977,1859,1566,2141,2439,1974,1212,2273,2747,1842,2216,2315,385,585,13,573,821,2394,1198,1031,1927,2038,2099,704,1648,1016,733,1514,569,1202,1165,2601,209,1367,1772,2666,426,1532,1228,187,1165,2776,225,2213,31,2930,2943,1885,1711,1441,1162,882,1202,635,2598,606,1030,713,1606,2185,1258,1917,2783,2153,1027,1578,1250,122,2626,2083,1445,2744,2766,2244,2230,1884,2644,55,1832,2107,254,156,597,462,693,844,844,445,690,666,152,65,896,833,872,490,600,90,350,723,273,864,195,493,176,418,571,640,965,531,871,377,906,34,563,954,763,343,781,968,710,972,198,829,626,905,58,638,936,626,805,47,790,544,594,526,715,511,147,799,45,182,795,138,381,968,300,617,36,415,980,401,931,953,988,632,691,85,90,494,750,257,151,613,117,828,629,9,81,823,783,460,560,365,967,266,942,14,323,103,289,532,452,848,487,966,135,9,478,307,964,676,15,415,869,705,467,336,828,176,113,613,728,55,963,712,260,376,645,217,926,187,60,12,731,979,564,290,887,292,156,845,931,741,777,775,949,726,122,418,237,719,518,82,627,101,320,864,835,198,970,669,707,323,320,350,917,374,99,735,715,742,403,210,621,97,923,418,536,886,218,607,594,256,695,113,233,445,165,484,378,607,709,799,337,462,379,793,993,120,719,501,147,918,382,285,404,157,183,260,835,143,784,325,762,54,804,253,374,765,601,527,601,907,97,928,590,117,60,176,375,655,947,291,860,307,973,724,14,750,392,722,258,391,37,835,410,995,88,950,158,325,651,754,978,363,195,59,613,670,108,993,715,863,639,670,11,200,247,589,415,774,996,656,820,895,919,446,942,801,444,38,439,975,865,501,741,984,525,932,456,943,859,730,966,418,687,675,829,816,194,242,918,105,815,512,795,985,885,968,681,496,243,473,529,397,169,693,123,552,957,317,840,7,150,447,677,377,963,676,447,679,701,489,552,754,49,767,610,990,950,414,295,134,406,316,156,614,968,113,852,910,836,565,185,247,491,600,556,30,514,486,994,245,780,967,680,276,537,594,998,427,970,957,481,762,720,972,682,733,500,915,893,488,370,402,885,674,473,127,274,989,9,722,929,776,44,792,867,423,265,788,393,444,188,130,896,645,411,673,560,952,436,395,442,90,266,983,831,490,438,774,516,536,438,415,628,466,438,444,999,57,128,934,585,501,24,286,335,730,966,212,48,808,737,7,167,922,607,183,184,902,392,673,296,217,54,868,221,821,211,913,652,302,935,837,616,315,111,295,165,372,205,933,171,680,750,625,704,878,993,149,403,183,170,173,502,686,572,771,680,279,148,90,708,955,670,186,929,46,590,505,0,299,600,962,932,535,566,65,400,71,920,98,517,988,852,920,710,802,614,559,155,91,49,408,225,139,1,485,769,734,646,941,640,835,848,693,774,937,622,849,305,615,416,363,649,915,427,183,236,969,408,21,561,443,448,732,554,215,36,222,832,989,300,761,244,367,691,526,293,292,550,223,412,656,923,690,793,322,709,435,443,737,729,162,414,834,601,502,709,937,336,289,165,931,450,961,765,67,989,849,199,348,283,419,159,656,435,790,836,387,500,182,293,642,101,313,921,705,707,127,983,858,171,664,313,377,159,327,630,858,40,275,528,952,406,181,162,924,874,133,832,424,9,43,158,303,239,491,313,306,388,622,816,990,27,322,722,276,194,641,668,639,152,129,103,47,760,520,215,402,733,997,528,443,512,76,873,764,749,10,435,834,416,503,916,708,372,417,385,404,821,135,296,752,463,180,250,922,291,742,531,689,953,767,140,968,271,361,41,93,70,341,581,798,688,927,623,911,655,702,743,299,840,193,943,701,14,627,753,716,158,704,234,332,59,481,374,98,698,827,591,223,675,223,581,652,460,85,533,425,572,200,836,448,877,307,737,122,71,338,73,165,79,339,105,353,545,627,700,819,769,330,580,49,512,22,140,668,817,842,360,665,574,129,699,730,925,282,431,4,690,330,805,609,941,417,573,34,506,197,881,573,689,986,253,772,707,341,421,64,407,630,57,536,622,74,14,99,132,686,586,158,549,510,391,237,645,568,958,948,523,976,744,63,810,745,344,493,503,883,887,376,413,587,185,597,199,411,9,527,842,561,0,936,10,654,84,591,214,538,965,238,796,97,205,325,792,223,638,58,462,561,384,90,785,954,529,464,568,978,606,190,885,370,393,204,443,647,158,317,144,718,427,157,527,835,541,36,21,784,769,153,908,853,479,511,714,709,968,468,280,998,821,907,119,204,331,555,801,968,370,164,5,902,298,842,557,655,921,79,271,861,281,652,624,421,47,895,364,465,594,564,935,255,416,829,216,237,411,787,436,424,673,236,295,306,898,353,246,513,173,357,623,544,933,203,800,964,109,822,843,610,75,484,187,512,795,376,704,429,691,616,172,135,175,496,543,836,402,949,609,400,814,856,627,402,253,82}));
    }
}