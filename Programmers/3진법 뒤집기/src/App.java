class Solution {

    /* 
        속도비교 ( 100배 )
        A : 10.ms
        B : 0.10ms
    */

    public int solutionA(int n) {
        int answer = 0;
        String q = "";
        
        while (n!=0) {
            q = (n % 3) + q;
            n /= 3;
        }
        char[] ch = q.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int s = 1;
            int b = i;
            while (b-- > 0) s *= 3;
            answer += s * Character.getNumericValue(ch[i]);
        }

        return answer;
    }

    public int solutionB(int n) {
        int answer = 0;

        answer = Integer.parseInt(new StringBuffer(Integer.toString(n, 3)).reverse().toString(), 3);
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int n = 45;
        System.out.println(s.solutionA(n));
        System.out.println(s.solutionB(n));
    }
}
