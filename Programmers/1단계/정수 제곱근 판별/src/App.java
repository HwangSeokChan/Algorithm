class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return (sqrt%1==0) ? (long)Math.pow(sqrt+1, 2) : -1; // Math.floor(sqrt) == sqrt ?
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        long n = 121;
        foo.solution(n);
    }
}
