package dynamicProgramming;

/**Подсчёт числа квадртных подматриц, состоящих только из 1, в целочисленной матрице
 * @author Сергей Шершавин*/

public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int count = matrix[0][0] == 1 ? 1 : 0, m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 1) count++;
        }
        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 1) count++;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1]) + 1;
                    count += matrix[i][j];
                }
            }
        }
        return count;
    }
}
