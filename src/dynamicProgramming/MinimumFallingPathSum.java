package dynamicProgramming;

/**Минимальная сумма падающего пути - сумма последовательных элементов целочисленной квадратной матрицы по пути от
 * одного из верхних до одного из нижних через смежные (левый по диагонали, правый по диагонали или нижний) в каждом
 * последующем ряду
 * @author Сергей Шершавин*/

public class MinimumFallingPathSum {
    public int get(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix.length]; // хранит минимальные суммы для данных i, j
        for (int i = 0; i < matrix.length; i++) {
            dp[0][i] = matrix[0][i]; // для первого ряда - это сами элементы матрицы
        }
        for (int i = 1; i < matrix.length; i++) {
            dp[i][0] = Math.min(dp[i-1][0], dp[i-1][1]);
            dp[i][0] += matrix[i][0];
            int j = 1;
            for (; j < matrix.length-1; j++) {
                dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j+1]);
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j]) + matrix[i][j];
            }
            dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]);
            dp[i][j] += matrix[i][j];
        }

        int min = Integer.MAX_VALUE;
        for (int n : dp[matrix.length-1]) {
            if (n < min) min = n;
        }
        return min;
    }
}
