import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() throws Exception {
        String dirs = "ULURRDLLU";
        // String dirs = "LULLLLLLU";
        int expected = 7;
        assertEquals(expected, new Solution().solution(dirs));
    }
}
