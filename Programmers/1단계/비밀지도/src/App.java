class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]); 
            int max = answer[i].length();
            for (int j = 0; j < n-max; j++) {
                answer[i] = "0" + answer[i];
            }
            // answer[i] = String.format("%"+n+"s", answer[i]);
            answer[i] = answer[i].replaceAll("1","#").replaceAll("0", " ");
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int n = 5;
        int[] arr1={9, 20, 28, 18, 11}, arr2={30, 1, 21, 17, 28};
        for (String i : foo.solution(n, arr1, arr2)) {
            System.out.println(i);    
        }
    }
}
