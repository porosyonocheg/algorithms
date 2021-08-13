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
