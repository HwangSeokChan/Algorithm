import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        int expected = 3;

        assertEquals(expected, new Solution().solution(people, limit));
        
    }
}
