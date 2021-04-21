import java.util.Arrays;
import java.util.OptionalInt;

class Solution {
    /* time : 0.0x */
    public long solution(long n) {
        char[] ch = Long.toString(n).toCharArray();
        char tmp;

        for (int j = 0; j < ch.length-1; j++) {
            for (int i = 0; i < ch.length-1; i++) {
                if ((int)ch[i] < (int)ch[i+1]) {
                    tmp = ch[i+1];
                    ch[i+1] = ch[i];
                    ch[i] = tmp;
                }
            }
        }
        return Long.parseLong(String.valueOf(ch));
    }
    
    /* time : 0.x */
    public long solutionB(long n) {
        char[] ch = Long.toString(n).toCharArray();
        Arrays.sort(ch);
        return Long.parseLong(new StringBuilder(String.valueOf(ch)).reverse().toString());
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();

        long n = 118372;
        foo.solution(n);
    }
}
