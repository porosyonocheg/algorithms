package depthFirstSearch;

/** Два игрока по очереди собирают кучки камней, количество которых соответствует значению элемента piles[i]. Количество
 * кучек, которые может взять игрок за ход находится в пределах 1 <= x <= 2M. Для каждого последующего хода M = max(x, M).
 * Первый игрок стартует при M = 1. Игра продолжается, пока все камни не будут собраны
 * @author Сергей Шершавин*/

public class StoneGame {

    /**@return максимальное число камней, которое может собрать первый игрок*/
    public int getMaxNumberOfStones(int[] piles) {
        int[] suffixSum = new int[piles.length];
        suffixSum[piles.length-1] = piles[piles.length-1];
        for (int i = piles.length-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1] + piles[i];
        }
        int[][] cache = new int[piles.length][piles.length];
        return dfs(cache, piles, suffixSum, 0, 1);
    }

    /**@param M половина максимально возможного числа взятых кучек на данном ходе
     * @param cache [i][j] хранит максимальное число камней, которое игрок может получить, начиная с кучки piles[i], при M == j
     * @param suffixSum [i] хранит количество камней, начиная с i до конца piles
     * @param currentPile номер (индекс) кучки для данного хода*/
    private int dfs(int[][] cache, int[] piles, int[] suffixSum, int currentPile, int M) {
        if (currentPile == piles.length) return 0;
        if (piles.length - currentPile <= M << 1) return suffixSum[currentPile];
        if (cache[currentPile][M] != 0) return cache[currentPile][M];
        int result = 0, limit = M << 1;
        for (int x = 1; x <= limit; x++) {
            result = Math.max(result, suffixSum[currentPile] - dfs(cache, piles, suffixSum, currentPile + x, Math.max(x, M)));
        }
        cache[currentPile][M] = result;
        return result;
    }
}
