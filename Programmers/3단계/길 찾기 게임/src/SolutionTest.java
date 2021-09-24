
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        System.out.println("RUN TEST");

        int[][] nodeinfo = {{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};
        int[][] expected = {{7,4,6,9,1,8,5,2,3},{9,6,5,8,1,4,3,2,7}};
        assertArrayEquals(expected, new Solution().solution(nodeinfo));
    }
}
