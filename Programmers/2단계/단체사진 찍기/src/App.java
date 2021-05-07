class Solution {

    char[] friends = { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };
    String[] conditions;

    public int solution(int n, String[] data) {
        conditions = data;
        return permutation("");
    }

    private int permutation(String order) {

        int count = 0;
        if (order.length() < friends.length) {
            for (int i = 0; i < friends.length; i++) {
                if (order.indexOf(friends[i]) < 0 ) {
                    count += permutation(order + friends[i]);
                }
            }
        } else if (check(order)) {
            count++;
        }

        return count;
    }

    private boolean check(String order) {

        for (String condition : conditions) {
            char a  = condition.charAt(0);
            char b  = condition.charAt(2);
            char op = condition.charAt(3);
            int val = (int)(condition.charAt(4)-'0');

            int between = Math.abs(order.indexOf(a) - order.indexOf(b)) - 1;
            switch (op) {
                case '>': if (between <= val) return false; break;
                case '=': if (between != val) return false; break;
                case '<': if (between >= val) return false; break;
            }
        }

        return true;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int n = 2;
        String[] data = {"N~F=0", "R~T>2"};
        int a = foo.solution(n, data);

        System.out.println(a);
    }
}


