package dynamicProgramming;

/** Строка содержит три типа символов: '(', ')' и '*'. '*' может трактоваться в качестве пустой строки, '(' или ')' в
 * зависимости от необходимости. Проверка строки на валидность скобок (количество открывающих и закрывающих скобок одинаково,
 * нет закрывающих скобок перед соответствующими им открывающими)
 * @author Сергей Шершавин*/

public class ValidParenthesisString {
    public boolean check(String s) {
        int minCount = 0, maxCount = 0; //макс. и миним. количества открывающих скобок
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    maxCount++;
                    minCount++;
                    break;
                case ')':
                    maxCount--;
                    minCount--;
                    break;
                default:
                    maxCount++;
                    minCount--;
                    break;
            }
            if (maxCount < 0) return false; // это означает наличие закрывающей до соответствующей ей открывающей
            minCount = Math.max(minCount, 0); // если minCount < 0, интерпретируем '*' в качестве пустой строки (либо открывающей скобки) и аннулируем "эффект закрывающей скобки", уменьшающий значение счётчика
        }
        return minCount == 0;
    }
}
