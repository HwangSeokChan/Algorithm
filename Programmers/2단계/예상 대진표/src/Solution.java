class Solution
{
    public int solution(int n, int a, int b) {

        int count = 1;
        while ((Math.max(a, b) % 2 != 0) || (Math.abs(a - b) != 1)) {
            a = (int) Math.round(a / 2.0);
            b = (int) Math.round(b / 2.0);
            count ++;
        }

        return count;
    }
}