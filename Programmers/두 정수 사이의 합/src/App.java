import java.util.stream.LongStream;

class Solution {

    public long solution(int a, int b) {
        return LongStream.range(Math.min(a,b),Math.max(a,b)+1).reduce((i,j)-> i+j).getAsLong();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int a=-10000000, b=10000000;
        System.out.println(s.solution(a, b));
    }
}
