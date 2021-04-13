import java.util.Arrays;
import java.util.HashMap;

class Solution {

    private int getScore(int[] answers, int[] pattern) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            score += (answers[i] == pattern[i % pattern.length]) ? 1 : 0;
        }
        return score;
    }

    public int[] solution(int[] answers) {
        int[] answer = {};

        HashMap<Integer, int[]> patterns = new HashMap<Integer, int[]>();
        patterns.put( 1, new int[] {1,2,3,4,5} );
        patterns.put( 2, new int[] {2,1,2,3,2,4,2,5} );
        patterns.put( 3, new int[] {3,3,1,1,2,2,4,4,5,5} );

        int maxScore = 0;
        for (int key : patterns.keySet()) {
            int curScore = this.getScore(answers, patterns.get(key));
            if (maxScore < curScore) {
                maxScore = curScore;
                answer = new int[] { key };
            } else if (maxScore == curScore) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = key;
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int[] answers = {1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2};
        int[] result = s.solution(answers);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
