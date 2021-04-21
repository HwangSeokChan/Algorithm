import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] blocked = new double[N+1]; // N+1 = 전체 클리어
        int sum = 0, count = 0;
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();
        List<Map.Entry<Integer, Double>> entries;
        
        for (int i = 0; i < stages.length; i++) {
            blocked[stages[i]-1]++;
        }
        
        for (int i = blocked.length -1 ; i >= 0; i--) {
            sum += blocked[i];
            map.put(i+1, blocked[i] / sum);
        }

        entries = new ArrayList<Map.Entry<Integer, Double>>(map.entrySet());
        entries.sort(new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (Map.Entry<Integer,Double> entry : entries) {
            if ((entry.getKey())!=N+1) { // N+1 = 전체 클리어는 제외 (다음게임 대기중)
                answer[count++] = entry.getKey();
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        foo.solution(N, stages);
    }
}
