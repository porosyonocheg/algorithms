package dynamicProgramming;

/**Набор нажатий кнопок мобильного телефона путём перемещения по ним шахматного коня
 * @author Сергей Шершавин*/

public class KnightDialer {
    private static final int MOD = 1000000007;
    private static final int[][] PATHS = {{4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9}, {}, {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}}; // для соответствующего индекса набор возможных следующих/предыдущих ходов: из/в 0 можно попасть в/из 4 и 6.

    /**@apiNote т.к. ответ может быть велик результат даётся по модулю 10^9+7
     * @param n число допустимых ходов конём
     * @return число различных итоговых цифровых комбинаций для данного числа ходов*/
    public int getNumberOfCombinations(int n) {
        long[][] storage = new long[n+1][10]; // ряды - число комбинаций для i-го числа ходов; колонки соответствуют цифрам от 0 до 9
        for (int j = 0; j < 10; j++) storage[1][j] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int p : PATHS[j]) {
                    storage[i][j] += storage[i-1][p];
                }
                storage[i][j]%=MOD;
            }
        }
        long result = 0;
        for (int j = 0; j < 10; j++) {
            result += storage[n][j];
        }
        return (int) (result%MOD);
    }
}
