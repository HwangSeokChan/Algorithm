import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solutionA(String s) {
        return s.chars().boxed().sorted(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }).mapToInt(Integer::intValue).collect(
            StringBuilder::new,
            (sb, i) -> sb.append((char)i),
            StringBuilder::append
            ).toString();
    }

    public String solutionB(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new StringBuilder(String.valueOf(c)).reverse().toString();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        String s = "ZBBbcdefg";
        Solution solution = new Solution();
        solution.solutionA(s);
        solution.solutionB(s);
    }
}
