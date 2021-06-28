package backtracking;

import java.util.ArrayList;
import java.util.List;

/**Поиск всех возможных путей от начального узла до конечного в направленном ациклическом графе
 * @author Сергей Шершавин*/

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> getPaths(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        current.add(0);
        backtracking(graph, 0, current, result);
        return result;
    }

    private void backtracking(int[][] graph, int start, List<Integer> current, List<List<Integer>> result) {
        if (start == graph.length - 1) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int next : graph[start]) {
            current.add(next);
            backtracking(graph, next, current, result);
            current.remove(current.size()-1);
        }
    }
}
