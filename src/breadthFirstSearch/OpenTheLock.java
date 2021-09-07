package breadthFirstSearch;

import java.util.*;

/**
 * @author Сергей Шершавин*/

public class OpenTheLock {
    public int getMinTurns(String[] deadends, String target) {
        Deque<String> queue = new ArrayDeque<>();
        queue.addFirst("0000");
        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentLock = queue.pollLast();
                if (visited.add(currentLock)) {
                    if (currentLock.equals(target)) return count;
                    char[] chars = currentLock.toCharArray();
                    for (int j = 0; j < 4; j++) {
                        char c = chars[j];
                        chars[j] = c == '9' ? '0' : (char)(c + 1);
                        currentLock = String.valueOf(chars);
                        if (!visited.contains(currentLock)) queue.addFirst(currentLock);
                        chars[j] = c == '0' ? '9' : (char)(c - 1);
                        currentLock = String.valueOf(chars);
                        if (!visited.contains(currentLock)) queue.addFirst(currentLock);
                        chars[j] = c;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
