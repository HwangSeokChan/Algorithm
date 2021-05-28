import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        // int[] arr = {2,6,8,14};
        // int reulst = 168;
        // int[] arr = {3,4,9,16};
        // int reulst = 144;
        int[] arr = {2, 3};
        int reulst = 6;
        
        assertEquals(reulst, new Solution().solution(arr));
    }
}
