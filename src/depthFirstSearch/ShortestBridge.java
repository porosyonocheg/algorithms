package depthFirstSearch;

/** Квадратная матрица grid представляет собой "океан" (ячейки == 0) и два "острова". Остров - совокупность ячеек == 1,
 * соседствующих по вертикали или горизонтали.
 * @author Серегй Шершавин*/

public class ShortestBridge {

    /**@return минимальную длину моста, который необходимо построить, чтобы соединить два "острова"*/
    public int getLength(int[][] grid) {
        int n = grid.length;
        boolean found = false;
        for (int i = 0; !found && i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    detectIsland(grid, i, j, n); //"перекрасим" найденный остров рекурсивно, чтобы отличить его от второго
                    found = true;
                    break;
                }
            }
        }
// будем маркировать каждую окружающую остров ячейку "цветом", который соответствует расстоянию от острова (минус 2) и увеличивается по мере удаления от него
        for (int color = 2; ;color++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == color && (reachAnotherIsland(grid, i-1, j, n, color) || reachAnotherIsland(grid, i+1, j, n, color) || reachAnotherIsland(grid, i, j-1, n, color) || reachAnotherIsland(grid, i, j+1, n, color))) {
                        return color - 2;
                    }
                }
            }
        }
    }

    private void detectIsland(int[][] grid, int i, int j, int n) {
        if (i < 0 || j < 0 || i == n || j == n || grid[i][j] == 0 || grid[i][j] == 2) return;
        grid[i][j] = 2;
        detectIsland(grid, i+1, j, n);
        detectIsland(grid, i-1, j, n);
        detectIsland(grid, i, j+1, n);
        detectIsland(grid, i, j-1, n);
    }

    private boolean reachAnotherIsland(int[][] grid, int i, int j, int n, int color) {
        if (i < 0 || j < 0 || i == n || j == n) return false;
        if (grid[i][j] == 0) {
            grid[i][j] = color + 1;
        }
        return grid[i][j] == 1;
    }
}
