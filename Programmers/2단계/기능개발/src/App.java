import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] history = new int[progresses.length];

        int count=0, start=0, deploy=0;
        while (start < progresses.length) {
            deploy=0;
            for (int i = start; i < progresses.length; i++) {
                if (progresses[i]  < 100) progresses[i] += speeds[i]; 
            }

            for (int i = start; i < progresses.length; i++) {
                if (progresses[i] >= 100) {
                    deploy = (i+1)-start;
                } else {
                    break;
                }
            }
            if (deploy>0) {
                history[count++] = deploy;
                start += deploy;
            }
        }
        return Arrays.copyOfRange(history, 0, count);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};


        for (int i : foo.solution(progresses, speeds)) {
            System.out.println(i);    
        }
        
    }
}
