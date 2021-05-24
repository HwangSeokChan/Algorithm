import java.util.*;

class Solution {

    char[] operators = {'*', '+', '-'};
    String separator = ",";
    String[] priority = {
        "*+-", "*-+",
        "-*+", "-+*",
        "+-*", "+*-"
    };

    public long solution(String expression) {

        String[] postfixs = new String[6];
        for (int i = 0; i < priority.length; i++) {
            postfixs[i] = in2postfix(expression, priority[i], separator);
        }

        long max = 0;
        for (String postfix : postfixs) {
            long tmp = Math.abs(calculate(postfix));
            if (max < tmp)
                max = tmp;
        }
        return max;
    }

    private long calculate(String postfix) {

        Stack<Long> stack = new Stack<Long>();
        String[] item = postfix.split(separator);
        for (int i = 0; i < item.length; i++) {
            if (item[i].length() == 1 && isOperator(item[i].charAt(0))) {
                long back = stack.pop();
                long front = stack.pop();
                switch (item[i].charAt(0)) {
                    case '*': stack.push(front * back); break;
                    case '+': stack.push(front + back); break; 
                    case '-': stack.push(front - back); break;
                }
            } else {
                stack.push(Long.parseLong(item[i]));
            }
        }

        return stack.pop();
    }

    private String in2postfix(String expression, String priority, String separator) {

        StringBuilder postfix = new StringBuilder();
        Stack<Character> op = new Stack<Character>();
        for (char c : expression.toCharArray()) {
            if (isOperator(c)) {
                postfix.append(separator);
                while (!op.empty() && isHigherPriority(op.peek(), c, priority)) {
                    postfix.append(op.pop() + separator);
                }
                op.push(c);
            } else {
                postfix.append(c);
            }
        }

        while (! op.empty()) {
            postfix.append(separator + op.pop());
        }

        return postfix.toString();
    }

    private boolean isHigherPriority(char op1, char op2, String priority) {
        return (priority.indexOf(op1) >= priority.indexOf(op2)) ? true : false;
    }

    private boolean isOperator(char c) {
        for (char operator : operators) {
            if (operator == c)
                return true;
        }
        return false;
    }
}