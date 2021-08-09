package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**Получение всех возможных калькуляций при различных комбинациях скобок в математическом выражении
 * @author Сергей Шершавин*/

public class DifferentWaysToAddParentheses {
    public List<Integer> сompute(String expression) {
        int length = expression.length();
        List<String> partition = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int j = i;
            while (j < length && Character.isDigit(expression.charAt(j))) j++;
            partition.add(expression.substring(i, j));
            if (j != length) partition.add(expression.substring(j, j+1));
            i = j;
        }

        int sizeOfNumbers = (partition.size() + 1) / 2;
        ArrayList<Integer>[][] dp = new ArrayList[sizeOfNumbers][sizeOfNumbers];
        for (int i = 0; i < sizeOfNumbers; i++) {
            dp[i][i] = new ArrayList<>();
            dp[i][i].add(Integer.valueOf(partition.get(i*2)));
        }

        for (int op = 1; op < sizeOfNumbers; op++) {
            for (int i = 0; i < sizeOfNumbers - op; i++) {
                dp[i][i+op] = new ArrayList<>();
                for (int j = i; j < i+op; j++) {
                    ArrayList<Integer> leftPart = dp[i][j], rightPart = dp[j+1][i+op];
                    char oper = partition.get(2*j+1).charAt(0);
                    for (int leftNum : leftPart) {
                        for (int rightNum : rightPart) {
                            switch(oper) {
                                case '+': dp[i][i+op].add(leftNum + rightNum); break;
                                case '-': dp[i][i+op].add(leftNum - rightNum); break;
                                default: dp[i][i+op].add(leftNum * rightNum);
                            }
                        }
                    }
                }
            }
        }
        return dp[0][sizeOfNumbers-1];
    }
}
