package depthFirstSearch;

/**Поиск всех существующих путей выхода объекта за границы поля размером m на n. i, j - координаты объекта внутри поля.
 * @author Сергей Шершавин*/

public class OutOfBoundaryPaths {

    private final int MOD = 1000000007;

    /**@param maxSteps максимально допустимая длина пути
     * @return количество уникальных путей для выхода объекта со стартовыми координатами i,j за границы поля m на n
     * @apiNote возвращается результат по модулю 10^9 + 7*/
    public int getNumberOfPaths(int m, int n, int maxSteps, int i, int j) {
        int[][][] memo = new int[maxSteps+1][m][n]; //memo[maxSteps][i][j] - хранит количество путей до координат [i,j] при maxSteps макс. количестве перемещений
        for (int a = 0; a <= maxSteps; a++) {
            for (int b = 0; b < m; b++) {
                for (int c = 0; c < n; c++) {
                    memo[a][b][c] = -1;
                }
            }
        }
        return dfs(m,n,maxSteps,i,j,memo)%MOD;
    }

    private int dfs(int m, int n, int maxSteps, int i, int j, int[][][] memo) {
        if (i < 0 || j < 0 || i == m || j == n) return 1;
        if (maxSteps == 0) return 0;
        if (memo[maxSteps][i][j] >= 0) return memo[maxSteps][i][j];
        memo[maxSteps][i][j] = ((dfs(m, n, maxSteps - 1, i + 1, j, memo) + dfs(m, n, maxSteps - 1, i - 1, j, memo))%MOD + (dfs(m, n, maxSteps - 1, i, j + 1, memo) + dfs(m, n, maxSteps - 1, i, j - 1, memo))%MOD)%MOD;
        return memo[maxSteps][i][j];
    }
}
