import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        // String expression = "100-200*300-500+20";
        // int expected = 60420;

        // String expression = "50*6-3*2";
        // int expected = 300;

        String expression = "2-990-5+2";
        int expected = 995;
        
        assertEquals(expected, new Solution().solution(expression));
    }
}
