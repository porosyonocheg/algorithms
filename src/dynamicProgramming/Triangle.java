package dynamicProgramming;

import java.util.List;

/** Треугольный массив. Голова: 1 элемент, каждый следующий уровень содержит на 1 элемент больше.
 * @author Сергей Шершавин*/

public class Triangle {

    /**@return минимальную сумму прохождения от головы до низа треугольника. Проход по треугольнику возможен сверху вниз
     * по смежным элементам. Например: [[1],[2,3],[4,5,6]]. От 2 можно перейти к 4 или 5, а от 3 к 5 или 6.*/
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        for (int i = size-1; i > 0; i--) size += i; // число элементов треугольника
        int[] dp = new int[size]; // храним минимальную сумму для каждого элемента в треугольнике
        int k = size-1;
        List<Integer> cur = triangle.get(triangle.size()-1);
        for (int i = cur.size()-1; i >= 0; i--) {
            dp[k--] = cur.get(i); // для самого нижнего ряда - это просто значение его элементов
        }
        for (int i = triangle.size()-2; i >= 0; i--) {
            cur = triangle.get(i);
            int length = cur.size();
            for (int j = length-1; j >= 0; j--) {
                int index = length+k;
                dp[k--] = Math.min(dp[index], dp[index+1]) + cur.get(j); // минимальный из смежных элементов на ряд ниже плюс "стоимость" текущей ячейки
            }
        }
        return dp[0];
    }
}
