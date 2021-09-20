package depthFirstSearch;

import java.util.*;

/**Цепочка слов - последовательность строк, в которой каждая строка отличается от предыдущей добавлением ровно одной
 * буквы в произвольном месте
 * @author Сергей Шершавин*/

public class LongestStringChain {

    /**@param words Исходный список строк, из которых составляются цепочки
     * @return максимальную длину возможной цепочки слов, составленной из words*/
    public int getLength(String[] words) {
        Map<String, Integer> wordToChainLength = new HashMap<>();
        int result = 0;
        Set<String> candidates = new HashSet<>(Arrays.asList(words));
        for (String s : words) result = Math.max(result, dfs(wordToChainLength, candidates, s));
        return result;
    }

    private int dfs(Map<String, Integer> wordToChainLength, Set<String> candidates, String word) {
        if (wordToChainLength.containsKey(word)) return wordToChainLength.get(word);
        int length = 0;
        char[] letters = word.toCharArray(), candid = new char[letters.length-1];
        for (int i = 0; i < letters.length; i++) {
            System.arraycopy(letters, 0, candid, 0, i);
            System.arraycopy(letters, i+1, candid, i, letters.length-1-i);
            String prev = new String(candid);
            if (candidates.contains(prev)) {
                length = Math.max(length, dfs(wordToChainLength, candidates, prev));
            }
        }
        wordToChainLength.put(word, 1 + length);
        return 1 + length;
    }
}
