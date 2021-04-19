class Solution {
    public int getGCD(int n, int m) {
        int big, small, gcd=1;
        
        if (n > m) {
            big = n;
            small = m;
        } else {
            big = m;
            small = n;
        }

        for (int i = small; i > 0; i--) {
            if (small%i==0 && big%i==0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    public int getLCM(int n, int m) {

        int big, small, lcm=1;
        
        if (n > m) {
            big = n;
            small = m;
        } else {
            big = m;
            small = n;
        }

        for (int i = 1; i <= small; i++) {
            lcm = big*i;
            if (lcm%small == 0) {
                break;
            }
        }
        
        return lcm;
    }

    public int[] solutionA(int n, int m) {
        return new int[]{getGCD(n,m), getLCM(n,m)};
    }

    public int[] solutionB(int n, int m) {
        int gcd = getGCD(n,m);
        return new int[]{gcd, n*m/gcd};
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int n=3, m=12;

        for (int i : foo.solutionA(n, m)) {
            System.out.println(i);    
        }
        for (int i : foo.solutionB(n, m)) {
            System.out.println(i);    
        }
    }
}
