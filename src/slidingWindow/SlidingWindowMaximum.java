package slidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

/** Скользящее окно - последовательность элементов в массиве заданного размера, перемещающаяся слева направо. Количество
 * вхождений скользящего окна определяется как arr.length - sizeOfWindow + 1.
 * @author Сергей Шершавин*/

public class SlidingWindowMaximum {

    /**@param nums исходный целочисленный массив
     * @param k размер скользящего окна
     * @return массив состоящий из максимальных элементов для каждого вхождения скользящего окна*/
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = i-k+1;
            if (!deque.isEmpty() && idx > deque.peekFirst()) { //удаляем элемент, выходящий за пределы окна
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) { //удаляем все индексы, соответствующие меньшим числам чем текущее
                deque.pollLast();
            }
            deque.addLast(i);
            if (idx >= 0) {
                result[idx] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
