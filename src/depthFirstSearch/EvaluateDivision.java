package depthFirstSearch;

import java.util.*;

/** Получение численных результатов соотношений двух параметров из queries по соотношениям двух параметров из equation
 * равных соответствующему численному значению values. В случае невозможности вычисления результата возвращает -1.0
 * Пример: equations = [[a,b],[b,c]]; values = {2.0, 3.0}; queries = [[a,c]]. Результат: 6.0.
 * @author Сергей Шершавин*/

public class EvaluateDivision {
    //построим взвешенный направленный граф. Численным значением будет произведение значений ребёр графа между заданными узлами (параметрами).
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] result = new double[queries.size()];
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(u).put(v, values[i]);
            graph.get(v).put(u, 1/values[i]);
        }

        int size = queries.size();
        for (int i = 0; i < size; i++) {
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            if (!graph.containsKey(start) || !graph.containsKey(end)) result[i] = -1.0;
            else result[i] = dfs(graph, start, end, new HashSet<>());
        }
        return result;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String start, String end, Set<String> visited) {
        if (graph.get(start).containsKey(end)) return graph.get(start).get(end);
        visited.add(start);
        for (Map.Entry<String, Double> entry : graph.get(start).entrySet()) {
            if (!visited.contains(entry.getKey())) {
                double current = dfs(graph, entry.getKey(), end, visited);
                if (current != -1.0) return current * entry.getValue();
            }
        }
        return -1.0;
    }
}
