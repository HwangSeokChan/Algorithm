import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int last = B.length-1;
        for (int i = 0; i < B.length; i++) {
            sum += (A[i] * B[last-i]);
        }

        return sum;
    }
}