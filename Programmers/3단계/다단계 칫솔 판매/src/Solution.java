import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<String, String> relation = new HashMap<String, String>();
    Map<String, Integer> profit = new HashMap<String, Integer>();
    
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        for (int i = 0; i < enroll.length; i++) {
            relation.put(enroll[i], referral[i]);
        }

        for (int i = 0; i < seller.length; i++) {
            tax(seller[i], amount[i] * 100);
        }

        for (int i = 0; i < enroll.length; i++) {
            answer[i] = profit.getOrDefault(enroll[i], 0);
            System.out.println(enroll[i] + " : " + answer[i]);
        }

        return answer;
        
    }

    private void tax(String who, int income) {
        String referral = relation.get(who);
        int tax = (int) Math.floor(income * 1 / 10);

        profit.put(who, profit.getOrDefault(who, 0) + (income - tax));

        if (referral.equals("-") || tax == 0) return;
        else {
            tax(referral, tax);
        }
    }

    public int[] solutionB(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];

        Map<String, Integer> incomes = new HashMap<String, Integer>();

        // Calculate Incomes
        for (int i = 0; i < seller.length; i++) {
            incomes.put(seller[i], (int) (incomes.getOrDefault(seller[i], 0) + amount[i] * 100));
        }

        // Calculate Profit without tax for referral
        for (int i = enroll.length-1; i >= 0; i--) {
            int income = incomes.getOrDefault(enroll[i], 0);
            int tax = (int) Math.floor(income * 1 / 10);
            incomes.put(referral[i], (int) incomes.getOrDefault(referral[i], 0) + tax);
            incomes.put(enroll[i], (int) income - tax);
            answer[i] = (int) income - tax;
        }

        return answer;
        
    }
}