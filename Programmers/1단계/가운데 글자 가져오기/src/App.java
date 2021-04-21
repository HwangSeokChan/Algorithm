class Solution {
    public String solutionA(String s) {
        int size = s.length();
        int half = size / 2;
        if (size % 2 == 0) {
            /* Even */ return s.substring(half-1, half+1);
        } else {
            /* Odd */ return s.substring(half, half+1);
        }
    }

    public String solutionB(String s) {
        int size = s.length();
        /* / = 소수점 제거 */
        return s.substring((size-1)/2, size/2+1);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        String str1 = "abcde";
        String str2 = "qwer";
        System.out.println(s.solutionA(str1));
        System.out.println(s.solutionB(str2));
    }
}
