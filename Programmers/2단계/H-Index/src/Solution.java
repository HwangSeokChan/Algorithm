import java.util.Arrays;

class Solution {
    public int solutionA(int[] citations) {
        for (int i = citations.length; i > 0; i--) {
            int above = 0;
            int below = 0;
            for (int citation : citations) {
                if (citation == i) {
                    above ++;
                    below ++;
                } else if (citation > i) {
                    above ++;
                } else if (citation < i) {
                    below ++;
                }
            }

            if (above >= i && below <= i) {
                return i;
            }
        }

        return 0;
    }

    public int solution(int[] citations) {
        
        Arrays.sort(citations);

        int h_index = 0;
        for(int i = citations.length-1; i >= 0; i--){
            int no = citations.length - i;
            int citation = citations[i];
            int score = Math.min(citation, no);
            if(h_index < score) 
                h_index = score;
            else 
                break;
        }

        return h_index;
    }
}