package dynamicProgramming;

/** Два массива представляют собой две последовательные полосы, расположенных друг под другом, состоящие из точек
 * (элементов массива). Равные элементы в каждой полосе могут быть соединены линией
 * @author Сергей Шершавин*/

public class UncrossedLines {

    /**@param nums1 набор точек "верхнего уровня"
     * @param nums2 набор точек "нижнего уровня"
     * @return максимальное число непересекающихся линий, которые возможно построить*/
    public int getMaxNumberOfLines(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (len1 < len2) return getMaxNumberOfLines(nums2, nums1);
        int[] dp = new int[len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0, cur, prev = 0; j < len2; j++) {
                cur = dp[j+1];
                if (nums1[i] == nums2[j]) dp[j+1] = prev + 1;
                else dp[j+1] = Math.max(dp[j+1], dp[j]);
                prev = cur;
            }
        }
        return dp[len2];
    }
}