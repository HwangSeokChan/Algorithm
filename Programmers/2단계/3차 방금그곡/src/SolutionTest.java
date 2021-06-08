import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {

        // String m = "CC#BCC#BCC#BCC#B";
        // String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
        // String expected = "FOO";
        
        String m = "ABC";
        String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String expected = "WORLD";

        assertEquals(expected, new Solution().solution(m, musicinfos));
    }
}
