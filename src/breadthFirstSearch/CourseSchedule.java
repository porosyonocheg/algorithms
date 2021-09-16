package breadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    /**@param numCourses общее число курсов
     * @param prerequisites prerequisites[i][1] - номер курса, который должен быть пройден перед прохождением
     *                      курса prerequisites[i][0]
     * @return массив курсов в порядке соответствующем prerequisites для прохождения всех курсов, если это возможно,
     * если невозможно - пустой массив*/
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegrees = new int[numCourses]; //inDegrees[i] содержит количество курсов, которые нужно пройти для прохождения i-го курса
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList<>();
        for (int[] pair : prerequisites) {
            graph[pair[1]].add(pair[0]);
            inDegrees[pair[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];
        int index = 0;
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) { //добавляем курсы, которым (больше) не нужны предкурсы
                queue.add(i);
                result[index++] = i;
            }
        }
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int i : graph[current]) {
                if (--inDegrees[i] == 0) {
                    queue.add(i);
                    result[index++] = i;
                }
            }
        }
        return index == numCourses ? result : new int[0];
    }

    /**@param numCourses общее число курсов
     * @param prerequisites prerequisites[i][0] - номер курса, который должен быть пройден перед прохождением
     *                      курса prerequisites[i][1]
     * @param queries массив запросов, является ли queries[j][0] предкурсом для queries[j][1].
     * @return список результатов запросов по queries.*/
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Integer>[] graph = new List[numCourses];
        int[] indegrees = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] p : prerequisites) {
            graph[p[0]].add(p[1]);
            indegrees[p[1]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < indegrees.length; i++) {
            if (indegrees[i] == 0) queue.add(i);
        }

        boolean[][] connected = new boolean[numCourses][numCourses];
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph[current]) {
                connected[current][next] = true;
                for (int i = 0; i < numCourses; i++) {
                    if (connected[i][current]) connected[i][next] = true;
                }
                indegrees[next]--;
                if (indegrees[next] == 0) queue.add(next);
            }
        }

        List<Boolean> results = new ArrayList<>();
        for (int[] query : queries) {
            results.add(connected[query[0]][query[1]]);
        }
        return results;
    }
}