package dynamicProgramming;

/** Поиск в матрице, состоящей из символов '0' и '1' максимальной площади квадрата, состоящего только из '1'.
 * @author Сергей Шершавин*/

public class MaximalSquare {
    public int getMaxArea(char[][] matrix) {
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1]; // dp[i][j] - длина стороны квадрата, нижняя правая точка которого имеет координаты i,j
        int length = 0;
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1; //длина для текущей точки складывается из минимальной из длин для точек слева, сверху и влево-вверх по диагонали от неё
                    length = Math.max(length, dp[i][j]);
                }
            }
        }
        return length*length;
    }
}
