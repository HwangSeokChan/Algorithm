class Solution {
    public long solutionA(int w, int h) {

        long count = 0;
        if (h > w) {
            int d = w - h;
            for (int i = 0; i < h; i++) {
                if (d < 0) {
                    d += (w);
                    count += 1;
                } else if (d == 0) {
                    d += (w-h);
                    count += 1;
                } else {
                    d += (w-h);
                    count += 2;
                }
            }
        } else {
            int d = h - w;
            for (int i = 0; i < w; i++) {
                if (d < 0) {
                    d += (h);
                    count += 1;
                } else if (d == 0) {
                    d += (h-w);
                    count += 1;
                } else {
                    d += (h-w);
                    count += 2;
                }
            }
        }
        return (long) w * (long) h - count;
    }

    
    public long solutionB(int w, int h) {
        int max = Math.max(w, h);
        int min = Math.min(w, h);
        
        return (long) w * (long) h - ((w + h) - euclidean(max, min));
    }

    // g = greater, s = smaller, r = remainder
    private long euclidean(int g, int s) {
        int r = g % s;
        return (r == 0) ? s : euclidean(s, r);
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int w = 8;
        int h = 12;
        long a = foo.solutionA(w, h);
        System.out.println(a);
    }
}
