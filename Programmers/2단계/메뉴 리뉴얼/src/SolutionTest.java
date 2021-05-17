import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void Test() {
        Solution solution = new Solution();
        // String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        // String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        String[] orders = {"XYZ", "XWY", "WXA"};
        // int[] course = {2,3,4};
        // int[] course = {2,3,5};
        int[] course = {2,3,4};
        // String[] result = {"AC", "ACDE", "BCFG", "CDE"};
        // String[] result = {"ACD", "AD", "ADE", "CD", "XYZ"};
        String[] result = {"WX", "XY"};
        assertArrayEquals(result, solution.solution(orders, course));
    }

}
