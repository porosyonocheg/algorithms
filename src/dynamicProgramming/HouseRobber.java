package dynamicProgramming;

/**Домушник обходит дома в произвольной последовательности, не имея права заходить в два смежных. nums[i] хранит сумму
 * хранящуюся в i-ом доме. Цель: максимизировать сумму, полученную при обходе домов в nums
 * @author Сергей Шершавин*/

public class HouseRobber {

    /**Дома расставлены последовательно в ряд друг за другом*/
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) {
            if (nums[0] >= nums[1]) return nums[0];
            else return nums[1];
        }
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0], nums[1]); // максимальная сумма среди первых двух домов
        for (int i = 2; i < nums.length; i++) {
            sum[i] = Math.max(sum[i-2] + nums[i], sum[i-1]); // макс. сумма для текущего дома: либо макс. сумма, собранная к предыдущему дому, либо к предпредыдущему + сумма в данном доме
        }
        return sum[nums.length-1];
    }

    /**Дома расставлены в круг (последний является соседним с первым)*/
    public int robInRound(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robInRound(nums, 0, nums.length-2), robInRound(nums, 1, nums.length-1));
    }

    private int robInRound(int[] nums, int start, int end) {
        int rob = 0, skip = 0;
        for (int i = start; i <= end; i++) {
            int prevRob = rob, prevSkip = skip;
            rob = skip + nums[i];
            skip = Math.max(prevRob, prevSkip);
        }
        return Math.max(rob, skip);
    }
}
