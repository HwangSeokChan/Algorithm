public class Solution {
    public int solution(int n) {

        int count = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
                count += 1;
            }
        }

        return count;
    }
    public int solutionB(int n) {

        int count = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                count += 1;
            }
        }

        return count;
    }
}