
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int rows[] = {
            6, 
            // 3, 
            // 100
        };
        int columns[] = {
            6, 
            // 3, 
            // 97
        };
        int[][][] queries = {
            {{2,2,5,4},{3,3,6,6},{5,1,6,3}},
            // {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}},
            // {{1,1,100,97}}
        };
        int[][] result = {
            {8, 10, 25},
            // {1, 1, 5, 3},
            // {1}
        };

        for (int i = 0; i < result.length; i++) {
            assertArrayEquals(result[i], solution.solution(rows[i], columns[i], queries[i]));
        }
    }
}
