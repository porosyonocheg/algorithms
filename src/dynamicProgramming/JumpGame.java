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
}
