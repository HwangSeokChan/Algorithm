import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        int[][] land = {{1,2,3,5},
                        {5,6,7,8},
                        {4,3,2,1}};
        int result = 16;
        
        assertEquals(result, new Solution().solution(land));
    }
}
