package binarySearch;

/** Поиск пикового элемента в целочисленной матрице. Пиковым считается элемент, значение которого больше значений смежных элементов
 * по четырём сторонам от него. По умолчанию, за границами матрицы значения соответствуют -INF.
 * @author Сергей Шершавин*/

public class FindPeakElement {
    public int[] getIndexes(int[][] mat) {
        int start = 0, end = mat[0].length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            int maxRow = 0;
            for (int i = 0; i < mat.length; i++) {
                maxRow = mat[maxRow][middle] < mat[i][middle] ? i : maxRow;
            }
            boolean isLeftBigger = middle - 1 >= 0 && mat[maxRow][middle - 1] > mat[maxRow][middle];
            boolean isRightBigger = middle + 1 < mat[0].length && mat[maxRow][middle + 1] > mat[maxRow][middle];
            if (!isLeftBigger && !isRightBigger) return new int[]{maxRow, middle};
            else if (isRightBigger) start = middle + 1;
            else end = middle - 1;
        }
        return null;
    }
}
