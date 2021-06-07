import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void name() {
        String[][] relation = {
            {"100","100","100","100","100","ryan","music","2"},
            {"200","200","200","200","200","apeach","math","2"},
            {"300","300","300","300","300","tube","computer","3"},
            {"400","400","400","400","400","con","computer","4"},
            {"500","500","500","500","500","muzi","music","3"},
            {"600","600","600","600","600","apeach","music","2"}};
        int expected = 2;
        // String[][] relation = {{"a","1","aaa","c","ng"},{"b","1","bbb","c","g"},{"c","1","aaa","d","ng"},{"d","2","bbb","d","ng"}};
        // int expected = 3;
        
        assertEquals(expected, new Solution().solution(relation));
    }
}
