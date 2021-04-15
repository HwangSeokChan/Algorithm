class Solution {
    public boolean solution(String s) {
        return s.matches("\\d{4}{6}") ? true : false;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        String s = "1234";
        System.out.println(solution.solution(s));
    }
}
