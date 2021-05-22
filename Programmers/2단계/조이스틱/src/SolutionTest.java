import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {

        String name = "JEROEN";
        // String name = "JAN";
        // String name = "ZAAAZAAAAAA";
        // String name = "AABAABAAAAAAAA";
        int result = 56;
        // int result = 23;
        // int result = 9;
        assertEquals(result , new Solution().solution(name));
    }
}
