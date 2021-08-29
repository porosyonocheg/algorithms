package depthFirstSearch;

/** Проверка является ли неориентированный граф двудольным. Двудольным является граф, вершины которого можно разделить
 * на два набора A и B, а каждое ребро графа соединяет один из узлов в А с одним из узлов в B
 * @author Сергей Шершавин*/

public class IsGraphBipartite {

    public boolean check(int[][] graph) {
        int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0 && !isValidColored(graph, colors, 1, i)) return false;
        }
        return true;
    }

    private boolean isValidColored(int[][] graph, int[] colors, int color, int current) {
        if (colors[current] != 0) {
            return color == colors[current];
        }
        colors[current] = color;
        for (int next : graph[current]) {
            if (!isValidColored(graph, colors, -color, next)) return false;
        }
        return true;
    }
}
