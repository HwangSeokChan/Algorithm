import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted(new Comparator<String>(){
            @Override
                public int compare(String o1, String o2) {
                    if (o1.toCharArray()[n] == o2.toCharArray()[n]) {
                        return o1.compareTo(o2);
                    } else {
                        return (o1.toCharArray()[n] > o2.toCharArray()[n]) ? 1 : -1;
                    }
                }
            }).toArray(String[]::new);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int n = 2;
        String[] strings = {"abce", "abcd", "cdx"};

        Solution s = new Solution();
        for (String string : s.solution(strings, n)) {
            System.out.println(string);
        }

    }
}
