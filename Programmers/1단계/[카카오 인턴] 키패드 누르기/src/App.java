class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left=10, right=12, target;
        int lMove=0, rMove=0;
        for (int i = 0; i < numbers.length; i++) {
            target = numbers[i];
            switch (target) {
                case 1: case 4: case 7: answer += "L"; left  = target; break;
                case 3: case 6: case 9: answer += "R"; right = target; break;
                case 0: 
                    target = 11;
                default:
                    lMove = Math.abs(target-left)  / 3 + Math.abs(target-left)  % 3;
                    rMove = Math.abs(target-right) / 3 + Math.abs(target-right) % 3;
                    if (lMove<rMove) {
                        answer += "L";
                        left = target;
                    } else if (lMove>rMove) {
                        answer += "R";
                        right = target;
                    } else { 
                        if (hand.equals("left")) {
                            answer += "L";
                            left = target;
                        } else {
                            answer += "R";
                            right = target;
                        }
                    }
                break;
            }
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(foo.solution(numbers, hand));
    }
}
