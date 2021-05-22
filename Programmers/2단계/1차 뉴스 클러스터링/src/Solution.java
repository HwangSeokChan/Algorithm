import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(String str1, String str2) {

        HashMap<String, Integer> setA = string2set(str1);
        HashMap<String, Integer> setB = string2set(str2);

        int countA = countSet(setA);
        int countB = countSet(setB);

        if (setA.isEmpty() && setB.isEmpty()) {
            return 1 * 65536;
        } else {
            int intersection = countIntersection(setA, setB);
            int union = countA + countB - intersection;
            return (int) Math.floor((double) intersection / union * 65536);
        }

    }

    private HashMap<String, Integer> string2set(String str) {
        HashMap<String, Integer> set = new HashMap<String, Integer>();
        for (int i = 0; i < str.length()-1; i++) {
            String keyA = str.substring(i, i+2).toUpperCase();
            if (keyA.matches("[A-Z]{1,}")) {
                int valueA = set.getOrDefault(keyA, 0) + 1;
                set.put(keyA, valueA);
            }
        }
        return set;
    }

    private int countSet(HashMap<String, Integer> set) {
        int count = 0;
        for (Entry<String, Integer> entry : set.entrySet()) {
            count += entry.getValue();
        }
        return count;
    }

    private int countIntersection(HashMap<String, Integer> setA, HashMap<String, Integer> setB) {
        int intersection = 0;
        for (String key : setA.keySet()) {
            if ((setA.containsKey(key)) && (setB.containsKey(key))) {
                intersection += Math.min(setA.get(key), setB.get(key));
            }
        }
        return intersection;
    }
}