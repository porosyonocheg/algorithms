package depthFirstSearch;

/**Двумерная бинарная матрица представляет собой элементы суши и моря.  Островом считается совокупность смежных по
 * вертикали или горизонтали элементов суши, окружённых сверху, снизу, слева и справа элементами моря.
 * @author Сергей Шершавин*/

public class Islands {

    /**@param grid представлена элементами '0', обозначающими море, и '1', обозначающими сушу. Всё находящееся за
     *             границами матрицы считается морем.
     * @return число островов на переданной сетке*/
    public int getNumberOfIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    markIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    /**@param grid представлена элементами 1, обозначающими море, и 0, обозначающими сушу. Всё находящееся за
     *             границами матрицы считается сушей
     * @return число закрытых островов, то есть островов, окружённых морем и несвязанных с сушей*/
    public int getNumberOfClosedIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) flood(grid, i, 0); //вначале "затопим" все "полустрова", то есть связанные элементы, касающиеся границ матрицы
            if (grid[i][grid[0].length-1] == 0) flood(grid, i, grid[0].length-1);
        }

        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == 0) flood(grid, 0, j);
            if (grid[grid.length-1][j] == 0) flood(grid, grid.length-1, j);
        }

        int count = 0;
        for (int i = 1; i < grid.length-1; i++) {
            for (int j = 1; j < grid[0].length-1; j++) {
                if(grid[i][j] == 0) {
                    flood(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    /**@param grid представлена элементами 1, обозначающими сушу, и 0, обозначающими море.
     * @return количество единиц суши, входящих в острова, некасающиеся границ матрицы*/
    public int getNumberOfEnclaves(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1) clearTheMap(grid, 0, i, m, n);
            if (grid[m-1][i] == 1) clearTheMap(grid, m-1, i, m, n);
        }

        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) clearTheMap(grid, i, 0, m, n);
            if (grid[i][n-1] == 1) clearTheMap(grid, i, n-1, m, n);
        }

        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < n-1; j++) {
                if (grid[i][j] == 1) {
                    count ++;
                }
            }
        }
        return count;
    }

    private boolean isSubIsland;
    /**@apiNote Размер матриц должен быть одинаков
     * @param grid1 представлена элементами 1, обозначающими сушу, и 0, обозначающими море.
     * @param grid2 представлена элементами 1, обозначающими сушу, и 0, обозначающими море.
     * @return Количество островов из grid2 являющихся подостровами в grid1. Иными словами количество островов в grid2
     * которое соответствует суше в grid1*/
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid2[i][j] == 1){
                    isSubIsland = true;
                    dfs(grid1, grid2, i, j);
                    if (isSubIsland) count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid1, int[][] grid2, int i, int j) {
        if (i < 0 || j < 0 || i == grid1.length || j == grid1[0].length || grid2[i][j] == 0) return;
        if (grid1[i][j] != 1) isSubIsland = false;
        grid2[i][j] = 0;
        dfs(grid1, grid2, i+1, j);
        dfs(grid1, grid2, i-1, j);
        dfs(grid1, grid2, i, j+1);
        dfs(grid1, grid2, i, j-1);
    }

    private void clearTheMap(int[][] grid, int i, int j, int m, int n) {
        if (grid[i][j] == 0) return;
        grid[i][j] = 0;
        if (i < m - 1) clearTheMap(grid, i+1, j, m, n);
        if (i > 0) clearTheMap(grid, i-1, j, m, n);
        if (j < n - 1) clearTheMap(grid, i, j+1, m, n);
        if (j > 0) clearTheMap(grid, i, j-1, m, n);
    }

    private void flood(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x == grid.length || y == grid[0].length || grid[x][y] == 1) return;
        grid[x][y] = 1;
        flood(grid, x-1, y);
        flood(grid, x+1, y);
        flood(grid, x, y-1);
        flood(grid, x, y+1);
    }

    private void markIsland(char[][] grid, int i, int j){
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == '0') return; // если по одному из направлений остров закончен, выходим на уровень выше
        grid[i][j] = '0'; // "затапливаем" остров
        markIsland(grid, i-1, j); // проверяем все смехные ячейки на наличие суши
        markIsland(grid, i+1, j);
        markIsland(grid, i, j-1);
        markIsland(grid, i, j+1);
    }
}
