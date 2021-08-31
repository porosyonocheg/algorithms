package depthFirstSearch;

/** Поиск узла во взвешенном ненаправленном графе с наименьшим числом достижимых соседних узлов, находящихся на
 * расстоянии не превышающем пороговое. Расстоянием между узлами считается сумма весов соединяющих их ребёр.
 * @author Сергей Шершавин*/

public class CityWithSmallestNumberOfNeighborsAtThresholdDistance {

    /**@apiNote Узлы графа представляют собой числа от 0 до n-1.
     * @param n  число узлов графа
     * @param edges edge[i][0] и edge[i][1] i-ая пара соединенных узлов edge[i][2] - расстояние между ними
     * @param distanceThreshold пороговое значение расстояния
     * @return узел с наименьшим числом соседей, находящихся на расстоянии не превышающем пороговое. При равенстве
     * числа соседей предпочтение будет отдано узлу с большим номером*/
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] minDistances = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                minDistances[i][j] = -1; //-1 означает, что узел недостижим или будет считаться недостижимым в рамках данной задачи
            }
            minDistances[i][i] = 0;
        }

        for (int[] edge : edges) {
            int from = edge[0], to = edge[1], weight = edge[2];
            if (weight <= distanceThreshold) {
                minDistances[from][to] = minDistances[to][from] = weight;
            }
        }

        for (int transit = 0; transit < n; transit++) {
            for (int from = 0; from < n; from++) {
                for (int to = 0; to < n; to++) {
                    if (minDistances[from][transit] != -1 && minDistances[transit][to] != -1) { // проверка, что текущий конечный пункт достижим через текущего посредника
                        int transitDistance = minDistances[from][transit] + minDistances[transit][to];
                        if (transitDistance <= distanceThreshold) {
                            if (minDistances[from][to] == -1 || transitDistance < minDistances[from][to]) {
                                minDistances[from][to] = transitDistance;
                            }
                        }
                    }
                }
            }
        }
        int index = 0, minNeighbours = n;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (minDistances[i][j] != -1) count++;
            }
            if (count <= minNeighbours) {
                minNeighbours = count;
                index = i;
            }
        }
        return index;
    }
}