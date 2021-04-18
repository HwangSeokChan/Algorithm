class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            answer[i] = (int)num.charAt(num.length()-1-i) - 48;
        }
        return answer;
    }
    public int[] solutionB(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int count = 0;
        while (n > 0) {
            answer[count] = (int)(n % 10);
            n /= 10;
            count++;
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        long n = 1234;
        for (int c : foo.solution(n)) {
            System.out.println(c);
        }
    }
}
