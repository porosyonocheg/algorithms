package breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

/** Порядок прохождения курсов. Поиск возможности прохождения
 * @author Сергей Шершавин*/

public class CourseSchedule {

    /**@param numCourses общее число курсов
     * @param prerequisites prerequisites[i][1] - номер курса, который должен быть пройден перед прохождением
     *                      курса prerequisites[i][0]
     * @return true, если возможно закончить все курсы в соответствии с порядком прохождения; false - в противоположном
     * случае*/

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < graph.length; i++) graph[i] = new ArrayList<>();
        int[] degrees = new int[numCourses];
        for (int[] pair : prerequisites) {
            graph[pair[1]].add(pair[0]);
            degrees[pair[0]]++;
        }
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degrees[i] == 0) indexes.add(i);
        }

        for (int i = 0; i < indexes.size(); i++) {
            for (int j : graph[indexes.get(i)]) {
                degrees[j]--;
                if (degrees[j] == 0) {
                    indexes.add(j);
                }
            }
        }
        return indexes.size() == numCourses;
    }
}