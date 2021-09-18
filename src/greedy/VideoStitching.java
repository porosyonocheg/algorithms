package greedy;

/**Склейка нарезки клипов в единый видеоряд заданной длины
 * @author Сергей Шершавин*/

public class VideoStitching {

    /**@param clips clips[i][0] - время начала i-го клипа, clips[i][1] - время окончания i-го клипа
     * @param time - время окончания конечного видеоряда
     * @return минимальное число клипов, которое требуется для склейки конечно видеоряда, либо -1, если это невозможно*/
    public int getMinNumberOfClips(int[][] clips, int time) {
        int count = 0, max = 0, start = 0;
        while (start < time) {
            for (int[] c : clips) {
                if (start >= c[0]) {
                    max = Math.max(max, c[1]);
                }
            }
            if (start == max) return -1;
            start = max;
            count++;
        }
        return count;
    }
}
