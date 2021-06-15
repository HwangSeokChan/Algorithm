import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[] citations = {3, 0, 6, 1, 5};
        int expected = 3;

        assertEquals(expected, new Solution().solution(citations));
    }
}
