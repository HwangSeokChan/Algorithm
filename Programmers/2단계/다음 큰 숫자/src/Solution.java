import java.util.Arrays;

class Solution {
    public int solution(int n) {
        char[] binary = Integer.toBinaryString(n).toCharArray();

        return Integer.parseInt(String.valueOf(increase(binary)), 2);
    }

    private char[] increase(char[] binary) {

        boolean ready = false;
        int count = 0;
        int length = binary.length;
        int pos = 0;
        for (int i = length-1; i >= 0; i--) {
            if (ready) {
                if (binary[i] == '1') {
                    count += 1;
                    pos = i;
                } else {
                    break;
                }
            } else {
                if (binary[i] == '1') {
                    ready = true;
                    pos = i;
                }
            }
        }

        char[] newBinary = (pos != 0) ? new char[length] : new char[length + 1];
        Arrays.fill(newBinary, '0');

        for (int i = 0; i < pos-1; i++) {
            newBinary[i] = binary[i];
        }

        if (pos == 0) {
            newBinary[0] = '1';
        } else {
            newBinary[pos-1] = '1';
        }

        for (int i = newBinary.length - count; i < newBinary.length; i++) {
            newBinary[i] = '1';
        }

        return newBinary;
    }
}