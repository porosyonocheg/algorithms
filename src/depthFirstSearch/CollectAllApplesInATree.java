package depthFirstSearch;

import java.util.List;

/** Матрица edges представляет собой дерево с номерами узлов от 0 до n-1, с вершиной 0.
 * hasApple.get(i) раскрывает информацию содержит ли яблоко i-ый узел. Движение по дереву от одного узла к другому занимает
 * одну единицу времени. Возвращает минимально возможное время обхода для получения всех яблок на дереве и возврата к вершине.
 * @author Сергей Шершавин*/

public class CollectAllApplesInATree {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] parents = new int[n];
        for (int i = 0; i < n; i++) parents[i] = -1;
        for (int[] edge : edges) {
            if (parents[edge[1]] == -1) {
                parents[edge[1]] = edge[0];
            }
            else {
                parents[edge[0]] = edge[1];
            }
        }
        int time = 0;
        boolean[] visited = new boolean[n];
        visited[0] = true;
        for (int i = 1; i < n; i++) {
            if (hasApple.get(i)) { //нас интересуют только узлы с яблоками
                int current = i;
                while (!visited[current]) { //которые мы ещё не посетили
                    visited[current] = true;
                    time += 2; //время на достижение узла и возврат из него
                    current = parents[current];
                }
            }
        }
        return time;
    }
}