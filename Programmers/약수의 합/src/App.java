class Solution {
    public int solution(int n) {
        if (n<2)
            return n;
        int answer = 1+n;
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0) 
                answer+=i;
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int n = 12;
        System.out.println(foo.solution(n));
    }
}
