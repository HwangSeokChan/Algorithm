import java.util.Iterator;
import java.util.LinkedList;

class Solution {
    int time=0;
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum=0, ing=0, end=0;
        int count = truck_weights.length;

        LinkedList<Integer> list = new LinkedList<Integer>();

        while (end < count || list.size() > 0) {
            for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
                if (it.next() <= time) {
                    it.remove();
                    sum -= truck_weights[end++];
                } else {
                    break;
                }
            }

            if (ing < count && weight >= (sum + truck_weights[ing])) {
                sum += truck_weights[ing++];
                list.add(time + bridge_length);
            }
            time++;
        }

        return time;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        // int bridge_length = 2;
        // int weight = 10;
        // int[] truck_weights = {7,4,5,6};
        int bridge_length = 100;
        int weight = 100;
        // int[] truck_weights = {10};
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int time = foo.solution(bridge_length, weight, truck_weights);
        System.out.println(time);
    }
}
