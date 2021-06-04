import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String s = "(())()";
        boolean r = true;
        assertEquals(r, new Solution().solution(s));
    }
}
