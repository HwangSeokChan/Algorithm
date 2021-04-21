class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        answer = n;

        for (int l : lost)
            students[l-1]--;
        for (int r : reserve) 
            students[r-1]++;

        for (int i = 0; i < students.length; i++) {
            if (students[i] < 0) {
                if (i > 0 && students[i-1] > 0) {
                    students[i]++;
                    students[i-1]--;
                } else if (i < students.length-1 && students[i+1] > 0) {
                    students[i]++;
                    students[i+1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int[][][] inputs = {
            {{5}, {2,4}, {1,3,5}},
            {{5}, {2,4}, {3}},
            {{3}, {3}, {1}}
        };

        for (int[][] input : inputs) {
            int n = input[0][0];
            int[] lost = input[1];
            int[] reserve = input[2];

            System.out.println( s.solution(n, lost, reserve) );
        }

        
    }
}
