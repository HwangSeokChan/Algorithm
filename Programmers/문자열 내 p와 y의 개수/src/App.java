class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toUpperCase().toCharArray();
        int isSame = 0;
        for (char d : c) {
            switch (d) {
                case 'P': isSame++; break;
                case 'Y': isSame--; break;
            }
        }

        if (isSame!=0) {
            answer = false;
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        String s = "pPoooyY";

        Solution solution = new Solution();
        solution.solution(s);
    }
}
