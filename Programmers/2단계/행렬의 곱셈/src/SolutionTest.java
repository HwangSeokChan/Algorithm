import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[][] arr1 = {{1, 4},
                        {3, 2},
                        {4, 1},
                        {4, 1}};
        int[][] arr2 = {{3, 3},
                        {3, 3},
                        {3, 3}};
        int[][] result = {{15, 15},
                          {15, 15},
                          {15, 15},
                          {15, 15}};
        assertArrayEquals(result, new Solution().solution(arr1, arr2));
    }
}
