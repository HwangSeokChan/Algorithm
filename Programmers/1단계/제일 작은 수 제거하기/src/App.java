import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int idx=0, temp=arr[0];

        if (answer.length == 0) {
            return new int[]{ -1 };
        }

        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
                idx = i;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            if (i >= idx) {
                answer[i] = arr[i+1];
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();

        int[] arr = {3,-1,-3,1,4,2,0};
        // int[] arr = {10};
        int[] result = foo.solution(arr);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
