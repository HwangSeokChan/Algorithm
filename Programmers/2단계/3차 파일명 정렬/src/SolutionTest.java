import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void name() {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] expected = {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};
        assertArrayEquals(expected, new Solution().solution(files));
    }
}
