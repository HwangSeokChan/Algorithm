import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }
 
        int sum = 1;
        for (Entry<String, Integer> e : map.entrySet()) {
            sum *= e.getValue() + 1;
        }
        
        return sum - 1;
    }
}