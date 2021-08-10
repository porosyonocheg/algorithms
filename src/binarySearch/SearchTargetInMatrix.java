package binarySearch;

/**Определение содержится ли целевой элемент в матрице, ряды которой отсортированы в возрастающем порядке, а первый элемент
 * следующего ряда всегда больше последнего элемента в предыдущем ряду
 * @author Сергей Шершавин*/

public class SearchTargetInMatrix {
    public boolean hasTarget(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0, end = m*n - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            int cur = matrix[middle/m][middle%m]; // Для матр. a[m][n]: a[i][j] -> b[i*m+j]. Для массива b[m*n]: b[i] -> a[i/m][i%m]
            if (cur == target) return true;
            if (cur < target) start = middle + 1;
            else end = middle - 1;
        }
        return end >= 0 && matrix[end/m][end%m] == target;
    }
}