class Solution {
    public String solution(int num) {
        return (num%2==0) ? "Even" : "Odd";
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        foo.solution(num);
    }
}
