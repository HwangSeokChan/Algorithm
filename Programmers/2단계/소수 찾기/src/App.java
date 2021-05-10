import java.util.Arrays;
import java.util.HashSet;

class Solution {

    int[] data;
    boolean[] isPrime;
    boolean[] visited;

    HashSet<Integer> set = new HashSet<Integer>();

    public int solution(String numbers) {

        long max = 0;
        char[] c = numbers.toCharArray();
        data = new int[c.length];
        visited = new boolean[numbers.length()];
        // 1. 정렬 후 역순으로 최대값 획득
        // 2. from char[] to int[] 변경
        Arrays.sort(c);
        for (int i = c.length-1; i >= 0; i--) {
            data[i] = (c[i] - '0');
            max += Math.pow(10, i) * (data[i]);
        }
        // 3. 최대값까지의 소수목록 : 소수 중복체크 방지
        isPrime = getPrimeList((int)max);

        return permutation(0, 0);
    }

    // 완전방문탐색 (순열)
    private int permutation(int number, int depth) {
        int count = 0;
        if (depth < data.length) {
            for (int i = 0; i < data.length; i++) {
                if (visited[i]) {
                    continue;
                } else {
                    visited[i] = true;
                    count += permutation(((int) Math.pow(10, depth) * data[i]) + number, depth+1);
                    visited[i] = false;
                }
            }
        }
    
        if (set.contains(number) == false) {
            set.add(number);
            if (isPrime[number]) count++;
        }

        return count;
        
    }

    // 아스토스테네스의 체 ( 재사용성 )
    private boolean[] getPrimeList(int n) {
        boolean[] isPrime = new boolean[n+1]; // 0 ~ n
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // prime > 1

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (isPrime[i] == false) continue;
            
            for (int j = i*i; j < isPrime.length; j+=i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        String numbers = "011";
        int a = foo.solution(numbers);
        System.out.println(a);
    }
}
