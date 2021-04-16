class Solution {
    public int solutionA(String s) {
        return Integer.parseInt(s);
    }

    public int solutionB(String s) {
        boolean sign = true;
        int answer = 0, str = 0;
        char[] ch = s.toCharArray(); 
        if ((int)ch[0] > 57 || (int)ch[0] < 48) {
            sign = (ch[0] == '-') ? false : true;
            str++;
        }
        for (int i = str; i < ch.length; i++) {
            answer = (answer*10) + ((int)ch[i] - (int)'0');
        }
        return sign ? answer : answer*(-1);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution sObject = new Solution();
        String s = "-1234";
        System.out.println((int)'0');
        System.out.println((int)'9');
        System.out.println(sObject.solutionA(s));
        System.out.println(sObject.solutionB(s));
    }
}
