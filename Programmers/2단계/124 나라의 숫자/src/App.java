class Solution {

    /* 몫처리방법A */
    public String solutionA(int n) {
        String answer = "";
        while (n > 0) {
            if (n % 3 == 0) {
                answer = "4" + answer;
                n = ((n / 3) >=  1) ? ((n) / 3  - 1 ) : 0;
            } else if (n % 3 == 1 ) {
                answer = "1" + answer;
                n = n / 3;
            } else if (n % 3 == 2 ) {
                answer = "2" + answer;
                n = n / 3;
            }
        }
        return answer;
    }

    /* 몫처리방법B */
    public String solutionB(int n) {
        String[] num = {"4","1","2"};
        String answer = "";
        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n-1) / 3;
        }
        return answer;
    }

    /* 재귀함수 */
    public String solutionC(int n) {
        String answer = "";
        if (n > 0) {
            int rest = n % 3;
            answer = ((rest == 0) ? "4" : (rest == 1) ? "1" : "2") + answer;
            answer = solutionC((n-1) / 3) + answer;
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        // int n = 5;
        // foo.solution(n);
        System.out.println("0 : "+foo.solutionA(0));
        System.out.println("1 : "+foo.solutionA(1));
        System.out.println("2 : "+foo.solutionA(2));
        System.out.println("3 : "+foo.solutionA(3));
        System.out.println("4 : "+foo.solutionA(4));
        System.out.println("5 : "+foo.solutionA(5));
        System.out.println("6 : "+foo.solutionA(6));
        System.out.println("7 : "+foo.solutionA(7));
        System.out.println("8 : "+foo.solutionA(8));
        System.out.println("9 : "+foo.solutionA(9));
        System.out.println("10 : "+foo.solutionA(10));
    }
}
