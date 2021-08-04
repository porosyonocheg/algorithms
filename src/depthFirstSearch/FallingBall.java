package depthFirstSearch;

/** Мяч падает по каждому столбцу поля grid от нулевого ряда к последнему. Каждый элемент поля grid представляет собой
 * направляющую стенку:
 * 1 - наклоненную вправо: \
 * 2 - наклоненную влево: /
 * @author Сергей Шершавин*/

public class FallingBall {
    /**@return индекс столбца, из которого выпадет мяч, либо -1, если он застрянет по пути*/
    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < result.length; i++) {
            result[i] = dfs(grid, 0, i);
        }
        return result;
    }

    //жёлоб, по которому может катиться вниз мяч, должен состоять из одинаковых значений смежных столбцов для всех рядов
    private int dfs(int[][] grid, int row, int column) {
        if (row == grid.length) return column;
        if (grid[row][column] == 1) {
            if (column == grid[0].length - 1 || grid[row][column+1] == -1) return -1;
            return dfs(grid, row+1, column+1);
        }
        else {
            if (column == 0 || grid[row][column-1] == 1) return -1;
            return dfs(grid, row+1, column-1);
        }
    }
}
