package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**Матрица расписания курсов представляет собой courses[i][0] - продолжительность i-го курса, courses[i][1] - последний
 * день, когда i-й курс должен быть завершён. Поиск максимального числа курсов из расписания, которые возможно пройти
 * @author Сергей Шершавин*/

public class CourseSchedule {
    public int maxNumberOfCourses(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a); // будем хранить курсы в порядке уменьшения продолжительности, чтобы удалять наиболее продолжительные
        int time = 0; // общее время обучения
        for (int[] course : courses) {
            if (time + course[0] <= course[1]) { // укладываемся во временные рамки -> добавляем курс в кучу
                time += course[0];
                maxHeap.offer(course[0]);
            }
            else if (!maxHeap.isEmpty() && maxHeap.peek() > course[0]){ //удаляем из кучи самый продолжительный курс, если он дольше нынешнего, добавляем нынешний взамен
                time += course[0] - maxHeap.poll();
                maxHeap.offer(course[0]);
            }
        }
        return maxHeap.size();
    }
}
