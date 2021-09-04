package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**Поиск минимального числа интервалов, которые необходимо удалить из intervals, чтобы остались только непересекающиеся
 * intervals[i][0] - начало i-го интервала, intervals[i][1] - конец i-го интервала, если interval[j][0] < interval[i][1]
 * интервалы пересекаются
 * @author Сергей Шершавин*/
public class NonOverlappingIntervals {
    public int countOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int end = intervals[0][1];
        int countNonOverlapIntervals = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
                countNonOverlapIntervals++;
            }
        }
        return intervals.length - countNonOverlapIntervals;
    }
}
