import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String number = "4177252841";
        int k = 4;
        String expected = "775841";

        assertEquals(expected, new Solution().solution(number, k));
    }
}
