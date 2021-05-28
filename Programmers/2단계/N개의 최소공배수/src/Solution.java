import java.util.*;

public class Solution {

    public long solution(int[] arr) {
        Queue<Long> queue = new LinkedList<Long>();
        for (int i : arr) {
            queue.add((long)i);
        }

        while (queue.size() >= 2) {
            long a = queue.poll();
            long b = queue.poll();
            queue.add(lcm(a, b));
        }
        return queue.poll();
    }

    private long lcm(long a, long b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        return a * b / gcd(max, min);
    }

    private long gcd(long max, long min) {
        long remainder = max % min;
        return (remainder != 0) ? gcd(min, remainder) : min;
    }
}