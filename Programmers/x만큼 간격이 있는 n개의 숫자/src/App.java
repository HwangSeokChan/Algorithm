class Solution {
    public long[] solutionA(int x, int n) {
        long[] answer = new long[n];
        long v = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = v += x;
        }

        return answer;
    }

    public long[] solutionB(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x*(i+1);
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();

        int x=2, n=5;

        foo.solutionA(x, n);
        foo.solutionB(x, n);
    }
}
