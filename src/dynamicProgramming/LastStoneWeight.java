package dynamicProgramming;

/** Массив представляет собой веса камней. Каждый i-й камень, имеющий больший вес чем j-й, сталкиваясь с ним остается
 * с весом равным stones[i] - stones[j]. Меньший весом камень превращается в пыль. Если камни равны по весу, то они оба
 * исчезают. Соударения происходят до тех пор, пока не останется либо один камень, либо ни одного
 * @author Сергей Шершавин*/

public class LastStoneWeight {

    /**@param stones набор весов камней
     * @return наименьший возможный вес оставшегося камня*/
    public int getWeight(int[] stones) {
        int sum = 0;
        for (int st : stones) sum += st;
        int halfSum = sum >> 1; // чтобы получить минимальный остаточный вес нужно приблизить меньшую из частей суммы камней к половинной сумме
        boolean[] dp = new boolean[halfSum + 1]; // dp[i] = true, если сумма i достижима комбинацией весов камней из stones
        dp[0] = true;
        int max = 0;
        for (int st : stones) {
            boolean[] temp = dp.clone();
            for (int curSum = st; curSum <= halfSum; curSum++) {
                if (dp[curSum - st]) {
                    temp[curSum] = true;
                    max = Math.max(max, curSum);
                    if (max == halfSum) return sum - 2 * max; // вообще говоря, камней не осталось
                }
            }
            dp = temp;
        }
        return sum - 2 * max;
    }
}
