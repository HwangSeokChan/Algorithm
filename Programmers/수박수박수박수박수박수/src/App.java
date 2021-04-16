class Solution {
    // O(n);
    public String solutionA(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += (i%2==0) ? '수' : '박';
        }
        return answer;
    }

    // O(1);
    public String solutionB(int n) {
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int n = 111;
        System.out.println(solution.solutionA(n));
        System.out.println(solution.solutionB(n));
    }
}
