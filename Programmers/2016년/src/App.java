import java.util.HashMap;

class Solution {

    private int getDateSum(int month, int date) {
        int[] max = { 31, 29, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };
        int sum = 0;

        for (int i = 0; i < month-1; i++) {
            sum += max[i];
        }

        sum += date;

        return sum;

    }

    public String solution(int a, int b) {
        String answer = "";
        HashMap<Integer, String> day = new HashMap<Integer, String>();
        day.put(1, "FRI");
        day.put(2, "SAT");
        day.put(3, "SUN");
        day.put(4, "MON");
        day.put(5, "TUE");
        day.put(6, "WED");
        day.put(0, "THU");

        answer = day.get(this.getDateSum(a, b) % 7);

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        int a = 5;
        int b = 24;

        System.out.println(s.solution(a, b));
    }
}
