import java.util.Arrays;

class Solution {

    /* 0.0x ms */
    public String solutionA(String phone_number) {
        char[] ch = phone_number.toCharArray();
        Arrays.fill(ch, 0, ch.length-4, '*');
        return String.valueOf(ch);
    }

    /* x ms */
    public String solutionB(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        String buf = phone_number.substring(len-4, len);
        for (int i = 0; i < len - 4; i++) {
            answer += "*";
        }
        return (answer + buf);
    }

    /* 0.x ms */
    public String solutionC(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        String phone_number = "01033334444";
        System.out.println(phone_number);
        System.out.println(foo.solutionA(phone_number));
        System.out.println(foo.solutionB(phone_number));
        System.out.println(foo.solutionC(phone_number));
    }
}
