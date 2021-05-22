import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {

        String str1 = "FRANCE";
        String str2 = "french";
        
        assertEquals(16384, new Solution().solution(str1, str2));
    }
}
