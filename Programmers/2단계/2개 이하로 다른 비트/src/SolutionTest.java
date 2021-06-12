import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        long[] numbers = {2,7};
        long[] expected = {3,11};
        // long[] numbers = {19};
        // long[] expected = {15};
        assertArrayEquals(expected, new Solution().solution(numbers));
    }
}
