import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String s = "-1 -2 -3 -4";
        // String s = "-1 -1";
        String r = "-4 -1";
        // String r = "-1 -1";
        assertEquals(r, new Solution().solution(s));
    }
}
