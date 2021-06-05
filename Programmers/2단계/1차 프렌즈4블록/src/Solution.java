import java.util.*;

class Solution {

    private char[][] board;
    private int rows;
    private int columns;
    private final char EMPTY = '-';

    public int solution(int m, int n, String[] input) {

        board = new char[m][];
        rows = m-1;
        columns = n-1;

        // init
        for (int i = 0; i < input.length; i++) {
            board[i] = input[i].toCharArray();
        }

        boolean[][] mark;
        do {
            // markup
            mark = new boolean[m][n];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    markup(i, j, mark);
                }
            }
            // fallDown & is Deleted ? 
        } while (fallDown(mark));

        return count();
    }

    private void markup(int row, int column, boolean[][] mark) {

        char block = board[row][column];
        if (block == EMPTY) 
            return;

        if ((board[row][column+1] == block)
            && (board[row+1][column] == block)
            && (board[row+1][column+1] == block)) {

                mark[row][column] = true;
                mark[row][column+1] = true;
                mark[row+1][column] = true;
                mark[row+1][column+1] = true;
        }
    }

    private boolean fallDown(boolean[][] mark) {

        boolean moved = false;
        for (int j = 0; j <= columns; j++) {
            Queue<Character> queue = new LinkedList<Character>();
            for (int i = rows; i >= 0; i--) {
                if (! mark[i][j]) {
                    queue.add(board[i][j]);  
                } else {
                    moved = true;
                }
            }
            for (int i = rows; i >= 0; i--) {
                board[i][j] = (queue.isEmpty()) ? EMPTY : queue.poll();
            }
        }
        return moved;
    }

    private int count() {
        int count = 0;
        for (char[] ca : board) {
            for (char c : ca) {
                if (c == EMPTY) {
                    count++;
                }
            }
        }
        return count;
    }
}