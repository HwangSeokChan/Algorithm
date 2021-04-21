import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] values = dartResult.split("[S|D|T|*|#]{1,}");
        String[] operators = dartResult.split("[0-9]{1,}");
        operators = Arrays.copyOfRange(operators, 1, operators.length);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String value : values) {
            list.add(Integer.parseInt(value));
        }
        for (int i = 0; i < operators.length; i++) {
            char[] ch = operators[i].toCharArray();
            for (char c : ch) {
                switch (c) {
                    case 'S': list.set(i, (int)Math.pow(list.get(i), 1)); break;
                    case 'D': list.set(i, (int)Math.pow(list.get(i), 2)); break;
                    case 'T': list.set(i, (int)Math.pow(list.get(i), 3)); break;
                    case '*': 
                        list.set(i, list.get(i)*2);
                        if (i>0) {
                            list.set(i-1, list.get(i-1)*2);
                        }
                        break;
                    case '#': 
                        list.set(i, list.get(i)*(-1));
                        break;
                }
            }
        }
        for (Integer integer : list) {
            answer += integer;
        }
        return answer;
    }

    public int solutionA(String dartResult) {

        int answer = 0;
        char[] ch = dartResult.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        int last, before;
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'S': stack.push((int)Math.pow(stack.pop(), 1)); break;
                case 'D': stack.push((int)Math.pow(stack.pop(), 2)); break;
                case 'T': stack.push((int)Math.pow(stack.pop(), 3)); break;
                case '*': 
                    last = stack.pop();
                    if (!stack.empty()) {
                        before = stack.pop();
                        stack.push(before*2);
                    }
                    stack.push(last*2);
                    break;
                case '#': 
                    stack.push(stack.pop()*(-1));
                    break;
                default:
                    if(ch[i]=='0' && !stack.empty() && stack.peek()==1) {
                        stack.pop();
                        stack.push(10);
                    } else {
                        stack.push(ch[i]-'0');
                    }
                    break;
            }
        }

        for (Integer integer : stack) {
            answer += integer;
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        // String dartResult = "1S2D*3T";
        // String dartResult = "1D2S#10S";
        String dartResult = "0D2S0T";
        // foo.solution(dartResult);
        foo.solutionA(dartResult);
        
    }
}
