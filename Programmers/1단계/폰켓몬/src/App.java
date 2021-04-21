import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int option = (int)Arrays.stream(nums).distinct().count();
        int max = nums.length/2;
        return ( option > max ) ? max : option;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int[] nums = {3,3,3,2,2,4};
        s.solution(nums);
    }
}
