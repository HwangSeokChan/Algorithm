class Solution {
    public String solution(int base, int time, int member, int position) {

        int num = 0;
        int loop = member * (time -1) + position;

        StringBuilder buf = new StringBuilder();
        while (loop > buf.length()) {
            buf.append(Integer.toString(num++, base).toUpperCase());
            // buf.append(base_conversion(num++, base));
        }

        String answer = "";
        for (int i = position-1; i < loop; i+=member) {
            answer += buf.charAt(i);
        }

        return answer;
    }

    // private String base_conversion(int num, int base) {

    //     if (num == 0) return "0";

    //     StringBuilder sb = new StringBuilder();
    //     int remainder = 0;
    //     while (num != 0) {
    //         remainder = (num % base);
    //         switch (remainder) {
    //             case 10: remainder = 'A'; break;
    //             case 11: remainder = 'B'; break;
    //             case 12: remainder = 'C'; break;
    //             case 13: remainder = 'D'; break;
    //             case 14: remainder = 'E'; break;
    //             case 15: remainder = 'F'; break;
    //             default: remainder += '0';break;
    //         }
    //         sb.append((char)remainder);
    //         num /= base;
    //     }
    //     return sb.reverse().toString();
    // }
}