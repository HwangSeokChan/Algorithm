import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        // int m = 4;
        // int n = 5;
        // String[] board = {
        //     "CCBDE",
        //     "AAADE", 
        //     "AAABF", 
        //     "CCBBF"};
        // int r = 14;
        int m = 6;
        int n = 6;
        String[] board = {
            "AABBEE",
            "AAAEEE",
            "VAAEEV",
            "AABBEE",
            "AACCEE",
            "VVCCEE"};
        int r = 32;
        assertEquals(r, new Solution().solution(m, n, board));
    }
}
