package dynamicProgramming;

/** Робот перемещается из верхнего левого угла поля m*n в правый нижний угол. За один ход он может сдвинуться на одну
 * позицию вправо, либо вниз.
 * @author Сергей Шершавин*/

public class UniquePaths {

    /**@return число уникальных путей, которыми робот может достичь цели*/
    public int numberOfPaths(int m, int n) {
        int[][] result = new int[m][n]; //result[i][j] хранит количество уникальных путей до точки [i,j]
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i == 0 || j == 0) result[i][j] = 1;
                else {
                    result[i][j] = result[i-1][j] + result[i][j-1];
                }
            }
        }
        return result[m-1][n-1];
    }
/**@param grid представляет поле в виде элементов с определенной неотрицательной стоимостью
 * @return минимальную сумму элементов при прохождении всего маршрута*/
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int j = 1; j < grid[0].length; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }

        return dp[grid.length-1][grid[0].length-1];
    }
}
