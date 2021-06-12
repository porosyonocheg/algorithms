package backtracking;

import java.util.ArrayList;
import java.util.List;

/**Создаёт для N-пар круглых скобок все допустимые комбинации*/

public class PairsOfParentheses {
    public List<String> generate(int N) {
        List<String> result = new ArrayList<>();
        backtracking(0, 0, N, new StringBuilder(), result);
        return result;
    }

    private void backtracking(int open, int close, int limit, StringBuilder sb, List<String> result) {
        if (open == limit && close == limit) {
            result.add(sb.toString());
            return;
        }

        if (open < limit) {
            sb.append('(');
            backtracking(open + 1, close, limit, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }

        if (close < open) {
            sb.append(')');
            backtracking(open, close + 1, limit, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
