package dynamicProgramming;

/** Перемещение по элементам массива от нулевого к последнему в соответствии с условиями.
 * @author Сергей Шершавин*/

public class JumpGame {

    /**@param nums элементы массива целых неотрицательных чисел представляют собой максимально возможную длину "прыжка"
     *              от данного индекса к последующим
     * @return true, если возможно достичь последнего элемента, false - в противном случае*/
    public boolean canReach(int[] nums) {
        int currentIndex = 0;
        for (int i = 0; i <= currentIndex; i++) {
            currentIndex = Math.max(currentIndex, nums[i] + i);
            if (currentIndex >= nums.length-1) return true;
        }
        return false;
    }

    /**@param s строка состоящая из '0' и '1'. Возможно перемещаться только на элементы == '0'
     * @param minJump минимальная "длина прыжка" с текущего индекса
     * @param maxJump максимальная "длина прыжка" с текущего индекса
     * @return true, если возможно достичь последнего элемента, false - в противном случае*/
    public boolean canReach(String s, int minJump, int maxJump) {
        int i = 1, length = s.length(), diff = 0;
        if (s.charAt(length-1) == '1') return false;
        int[] dp = new int[length];
        dp[0] = 1;
        for (; i < length; i++) {
            if (i > maxJump) diff -= dp[i - maxJump - 1];
            if (i >= minJump) diff += dp[i - minJump];
            if (s.charAt(i) == '0' && diff > 0) dp[i] = 1;
        }
        return dp[length-1] > 0;
    }

    /**@param nums элементы массива целых неотрицательных чисел представляют собой максимально возможную длину "прыжка"
     *              от данного индекса к последующим
     * @apiNote nums должен гарантировать достижение последнего элемента
     * @return минимальное число "прыжков" для достижения последнего элемента*/
    public int minNumberOfJumps(int[] nums) {
        int currentIndex = 0, jumps = 0;
        while (currentIndex < nums.length-1) {
            int maxJump = 0, localIndex = 0;
            for (int i = currentIndex + 1; i <= currentIndex + nums[currentIndex] && i < nums.length; i++) {
                int localMax = nums[i] + i;
                if (localMax > maxJump || localMax >= nums.length-1) {
                    maxJump = localMax;
                    localIndex = i;
                }
            }
            currentIndex = localIndex;
            jumps++;
        }
        return jumps;
    }

    /**@param nums каждый элемент содержит число очков, которые аккумулируются до достижения последнего элемента
     * @param k максимальная длина прыжка с текущего индекса
     * @return максимальное число очков, которое возможно набрать при передвижении от начального элемента к конечному*/
    public int getMaxScore(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[dp.length-1] = nums[nums.length-1];
        int max = dp[dp.length-1], indexOfMax = dp.length-1;
        for (int i = nums.length-2; i >= 0; i--) {
            if (indexOfMax > i + k) {
                max = Integer.MIN_VALUE;
                int limit = Math.min(dp.length-1, i+k);
                for (int j = i+1; j <= limit; j++) {
                    if (dp[j] > max) {
                        max = dp[j];
                        indexOfMax = j;
                    }
                }
            }
            else if (dp[i+1] > max) {
                max = dp[i+1];
                indexOfMax = i + 1;
            }
            dp[i] = nums[i] + max;
        }
        return dp[0];
    }
}
