import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        // int n = 15;
        int n = 15;
        int result = 4;
        assertEquals(result, new Solution().solution(n));
    }
}
