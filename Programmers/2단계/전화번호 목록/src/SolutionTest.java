import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        Solution solution = new Solution();
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean result = false;

        assertEquals(result, solution.solution(phone_book));
    }
}
