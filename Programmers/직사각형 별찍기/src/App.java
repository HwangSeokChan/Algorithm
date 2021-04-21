import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void solution(int n, int m) {
        char[] lines = new char[n];
        Arrays.fill(lines, '*');
        for (int i = 0; i < m; i++) {
            System.out.println(String.valueOf(lines));
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        foo.solution(a, b);
    }
}
