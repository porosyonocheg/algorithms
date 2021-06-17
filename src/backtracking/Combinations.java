package backtracking;

import java.util.ArrayList;
import java.util.List;

/**Создание комбинаций чисел на отрезке [1, n]
 * @author Сергей Шершавин*/

public class Combinations {

    /**@param combinationSize количество чисел, участвующих в каждой комбинации
     * @param limit предельное значение числа участвующего в комбинации, допустимый отрезок [1, limit]
     * @param target сумма, которой должна равняться сумма чисел в комбинации
     * @return Списки уникальных наборов чисел, соответствующие заданным параметрам*/

    public List<List<Integer>> getCombinationForTargetSum(int combinationSize, int target, int limit) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(new ArrayList<>(), result, 1, target, combinationSize, limit);
        return result;
    }

    /**@param combinationSize количество чисел, участвующих в каждой комбинации
     * @param limit предельное значение числа участвующего в комбинации, допустимый отрезок [1, limit]
     * @return Списки уникальных комбинаций чисел заданного размера на заданном отрезке*/
    public List<List<Integer>> combine(int limit, int combinationSize) {
        List<List<Integer>> result = new ArrayList<>();
        combine(1, limit, combinationSize, new ArrayList<>(), result);
        return result;
    }

    private void combine(int start, int end, int size, List<Integer> current, List<List<Integer>> result) {
        if (size == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= end - size + 1; i++) {
            current.add(i);
            combine(i + 1, end, size - 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    private void backtracking (List<Integer> currentList, List<List<Integer>> result, int number, int remain, int size, int limitOfNumbers) {
        if (remain < 0) return;
        if (remain == 0 && currentList.size() == size) {
            result.add(new ArrayList<>(currentList));
        }
        else {
            for (int i = number; i <= limitOfNumbers; i++) {
                currentList.add(i);
                backtracking(currentList, result, i + 1, remain - i, size, limitOfNumbers);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}
