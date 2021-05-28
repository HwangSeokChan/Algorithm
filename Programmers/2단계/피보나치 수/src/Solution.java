class Solution {

    int[] base;

    public int solution(int n) {
        base = new int[n+1];
        return bottom_up(n);
    }

    private int fibonacci(int n) {
        return (n > 1) ? (fibonacci(n-1) + fibonacci(n-2)) % 1234567 : n;
    }

    private int memorization(int n) {

        if (base[n] == 0) {
            base[n] = (n > 1) ? memorization(n-1) + memorization(n-2) : n;
        }
        return base[n]  % 1234567;
    }

    private int bottom_up(int n) {

        base[0] = 0;
        base[1] = 1;

        for (int i = 2; i < base.length; i++) {
            base[i] = (base[i-1] % 1234567) + (base[i-2] % 1234567);
        }

        return base[n] % 1234567;
    }
}