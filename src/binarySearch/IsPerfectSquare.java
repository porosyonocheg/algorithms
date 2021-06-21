package binarySearch;

/** Определяет является ли переданное число "идеальным квадратом", что означает, что оно представляет собой квадрат
 * другого целого числа отличного от нуля.
 * @author Сергей Шершавин*/

public class IsPerfectSquare {
    public boolean check(int num) {
        if (num <= 0) return false;
        long start = 1, end = num;
        while (start <= end) {
            long middle = start + (end - start) / 2;
            long result = middle * middle;
            if (result == num) return true;
            if (result > num) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
       }
       return false;
    }

}
