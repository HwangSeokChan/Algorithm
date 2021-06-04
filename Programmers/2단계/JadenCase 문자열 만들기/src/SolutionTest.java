import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String s = "3people unFollowed me";
        String r = "3people Unfollowed Me";
        assertEquals(r, new Solution().solution(s));
    }
}
