import java.util.*;

class Solution {
    public int solution(String s) {
        return cycle(s);
    }

    private int cycle(String s) {
        int count = 0;
        int loop = s.length();

        while (--loop > 0) {
            if (check(s)) 
                count += 1;
            s = shift(s);
        }
        return count;
    }

    private boolean check(String s) {
        
        Stack<Character> stack = new Stack<Character>();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if ("[{(".indexOf(ch) >= 0) {
                stack.push(ch); 
            } else {
                // 우괄호 먼저 나올 경우 (순서오류)
                if (stack.isEmpty()) {  
                    return false;
                } else {
                    char peek = stack.pop();
                    // 괄호순서 매칭이 안될 경우 (매칭오류)
                    if ((peek == '[' && ch != ']') ||
                        (peek == '{' && ch != '}') ||
                        (peek == '(' && ch != ')')) {
                        return false;
                    }
                }
            }
        }
        // 괄호의 짝이 안 맞는 경우 (조합오류)
        return stack.isEmpty() ? true : false;
    }

    private String shift(String s) {
        return s.substring(1) + s.charAt(0);
    }
}