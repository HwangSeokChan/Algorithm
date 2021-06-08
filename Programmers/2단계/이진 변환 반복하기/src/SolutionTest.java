import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String s = "110010101001";
        int[] expected = {3,8};
        assertArrayEquals(expected, new Solution().solution(s));
    }
}
