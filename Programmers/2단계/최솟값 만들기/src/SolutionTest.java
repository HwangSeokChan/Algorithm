import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        int result = 29;
        assertEquals(result, new Solution().solution(A, B));
    }
}
