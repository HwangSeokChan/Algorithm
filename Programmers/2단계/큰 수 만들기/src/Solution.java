import java.util.Stack;

class Solution {

    public String solutionA(String number, int k) {

        StringBuilder sb = new StringBuilder(number);
        for (int i = 1; i < sb.length(); i++) {
            if (k <= 0) {
                break;
            }

            if (sb.charAt(i) > sb.charAt(i - 1)) {
                sb.delete(i-1, i);
                k -= 1;
                i = 0;
            }
        }

        if (k > 0) {
            sb.delete(sb.length()-k, sb.length());
        }

        return sb.toString();
    }

    public String solution(String number, int k) {

        char[] result = new char[number.length() - k];

        Stack<Character> stack = new Stack<>();
        for (char c : number.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }

        /**
         * stack 은 비교조건이 전부 수행되지 않는 케이스가 있다.
         * lastIndex 가 그전의 수보다 클때가 그 경우다.
         * 그렇기에 stack 에서 추출할 갯수는 다음과 같다.
         * 
         *   `result.length = (k > 0) ? stack.size() - k : stack.size()`
         */
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        
        return String.valueOf(result);
    }
}