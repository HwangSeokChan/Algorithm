class Solution {
    public int solution(int n) {

        int count = 1; // 자기자신
        for (int i = n/2+1; i >= 0; i--) { // 절반부터 연속여부 판단
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += j;
                if (sum >= n) {
                    if (sum == n) {
                        count += 1;
                    }
                    break;
                }
            }
        }

        return count;
    }
}