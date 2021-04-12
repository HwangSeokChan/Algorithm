import java.util.HashMap;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        
        int count;
        for (String name : participant) {
            count = hashMap.getOrDefault(name, 0) + 1;
            hashMap.put(name, count);
        }
        for (String name : completion) {
            count = hashMap.getOrDefault(name, 0) - 1;
            hashMap.put(name, count);
        }

        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            if (hashMap.get(key) > 0) {
                answer = key;
                break;
                // answer += (hashMap.get(key) > 0) ? key+"\s" : "";
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        
        Solution s = new Solution();
        String answer = s.solution(participant, completion);

        System.out.println(answer);
    }
}
