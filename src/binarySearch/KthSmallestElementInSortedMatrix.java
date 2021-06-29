package binarySearch;

/** Поиск k-го наименьшего элемента в матрице, в которой ряды и столбцы отсортированы в возрастающем порядке
 * @author Сергей Шершавин*/

public class KthSmallestElementInSortedMatrix {

    public int get(int[][] matrix, int k) {
        int low = matrix[0][0], high = matrix[matrix.length - 1][matrix.length - 1];

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int count = countSmallOrEqual(matrix, middle);
            if (count < k) {
                low = middle + 1;
            }
            else {
                high = middle - 1;
            }
        }
        return low;
    }

    /**Подсчёт числа элементов не превосходящих переданный параметр*/
    private int countSmallOrEqual(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0, count = 0;
        while (i >= 0 && j < matrix.length) {
            if (matrix[i][j] > target) {
                i--;
            } else {
                count += i + 1;
                j++;
            }
        }
        return count;
    }
}
