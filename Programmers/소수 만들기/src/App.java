import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int sum = nums[nums.length-3] + nums[nums.length-2] + nums[nums.length-1];
        boolean[] isPrime = new boolean[sum+1];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (isPrime[i]) {
                continue;
            }

            for (int j = i*i; j < isPrime.length; j+=i) {
                isPrime[j] = true;
            }
        }

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    if (isPrime[nums[i] + nums[j] + nums[j2]]==false) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] nums = {1,2,3,4};
        // int[] nums = {1,2,7,6,4};
        
        System.out.println(foo.solution(nums));
    }
}
