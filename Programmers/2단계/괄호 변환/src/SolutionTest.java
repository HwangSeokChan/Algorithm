import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
public class SolutionTest {


    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        HashMap<String, String> testCase = new HashMap<String, String>();

        testCase.put("()(())()", "()))((()");

        for (Map.Entry<String, String> entry : testCase.entrySet()) {
            assertEquals(
                entry.getKey(), 
                solution.solution(entry.getValue())
            );
        }
    }
}