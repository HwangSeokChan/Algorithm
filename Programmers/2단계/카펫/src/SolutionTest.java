import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int brown = 24;
        int yellow = 24;
        int[] expected = {8, 6};
        assertArrayEquals(expected, new Solution().solution(brown, yellow));
    }
}
