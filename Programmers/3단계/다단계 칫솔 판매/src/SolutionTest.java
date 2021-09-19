import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {

        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        int[] expected = {360, 958, 108, 0, 450, 18, 180, 1080};
        assertArrayEquals(expected, new Solution().solution(enroll, referral, seller, amount));
    }
}
