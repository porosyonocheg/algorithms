package depthFirstSearch;

/** Перемещение по целочисленному массиву неотрицательных чисел в соответствии с условиями
 * @author Сергей Шершавин*/

public class JumpGame {

    /**@param arr каждый элемент массива представляет собой длину "прыжка" с текущего индекса в любую сторону
     *             (i+arr[i] или i-arr[i]).
     * @param start индекс стартового элемента
     * @return true, если существует возможность достигнуть элемент со значением 0, false - в противном случае.*/
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) return false;
        if (arr[start] == 0) return true;
        arr[start] = - arr[start]; // поскольку элементы неотрицательны мы можем маркировать таким образом уже посещенные элементы
        return canReach(arr, start+arr[start]) || canReach(arr, start-arr[start]);
    }
}
