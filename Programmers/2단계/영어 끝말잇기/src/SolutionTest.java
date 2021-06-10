import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] expected = {3,3};
        assertArrayEquals(expected, new Solution().solution(n, words));
    }
}
