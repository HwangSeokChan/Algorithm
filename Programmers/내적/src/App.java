class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < b.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] a={1,2,3,4}, b={-3,-1,0,2};
        System.out.println(foo.solution(a, b));
    }
}
