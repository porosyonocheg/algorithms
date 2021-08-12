package depthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/** Поиск безопасных узлов направленного графа. Под безопасными узлами понимаются узлы, все пути которых оканчиваются
 * терминальным узлом. Терминальным узлом считается узел, не имеющий исходящих из него путей (рёбер).
 * @author Сергей Шершавин*/

public class FindEventualSafeStates {

    /**Перечень состояний узлов графа*/
    private enum State {
        UNSAFE, SAFE
    }

    /**@param graph содержит (n = graph.length)-узлов, пронумеранных по возрастанию от 0 до n-1 и соответствующих номеру
     * ряда матрицы. Каждый ряд содержит список узлов, к которым направлены рёбра из данного узла
     * @return список безопасных узлов*/
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        State[] states = new State[graph.length];
        for (int i = 0; i < graph.length; i++) if (isSafe(graph, i, states)) result.add(i);
        return result;
    }

    /**@return true если текущий узел является безопасным и false - в обратном случае*/
    private boolean isSafe(int[][] graph, int current, State[] states) {
        if (states[current] != null) return states[current] == State.SAFE;
        states[current] = State.UNSAFE;
        for (int next : graph[current]) if (!isSafe(graph, next, states)) return false;
        states[current] = State.SAFE;
        return true;
    }
}
