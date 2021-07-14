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
}
