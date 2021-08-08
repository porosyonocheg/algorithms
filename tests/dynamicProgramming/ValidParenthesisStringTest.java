package dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesisStringTest {
    @Test
    public void check() {
        assertTrue(new ValidParenthesisString().check("()"));
        assertFalse(new ValidParenthesisString().check("("));
        assertTrue(new ValidParenthesisString().check("(*"));
        assertFalse(new ValidParenthesisString().check(")*"));
        assertTrue(new ValidParenthesisString().check("*)"));
        assertFalse(new ValidParenthesisString().check("*("));
        assertTrue(new ValidParenthesisString().check("(*)"));
        assertFalse(new ValidParenthesisString().check(")("));
        assertTrue(new ValidParenthesisString().check("****"));
        assertFalse(new ValidParenthesisString().check("((())"));
        assertTrue(new ValidParenthesisString().check("((())*((())))"));
        assertFalse(new ValidParenthesisString().check("((()))((())))"));
        assertTrue(new ValidParenthesisString().check("*()((*)(*()))(*"));
    }
}
