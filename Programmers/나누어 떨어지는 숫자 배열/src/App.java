import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i->i%divisor==0).sorted().toArray();
        return (answer.length > 0) ? answer : new int[] { -1 };
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();

        int[] arr = {5,9,7,10};
        int divisor = 5;

        s.solution(arr, divisor);
    }
}
