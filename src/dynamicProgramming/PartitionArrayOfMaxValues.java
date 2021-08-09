package dynamicProgramming;

/**Разбиение целочисленного массива на подмассивы, значение каждого элемента в которых будет равно максимальному
 * значению в данном подмассиве: [1,3,2,5,1] -> если размер подмассива ограничен значением 3 -> [3,3,3] и [5,5].
 * @author Сергей Шершавин*/

public class PartitionArrayOfMaxValues {

    /**@param arr исходный массив
     * @param k максимальный размер подмассива разбиения
     * @return максимальную сумму всех элементов подмассивов разбиения*/
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length]; // dp[i] хранит максимальную сумму для i-го элемента массива arr
        dp[0] = arr[0];
        int currentMax = arr[0];
        int i = 1;
        for (; i < k; i++) {
            if (arr[i] > currentMax) currentMax = arr[i];
            dp[i] = (i+1) * currentMax;
        }
        for (; i < arr.length; i++) {
            currentMax = arr[i];
            int candidate;
            for (int j = 1; j <= k; j++) {
                if (arr[i-j+1] > currentMax) {
                    currentMax = arr[i-j+1];
                }
                candidate = dp[i-j] + currentMax * j;
                if (candidate > dp[i]) dp[i] = candidate;
            }
        }
        return dp[dp.length-1];
    }
}
