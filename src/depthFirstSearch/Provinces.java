package depthFirstSearch;

/** isConnected представляет собой таблицу связей городов. isConnected[i,j] == 1 означает, что города i и j прямо связаны.
 * isConnected[i,j] == 1 и isConnected[j,k] == 1 означает, что города i и k связаны косвенно. Провинцией считается
 * совокупность городов прямо или косвенно связанных друг с другом.
 * @author Сергей Шершавин*/

public class Provinces {

    /**@return число провинций для заданной таблицы связей*/
    public int getNumberOfProvinces(int[][] isConnected) {
        if (isConnected == null || isConnected.length == 0 || isConnected[0].length == 0) return 0;
        boolean[] visited = new boolean[isConnected.length]; //посещён ли i-ый город
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                count++;
            }
        }
        return count;
    }

    /**Рекурсивно отмечает посещёнными все города в рамках одной провинции*/
    private void dfs(int[][] isConnected, boolean[] visited, int current) {
        for (int other = 0; other < isConnected.length; other++) {
            if (isConnected[current][other] == 1 && !visited[other]) { // ищем все непосещённые города, с которыми есть связь
                visited[other] = true; // отмечаем найденный посещённым
                dfs(isConnected, visited, other); // ищем связанные города для найденного
            }
        }
    }
}
