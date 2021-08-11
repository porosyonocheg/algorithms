package dynamicProgramming;

import java.util.Arrays;

/** Сеть состоит из узлов пронумерованных от 1 до n. times - матрица связей узлов, где times[i][2] - время прохождения
 * сигнала от узла times[i][0] к узлу times[i][1]. Определяется максимальное время задержки при прохождении сигнала от
 * узла k ко всем остальным узлам, если достичь всех узлов невозможно возвращается -1.
 * @author Сергей Шершавин*/

public class NetworkDelayTime {
    public int getMaxDelay(int[][] times, int n, int k) {
        int[] distancesTo = new int[n]; // [i] - хранит минимальное время прохождения от k-го узла до i-го (с поправкой на единицу)
        Arrays.fill(distancesTo, Integer.MAX_VALUE);
        distancesTo[k-1] = 0; // расстояние от стартового узла до самого себя
        for (int i = 1; i < n; i++) {
            boolean flag = false; // если минимальные значения достигнуты (на очередной итерации нет изменений), оборвём цикл
            for (int[] time : times) {
                int current = time[0] - 1, next = time[1] - 1, delay = time[2];
                if (distancesTo[current] != Integer.MAX_VALUE && distancesTo[next] > distancesTo[current] + delay) {
                    distancesTo[next] = distancesTo[current] + delay;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        int maxDelay = 0;
        for (int i : distancesTo) {
            if (i == Integer.MAX_VALUE) return -1;
            maxDelay = Math.max(maxDelay, i);
        }
        return maxDelay;
    }
}
