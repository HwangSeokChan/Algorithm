import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int count = 0;
        int[] isPrime = new int[n+1]; // 0 ~ n
        Arrays.fill(isPrime, 1); // to count, no condition
        isPrime[0] = isPrime[1] = 0; // prime > 1

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (isPrime[i]==0) continue;
            
            for (int j = i*i; j < isPrime.length; j+=i) {
                isPrime[j] = 0;
            }
        }

        for (int i : isPrime) count += i;
        return count;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int n = 10;
        solution.solution(n);
    }
}
