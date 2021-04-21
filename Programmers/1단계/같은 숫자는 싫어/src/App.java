import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new LinkedList<Integer>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]!=arr[i]) {
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        int[] arr = {1,1,3,3,0,1,1};
        Solution s = new Solution();
        int[] result = s.solution(arr);

        for (int r : result) {
            System.out.println(r);
        }

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
 
        System.out.println("Execution time in milliseconds: " + timeElapsed + "ms");
    }
}
