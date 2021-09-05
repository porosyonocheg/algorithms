package breadthFirstSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Дерево представляет собой неориентированный связный граф без циклов. Корнем может быть любой из узлов, а высота дерева
 * определяется максимальным числом ребер от корня до самого дальнего листа
 * @author Сергей Шершавин*/

public class MinimumHeightTrees {

    /**@apiNote узлами дерева являются числа от 0 до n-1
     * @param n число узлов дерева
     * @param edges определяет связи между соответствующими узлами дерева
     * @return список корневых узлов деревьев с минимальной высотой*/
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);
        List<List<Integer>> neighbors = new ArrayList<>();
        int[] degrees = new int[n];
        for (int i = 0; i < n; i++) neighbors.add(new ArrayList<>());
        for (int[] edge : edges) {
            neighbors.get(edge[0]).add(edge[1]);
            neighbors.get(edge[1]).add(edge[0]);
            degrees[edge[0]]++;
            degrees[edge[1]]++;
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (degrees[i] == 1) queue.addLast(i);
        List<Integer> result = new ArrayList<>();
        while (n > 2) {
            int size = queue.size();
            n -= size;
            for (int i = 0; i < size; i++) {
                int current = queue.pollFirst();
                for (int neighbor : neighbors.get(current)) {
                    degrees[neighbor]--;
                    if (degrees[neighbor] == 1) queue.addLast(neighbor);
                }
            }
        }
        result.addAll(queue);
        return result;
    }
}
