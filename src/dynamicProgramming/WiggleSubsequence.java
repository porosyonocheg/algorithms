package dynamicProgramming;

/**Качающаяся последовательность - совокупность чисел, разница между двумя последовательными из которых меняет свой знак. Например:
 * [1,9,5] -> разница: [8, -4]
 * @author Сергей Шершавин*/

public class WiggleSubsequence {

    /**@param nums исходный массив для поиска качающихся подпоследовательностей
     * @return размер самой длинной качающейся подпоследовательности*/
    public int getMaxLength(int[] nums) {
        if (nums.length < 2) return nums.length;
        int up = 1;
        int down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                up = down + 1;
            }
            else if (nums[i] < nums[i-1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }
}
