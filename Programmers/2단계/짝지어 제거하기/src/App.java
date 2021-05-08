import java.util.Stack;

class Solution
{    
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        String s = "baabaa";
        // s = "cdcd";
        int a = foo.solution(s);

        System.out.println(a);
    }
}
