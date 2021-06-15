import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int n = 8;
        int a = 4;
        int b = 7;

        int expected = 3;
        assertEquals(expected, new Solution().solution(n, a, b));
    }
}
