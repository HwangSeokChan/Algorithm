class Solution
{

    private int [][]board;
    private int vertical;
    private int horizontal;

    public int solution(int [][]board)
    {
        this.board = board;
        this.vertical = board.length;
        this.horizontal = board[0].length;

        return bottom_up();
    }

    private int bottom_up() {

        if (this.vertical == 1 || this.horizontal == 1) {
            for (int[] is : this.board)
                for (int i : is)
                    if (i == 1)
                        return 1;
            return 0;
        }

        int max = max4(this.board[0][0], this.board[0][1], this.board[1][0], this.board[1][1]);
        for (int v = 1; v < this.vertical; v++) {
            for (int h = 1; h < this.horizontal; h++) {
                if (this.board[v][h] == 1) {
                    int cross = this.board[v-1][h-1];
                    int left  = this.board[v][h-1];
                    int top   = this.board[v-1][h];
                    this.board[v][h] = min3(cross, left, top) + 1;
                    max = Math.max(this.board[v][h], max);
                }
            }
        }
        return max * max;
    }

    private int min3(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    private int max4(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    private int search() {
        int max = 0;
        for (int v = 0; v < this.vertical; v++) {
            for (int h = 0; h < this.horizontal; h++) {
                if ((this.vertical - v + 1) > max && (this.horizontal - h + 1) > max) {
                    max = Math.max(max, dfs(v, h, 1));
                }
            }
        }
        return max * max;
    }

    private int dfs(int v, int h, int length) {

        int before = (length-1);

        if ((v+length-1 >= this.vertical) || (h+length-1 >= this.horizontal)) {
            return before;
        }

        for (int i = 0; i < length; i++) {
            if ((this.board[v+i][h+(length-1)] != 1) || (this.board[v+(length-1)][h+i] != 1)) {
                return before;
            }
        }

        return dfs(v, h, length + 1);
    }

}