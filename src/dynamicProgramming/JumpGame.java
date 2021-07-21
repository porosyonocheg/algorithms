package dynamicProgramming;

/** Элементы массива целых неотрицательных чисел представляют собой максимально возможную длину "прыжка" от данного
 * индекса к последующим. Старт с нулевого индекса.
 * @author Сергей Шершавин*/

public class JumpGame {

    /**@return true, если возможно достичь последнего элемента, false - в противном случае*/
    public boolean canJump(int[] nums) {
        int currentIndex = 0;
        for (int i = 0; i <= currentIndex; i++) {
            currentIndex = Math.max(currentIndex, nums[i] + i);
            if (currentIndex >= nums.length-1) return true;
        }
        return false;
    }

    /**@apiNote nums должен гарантировать достижение последнего элемента
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
