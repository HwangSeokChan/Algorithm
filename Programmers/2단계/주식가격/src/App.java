class Solution {

    // 값입력이 각 최대 2회 발생
    public int[] solutionA(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            answer[i] = answer.length - i - 1;
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }
    
    // 값입력이 각 최대 n회 발생
    public int[] solutionB(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) 
                    break;
            }
        }
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] prices = {1, 2, 3, 2, 3};
        int[] a = foo.solutionA(prices);
        for (int i : a) {
            System.out.println(i);
        }
        int[] b = foo.solutionB(prices);
        for (int i : b) {
            System.out.println(i);
        }
    }
}
