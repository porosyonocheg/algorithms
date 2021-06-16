package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Получение всех уникальных наборов чисел из переданного массива, сумма которых равна target. Наборы с перестановкой
 * чисел местами не являются уникальными. Каждое число массива без дубликатов может использоваться неограниченное число
 * раз (массив должен содержать только положительные значения).
 * Например: [1,2,3], target = 4. Результат: [[1,1,1,1], [1,1,2], [1,3], [2,2]]. Каждый элемент массива с дубликатами
 * используется лишь единожды в каждой комбинации. Например: [1,1,2,2], target = 4. Результат: [[1,1,2], [2,2]]
 * @author Сергей Шершавин*/

public class CombinationSum {
    private final boolean hasDuplicates;

    public CombinationSum() {
        hasDuplicates = true;
    }
    
    /**@param hasDuplicates false, если переданный массив не содержит дубликатов, true (также по умолчанию) - если содержит*/
    public CombinationSum(boolean hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public List<List<Integer>> getCombinations(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (hasDuplicates) {
            Arrays.sort(candidates);
            backtracking(candidates, target, 0, new ArrayList<>(), result);
        }
        else backtrackingUnique(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrackingUnique(int[] candidates, int remain, int start, List<Integer> tempList, List<List<Integer>> result) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrackingUnique(candidates, remain - candidates[i], i, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    private void backtracking(int[] candidates, int remain, int start, List<Integer> current, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(current));
        }
        else if (remain > 0) {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i-1]) continue;
                current.add(candidates[i]);
                backtracking(candidates, remain - candidates[i], i + 1, current, result);
                current.remove(current.size()-1);
            }
        }
    }
}
