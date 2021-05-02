class Solution {
    public int solution(String s) {
        String before, next;
        int repeat;
        int min, max, length;
        int term;
        int str;

        min = max = s.length();

        if (max < 2) {
            return 1;
        }

        for (int diff = 1; diff <= max/2; diff++) {
            length = 0;
            str = 0;
            term = diff;
            before = s.substring(str, term);
            repeat = 1;
            
            while (term < max) {
                str = term;
                term = (term + diff > max) ? max : term + diff;
                next = s.substring(str, term);
                if (before.equals(next)) {
                    repeat++;
                } else {
                    if (repeat > 1) {
                        length += getDigits(repeat);
                    }
                    length += before.length();
                    before = next;
                    repeat = 1;
                }
            }

            length += (repeat > 1) ? before.length() + getDigits(repeat) : before.length();

            min = ( min > length ) ? length : min;
        }
        return min;
    }

    private int getDigits(int n) {
        return (int)Math.floor(Math.log10(n)) + 1;
    }

    public int solutionB(String s) {
        String answer = s;
        String temp = "";

        int repeat, len = s.length();
        String a, b, c;
        for (int size = 1; size <= len/2; size++) {
            repeat = 1;
            temp = ""; a = ""; b = ""; c = "";
            int count = len / size;
            int rest  = len % size;
            for (int i = 0; i < count -1; i++) {
                a = s.substring(size * i,     size * (i+1));
                b = s.substring(size * (i+1), size * (i+2));
                if (a.equals(b)) {
                    repeat++;
                } else {
                    temp += (repeat > 1) ? repeat + a : a;
                    repeat = 1;
                }
            }

            c = s.substring(len - rest, len);
            if (b.equals(c)) {
                repeat++;
            } else {
                temp += (repeat > 1) ? repeat + b : b;
                repeat = 1;
            }
            temp += (repeat > 1) ? repeat + c : c;

            if (answer.length() > temp.length()) {
                answer = temp;
            }
        }

        return answer.length();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        String s = "abcabcabcabcdededededede";
        s= "aabbaccc";
        int a = foo.solution(s);
        System.out.println(a);
    }
}
