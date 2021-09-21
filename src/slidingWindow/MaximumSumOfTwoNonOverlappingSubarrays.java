package slidingWindow;

/** Поиск максимальной суммы двух непересекающихся подмассивов заданной длины
 * @author Сергей Шершавин*/

public class MaximumSumOfTwoNonOverlappingSubarrays {

    /**@param nums исходный массив
     * @param firstLen длина одного подмассива
     * @param secondLen длина другого подмассива (подмассивы не имеют общих элементов)
     * @return максимальную сумму элементов двух подмассивов заданных длин
     * @throws RuntimeException если размер массива меньше суммы длин искомых подмассивов*/
    public int get(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        if (n < firstLen + secondLen) throw new RuntimeException("Invalid size of an array");
        int[] prefixSum = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefixSum[i+1] = nums[i] + prefixSum[i];
        }
        int maxFirst = prefixSum[firstLen], maxSecond = prefixSum[secondLen], result = prefixSum[firstLen + secondLen];
        for (int i = firstLen + secondLen; i <= n; i++) {
            maxFirst = Math.max(maxFirst, prefixSum[i - secondLen] - prefixSum[i - firstLen - secondLen]);
            maxSecond = Math.max(maxSecond, prefixSum[i - firstLen] -  prefixSum[i - firstLen - secondLen]);
            result = Math.max(result, Math.max(maxFirst + prefixSum[i] - prefixSum[i - secondLen], maxSecond + prefixSum[i] - prefixSum[i - firstLen]));
        }
        return result;
    }
}
