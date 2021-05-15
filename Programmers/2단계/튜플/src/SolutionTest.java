import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        s = "{{20,111},{111}}";
        // s = "{{123}}";
        // s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        // int[] result = {2, 1, 3, 4};
        // int[] result = {2, 1, 3, 4};
        int[] result = {111, 20};
        // int[] result = {123};
        // int[] result = {3, 2, 4, 1};

        Solution foo = new Solution();
        assertArrayEquals(result, foo.solution(s));
    }
}
