package dynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

/** Определяет максимальную длину цепи отрезков. Цепью считается такие отрезки, когда p1 = {a,b}, p2 = {c,d}, что c > b.
 * @author Сергей Шершавин*/

public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1])); //сортируем отрезки по их концам
        int maxLength = 1;
        int current = pairs[0][1]; //храним текущий конец для сравнения с началом следующего для продолжения цепи
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > current) {
                current = pairs[i][1];
                maxLength++;
            }
        }
        return maxLength;
    }
}
