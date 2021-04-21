class Solution {
    public boolean solution(int x) {
        int n = x, m = 0;
        while (n>0) {
            m = m + n % 10;
            n /= 10;
        }
        return (x%m == 0) ? true : false;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int x = 13;
        System.out.println(foo.solution(x));
    }
}
