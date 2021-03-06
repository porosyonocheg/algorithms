package dynamicProgramming;

/**Строки, состоящие из отсортированных в лексико-графическом порядке гласных
 * @author Сергей Шершавин*/

public class SortedVowelStrings {

    /**@param n  - длина искомых строк
     * @return число строк заданной длины, состоящих из гласных отсортированных в лексико-графическом порядке
     * Пример: n = 2. Результат: 15. ["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]*/
    public int count(int n) {
        int[] dp = new int[]{0,1,1,1,1,1}; // элементы под индексами 1-5 обозначают соответствующее количество комбинаций для данного количества гласных в строке
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                dp[j] += dp[j-1];
            }
        }
        return dp[5];
    }
}
