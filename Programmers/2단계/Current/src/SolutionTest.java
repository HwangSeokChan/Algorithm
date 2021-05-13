import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
public class SolutionTest {

    Solution test = new Solution();

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

        HashMap<Integer, int[][]> testCase = new HashMap<Integer, int[][]>();

        // testCase.put(11, new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}});
        testCase.put(-1, new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}});

        for (Map.Entry<Integer, int[][]> entry : testCase.entrySet()) {
            entry.getKey();
            int a = test.bfs(entry.getValue());
            assertEquals(entry.getKey(), a);
        }
    }
}