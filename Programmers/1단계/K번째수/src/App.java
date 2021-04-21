import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int idx = 0;
        for (int[] command : commands) {
            int[] subArray = Arrays.copyOfRange(array, command[0]-1, command[1]);
            answer[idx++] = Arrays.stream(subArray).sorted().toArray()[command[2]-1];
        }
        
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        for (int is : s.solution(array, commands)) {
            System.out.println(is);
        }
    }
}
