package depthFirstSearch;

/**Двумерная символьная матрица представлена элементами '0', обозначающем море и '1', обозначающем сушу. Всё находящееся
 * за границами массива считается морем. Островом считается совокупность смежных по вертикали или горизонтали элементов
 * суши.
 * @author Сергей Шершавин*/

public class Islands {

    /**Вычисляет число островов на переданной сетке*/
    public int getNumberOfIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    markIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void markIsland(char[][] grid, int i, int j){
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == '0') return; // если по одному из направлений остров закончен, выходим на уровень выше
        grid[i][j] = '0'; // "затапливаем" остров
        markIsland(grid, i-1, j); // проверяем все смехные ячейки на наличие суши
        markIsland(grid, i+1, j);
        markIsland(grid, i, j-1);
        markIsland(grid, i, j+1);
    }
}
