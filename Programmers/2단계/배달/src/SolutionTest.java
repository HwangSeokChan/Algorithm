import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        // int N = 5;
        // int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        // int K = 3;
        // int result = 4;

        int N = 6;
        int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        int K = 4;
        int result = 4;

        assertEquals(result, new Solution().solution(N, road, K));
    }



}
