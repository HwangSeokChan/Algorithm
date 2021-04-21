import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        Solution s = new Solution();
        int[] result = s.solution(new int[] {2,1,3,4,1});
        // int[] result = s.solution(new int[] {5,0,2,7});
        for (int i : result) {
            System.out.println(i);
        }

    }
}
