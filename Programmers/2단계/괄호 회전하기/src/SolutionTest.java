import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String[] s = {
            // "[](){}",
            // "}]()[{",
            "[)(]",
            "}}}",
            "([{)}]"
        };
        int[] result = {
            // 3,
            // 2,
            0,
            0,
            0
        };

        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], new Solution().solution(s[i]));
        }
    }
}
