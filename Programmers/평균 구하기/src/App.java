class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i : arr) {
            answer += i;
        }
        return answer/arr.length;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] arr = {1,2,3,4};
        System.out.println(foo.solution(arr));
    }
}
