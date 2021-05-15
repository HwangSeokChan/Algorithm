import java.util.*;
import java.util.stream.Stream;

public class Solution{
    public int[] solution(String s) {
        String[] arr = s.substring(2, s.length()-2).split("\\}\\,\\{");
        
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        HashSet<String> set = new HashSet<String>();
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String sub : arr) {
            for (String item : sub.split(",")) {
                if (!set.contains(item)) {
                    if (set.add(item))
                        answer[idx++] = Integer.parseInt(item);
                }
            }
        }

        return answer;
    }
}

class SolutionB {
    final Map<Integer, Integer> counts = new LinkedHashMap<>();

    public int[] solution(String s) {
        
        Stream.of(s.replaceAll("[}{]", "").split(",")).mapToInt(Integer::parseInt)
                .forEach(i -> counts.merge(i, 1, Integer::sum));

        return counts.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey).mapToInt(x -> x).toArray();
    }
}
