import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        // int n = 2;
        // int t = 4;
        // int m = 2;
        // int p = 1;
        // String result = "0111";
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        String result = "02468ACE11111111";
        assertEquals(result, new Solution().solution(n, t, m, p));
    }
}
