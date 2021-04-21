class Solution {
    public int solution(int num) {
        int count = 0;
        long n = (long)num;
        while (n!=1) {
            if(++count >= 500)
                return -1;
            n = (n%2==0) ? n/2 : n*3 +1;
        }
        return count;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int num = 626331;
        System.out.println(foo.solution(num));
    }
}
