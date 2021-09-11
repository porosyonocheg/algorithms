package dynamicProgramming;

/** Определить наибольшее количество очков, которые может дать пара в массиве. Очки определяются по правилу:
 * array[i] + array[j] + i - j. Иными словами, сумма значений элементов минус расстояние между ними.
 * @author Сергей Шершавин*/

public class BestSightseeingPair {
    /**@throws RuntimeException если размер массива меньше двойки и соответственно вычисление очков невозможно*/
    public int getMaxScore(int[] values) {
        if (values.length < 2) throw new RuntimeException("Invalid size of an array");
        int maxIndex = 0, maxScore = 0;
        for (int i = 1; i < values.length; i++) {
            maxScore = Math.max(maxScore, values[maxIndex] + values[i] + maxIndex - i);
            if (values[maxIndex] + maxIndex < values[i] + i) {
                maxIndex = i;
            }
        }
        return maxScore;
    }
}
