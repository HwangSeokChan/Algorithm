import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        return "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다";
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String[] seoul = {"Jane", "Kim"};
        solution.solution(seoul);
    }
}
