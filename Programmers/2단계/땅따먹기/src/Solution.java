class Solution {

    private final int COLUMN = 4;
    private int rows;

    int solution(int[][] land) {

        rows = land.length;

        return bottom_up(land);
    }

    private int bottom_up(int[][] land) {
        int max = 0;

        if (rows == 0) {
            for (int n : land[0]) {
                max = Math.max(max, n);
            }
        } else {
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < COLUMN; j++) {
                    land[i][j] += before(land[i-1], j);
                }
            }
        }

        for (int n : land[rows-1]) {
            max = Math.max(max, n);
        }

        return max;
    }

    private int before(int[] row, int column) {
        int r = 0;
        for (int i = 0; i < COLUMN; i++) {
            if (column == i) {
                continue;
            }
            r = Math.max(r, row[i]);
        }
        return r;
    }

    // private int maximum = 0;
    // private void search(int[][] land) {
    //     for (int i = 0; i < COLUMN; i++) {
    //         recursive(land, 1, i, land[0][i]);
    //     }

    //     return maximum;
    // }

    // private void recursive(int[][] land, int row, int before, int sum) {

    //     if (row == this.rows) {
    //         System.out.println(sum);
    //         maximum = Math.max(maximum, sum);
    //     } else {
    //         for (int c = 0; c < COLUMN; c++) {
    //             if (c != before) 
    //             recursive(land, row + 1, c, sum + land[row][c]);
    //         }
    //     }
    // }
}