class Solution {
    public int solution(int n) {
        int answer = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            answer += (int)c - 48;
        }
        return answer;
    }
    public int solutionB(int n) {
        int answer = 0;
        do {
            answer += n % 10;
            n /= 10;
        } while (n > 0);
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int n = 123;
        System.out.println(foo.solution(n));
        System.out.println(foo.solutionB(n));
    }
}
