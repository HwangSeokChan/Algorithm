class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            answer += (signs[i]) ? absolutes[i] : - absolutes[i];
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        System.out.println(foo.solution(absolutes, signs));
    }
}
