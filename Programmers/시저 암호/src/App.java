class Solution {

    public String solutionA(String s, int n) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]>='a' && c[i]<='z') {
                c[i] = (c[i] + n > 'z') ? (char)(c[i] + n - ('z' - 'a' + 1)) : (char)(c[i] + n);
            } else if (c[i]>='A' && c[i]<='Z') {
                c[i] = (c[i] + n > 'Z') ? (char)(c[i] + n - ('Z' - 'A' + 1)) : (char)(c[i] + n);
            }
        }
        return String.valueOf(c);
    }

    public String solutionB(String s, int n) {
        char[] c = s.toCharArray();
        char offset;
        for (int i = 0; i < c.length; i++) {
            if (Character.isAlphabetic(c[i])) {
                if (Character.isLowerCase(c[i])) {
                    offset = 'a';
                } else {
                    offset = 'A';
                }
                c[i] = (char)((c[i] + n - offset) % 26 + offset);
            }
        }
        return String.valueOf(c);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        String s = "a B z";
        int n = 4;
        System.out.println('z' - 'a');
        System.out.println(foo.solutionA(s, n));
        System.out.println(foo.solutionB(s, n));
    }
}
