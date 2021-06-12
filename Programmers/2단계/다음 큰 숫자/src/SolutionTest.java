import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int n = 78;
        int r = 83;
        // int n = 15;
        // int r = 23;
        assertEquals(r, new Solution().solution(n));
    }
}
