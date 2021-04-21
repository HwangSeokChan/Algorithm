class Solution {
    public String solution(String s) {
        String[] b = s.split("\\s", 0);
        for (int i = 0; i < b.length; i++) {
            char[] c = b[i].toCharArray();
            for (int j = 0; j < c.length; j+=2) {
                c[j] = Character.toUpperCase(c[j]);
            }
            for (int j = 1; j < c.length; j+=2) {
                c[j] = Character.toLowerCase(c[j]);
            }
            b[i] = String.valueOf(c);
        }
        return String.join(" ", b);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        // String s = "try hello world";
        String s = ".    tR%y 뭔asd  .    d world   .";
        
        System.out.println("."+foo.solution(s)+".");
    }
}
