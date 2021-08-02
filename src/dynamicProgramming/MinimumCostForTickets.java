package dynamicProgramming;

/** Подсчёт минимальной стоимости билетов для покрытия всех дней для путешествий. Массив days содержит номера дней для
 * путешествий в возрастающем порядке от 1 до 365. Массив costs стоимость билетов: costs[0] - билет на 1 день,
 * costs[1] - абонемент на 7 дней, costs[2] - абонемент на 30 дней.
 * @author Сергей Шершавин*/

public class MinimumCostForTickets {
    public int get(int[] days, int[] costs) {
        int[] cache = new int[days.length];
        return minCostTickets(days, costs, cache, 0);
    }

    /**@param cache [i] - хранит минимальную суммарную стоимость билетов для i-го дня
     * @param index индекс текущего счётного дня в массиве days*/
    private int minCostTickets(int[] days, int[] costs, int[] cache, int index) {
        if (index == days.length) return 0;
        if (cache[index] != 0) return cache[index];
        cache[index] = Math.min(costs[1] + minCostTickets(days, costs, cache, nextDay(days, index, 7)), costs[2] + minCostTickets(days, costs, cache, nextDay(days, index, 30)) );
        cache[index] = Math.min(costs[0] + minCostTickets(days, costs, cache, nextDay(days, index, 1)), cache[index]);
        return cache[index];
    }

    /**@param index индекс текущего счётного дня в массиве days
     * @param pass размер абонемента (1, 7 или 30 дней)
     * @return индекс следующего дня в массиве days, "непокрытого" абонементом с данным числом дней*/
    private int nextDay(int[] days, int index, int pass) {
        int nextDay = days[index] + pass;
        while (index < days.length && days[index] < nextDay) index++;
        return index;
    }
}
