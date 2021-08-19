package depthFirstSearch;

/**Поиск пути с минимальным усилием. Элементы heights представляют собой высоты, при переходе от одной ячейки к другой
 * затрачивается усилие равное абсолютной разнице величины этих ячеек. Путь с минимальным усилием - путь, на котором
 * величина усилия минимальна
 * @author Сергей Шершавин*/

public class PathWithMinimumEffort {

    /**@apiNote элементы матрицы heights находятся в пределах отрезка [0, 10^6]
     * @return минимальное усилие для heights при перемещении из левого верхнего угла матрицы в правый нижний угол*/
    public int minimumEffort(int[][] heights) {
        int start = 0, end = 1000000, result = 0;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (dfs(heights, new boolean[heights.length][heights[0].length],0,0, middle, heights[0][0])) {
                result = middle;
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return result;
    }

    private boolean dfs(int[][] heights, boolean[][] visited, int y, int x, int target, int prev) {
        if (y < 0 || x < 0 || y == heights.length || x == heights[0].length || visited[y][x] || Math.abs(heights[y][x] - prev) > target) return false;
        visited[y][x] = true;
        if (y == heights.length-1 && x == heights[0].length-1) return true;
        return  dfs(heights,visited,y-1,x,target,heights[y][x]) ||
                dfs(heights,visited,y+1,x,target,heights[y][x]) ||
                dfs(heights,visited,y,x-1,target,heights[y][x]) ||
                dfs(heights,visited,y,x+1,target,heights[y][x]);
    }
}
