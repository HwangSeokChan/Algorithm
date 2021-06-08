import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        // int n = 6;
        // int expected = 2;
        int n = 5;
        int expected = 2;
        // int n = 5000;
        // int expected = 5;
        assertEquals(expected, new Solution().solution(n));
    }
}
