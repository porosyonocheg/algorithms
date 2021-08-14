package greedy;

import java.util.Arrays;
import java.util.Comparator;

/** Элементы матрицы points представляют собой горизонтальные координаты воздушных шаров: points[i][0] - крайняя левая,
 * points[i][1] - крайняя правая. Поиск минимального необходимого числа стрел необходимого, чтобы лопнуть все шары,
 * размещённые один над другим. Считается, что стрела летит строго вертикально по заданной координате бесконечно далеко.
 * @author Сергей Шершавин*/

public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1])); //отсортируем шары про крайней правой точке
        int arrowsCount = 1;
        int arrowPosition = points[0][1]; //первую стрелу выпускаем по самой меньшей из крайних правых координат
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > arrowPosition) { // текущей стрелы будет достаточно до тех пор, пока она не превысит крайнюю левую координату очередного шара
                arrowsCount++;
                arrowPosition = points[i][1]; // запустим новую стрелу по крайней правой координате шара, на котором оборвалась предыдущая серия
            }
        }
        return arrowsCount;
    }
}
