import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    public void test() {

        int[][] board = {{0, 0, 0, 1, 1},{0, 0, 0, 1, 0},{0, 1, 0, 1, 1},{1, 1, 0, 0, 1},{0, 0, 0, 0, 0}};
        int expected = 7;

        assertEquals(expected, new Solution().solution(board));
   }
}