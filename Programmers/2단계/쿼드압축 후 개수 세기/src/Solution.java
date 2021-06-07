class Solution {

    private int[][] arr;
    public int[] solution(int[][] input) {

        arr = input;

        return summerize(0, arr[0].length, 0, arr.length);
    }

    private int[] summerize(int x1, int x2, int y1, int y2) {

        int data0 = 0;
        int data1 = 0;
        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                switch (arr[i][j]) {
                    case 0: data0 += 1; break;
                    case 1: data1 += 1; break;
                }
            }
        }

        if (data0 == 0) {
            return new int[] { 0, 1 };
        } else if (data1 == 0) {
            return new int[] { 1, 0 };
        } else {
            int xa = (int) Math.abs(x2 + x1)/2;
            int yb = (int) Math.abs(y2 + y1)/2;
            if (xa > 1) {
                int[] a = summerize(x1, xa, y1, yb);
                int[] b = summerize(x1, xa, yb, y2);
                int[] c = summerize(xa, x2, y1, yb);
                int[] d = summerize(xa, x2, yb, y2);

                return new int[] { (a[0] + b[0] + c[0] + d[0]), (a[1] + b[1] + c[1] + d[1]) };
            } else {
                return new int[] { data0, data1 };
            }
        }
    }
}