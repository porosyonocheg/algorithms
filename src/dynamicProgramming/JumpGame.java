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
}
