import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {

        int[] n = {3, 5, 100000};
        int[] result = {2, 5, -1};

        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], new Solution().solution(n[i]));
        }
    }
}
