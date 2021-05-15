import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;


public class Solution{
    public int[] solution(String s) {
        String[] arr = s.substring(2, s.length()-2).split("\\}\\,\\{");
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        ArrayList<String> list = new ArrayList<String>();
        for (String sub : arr) {
            for (String item : sub.split(",")) {
                if (!list.contains(item)) {
                    list.add(item);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
}
