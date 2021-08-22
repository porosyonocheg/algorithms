package greedy;

import java.util.ArrayDeque;
import java.util.Deque;
/** Массив представляет собой листья дерева в порядке inOrder. Каждый узел дерева имеет либо 2, либо 0 потомков. Значение
 * каждого нелистового узла равно произведению максимальных значений узлов его правого и левого поддеревьев
 * @author Сергей Шершавин*/
public class MinimumCostTreeFromLeafValues {

    /**@return минимальную сумму значений нелистовых узлов*/
    public int getSum(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(Integer.MAX_VALUE);
        int result = 0;
        for (int n : arr) {
            while (stack.peekFirst() <= n) {
                int cur = stack.pollFirst();
                result += cur * Math.min(stack.peek(), n);
            }
            stack.addFirst(n);
        }
        while (stack.size() > 2) {
            result += stack.pollFirst()*stack.peekFirst();
        }
        return result;
    }
}
