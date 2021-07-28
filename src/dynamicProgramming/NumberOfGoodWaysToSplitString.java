package dynamicProgramming;

/**Поиск количества хороших способов разбиения строки. Хорошим способом считается такой, при котором получаются две
 * непустые строки с одинаковым количеством уникальных букв.
 * @author Сергей Шершавин*/

public class NumberOfGoodWaysToSplitString {
    public int getWays(String s) {
        char[] word = s.toCharArray();
        int[] suffixArray = new int[word.length]; //number of different letters since "i" till the end
        int count = 0, size = 0;
        int[] freq = new int[26];
        for (int i = word.length-1; i >= 0 ; i--) {
            int idx = word[i]-'a';
            if (freq[idx] == 0) {
                size++;
                freq[idx] = 1;
            }
            suffixArray[i] = size;
        }
        freq = new int[26];
        size = 0;
        for (int i = 0; i < word.length - 1; i++) {
            int idx = word[i]-'a';
            if (freq[idx] == 0) {
                size++;
                freq[idx] = 1;
            }
            if (size > suffixArray[i+1]) break;
            if (size == suffixArray[i+1]) count++;
        }
        return count;
    }
}
