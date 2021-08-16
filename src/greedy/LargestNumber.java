package greedy;

import java.util.PriorityQueue;

/** Преобразование массива целых чисел в наибольшее возможное целое число, путём слияния элементов
 * @author Сергей Шершавин*/

public class LargestNumber {

    /**@return строку, представляющую наибольшее возможное число, собранное из элементов массива nums путём конкатенации*/
    public String get(int[] nums) {
        // "9" + "8" > "8" + "9" ("98" > "89"); "9" + "10" > "10" + "9" ("910" > "109")
        PriorityQueue<String> queue = new PriorityQueue<>((String o1, String o2) -> (o2 + o1).compareTo(o1 + o2));
        for (int n : nums) queue.offer(String.valueOf(n));
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) sb.append(queue.poll());
        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
}
