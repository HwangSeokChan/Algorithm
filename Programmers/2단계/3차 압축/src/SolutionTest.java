import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String msg = "TOBEORNOTTOBEORTOBEORNOT";

        int[] expected = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};

        assertArrayEquals(expected, new Solution().solution(msg));
    }
}
