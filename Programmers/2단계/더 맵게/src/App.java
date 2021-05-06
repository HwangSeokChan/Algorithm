import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int first, second;
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i : scoville) {
            queue.add(i);
        }
        
        while (queue.peek() <= K) {

            if (queue.size()==1) {
                answer = -1;
                break;
            }

            first = queue.poll();
            second = queue.poll();
            queue.add( first + (second * 2) );
            answer++;
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int a = foo.solution(scoville, K);
        System.out.println(a);
    }
}
