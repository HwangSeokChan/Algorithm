import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {

        int[] n = {1,2,2,1,1,10};
        int[] t = {1,10,1,1,1,60};
        int[] m = {5,2,2,5,1,45};
        String[][] timetable = {{"08:00", "08:01", "08:02", "08:03"}, 
                                {"09:10", "09:09", "08:00"}, 
                                {"09:00", "09:00", "09:00", "09:00"}, 
                                {"00:01", "00:01", "00:01", "00:01", "00:01"},
                                {"23:59"},
                                {"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}};

        String[] expected = {"09:00", "09:09", "08:59", "00:00", "09:00", "18:00"};

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], new Solution().solution(n[i], t[i], m[i], timetable[i]));
        }
    }
}
