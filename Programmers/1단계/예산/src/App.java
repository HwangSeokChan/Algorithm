import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (budget >= i) {
                budget -= i;
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(foo.solution(d, budget));
    }
}
