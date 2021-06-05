import java.util.*;

class SolutionOld {

    private String[] board;
    private int rows;
    private int columns;
    private HashMap<Integer, TreeSet<Integer>> map;

    public SolutionOld () {
        map = new HashMap<Integer, TreeSet<Integer>>();
    }

    public int solution(int m, int n, String[] input) {

        board = input;
        rows = m-1;
        columns = n-1;

        boolean deleted;
        do {
            deleted = false;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    search(i, j);
                }
            }

            if (! map.isEmpty()) {
                deleted = true;
                markUp();
                fallDown();
            }
            
        } while (deleted);

        return count();
    }

    private boolean search(int row, int column) {

        char block = board[row].charAt(column);
        if (block == '-')
            return false;

        if ((board[row].charAt(column+1) == block)
            && (board[row+1].charAt(column) == block)
            && (board[row+1].charAt(column+1) == block)) {

                TreeSet<Integer> list = map.getOrDefault(column, new TreeSet<Integer>(Collections.reverseOrder()));
                list.add(row);
                map.put(column, list);
            return true;
        } else {
            return false;
        }

    }

    private void markUp() {

        for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
            int column = entry.getKey();
            TreeSet<Integer> rowSet = entry.getValue();
            Iterator<Integer> it = rowSet.iterator();

            while (it.hasNext()) {
                int row = it.next();
                StringBuilder a = new StringBuilder(board[row]);
                StringBuilder b = new StringBuilder(board[row+1]);
                board[row] = a.replace(column, column+2, "--").toString();
                board[row+1] = b.replace(column, column+2, "--").toString();

                it.remove();
            }
        }

        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            if (map.get(key).isEmpty()) {
                it.remove();
            }
        }
    }

    private void fallDown() {

        for (int j = 0; j <= columns; j++) {
            Queue<Character> queue = new LinkedList<Character>();
            for (int i = rows; i >= 0; i--) {
                if (board[i].charAt(j) != '-')
                    queue.add(board[i].charAt(j));
            }

            for (int i = rows; i >= 0; i--) {
                StringBuilder sb = new StringBuilder(board[i]);
                if (queue.isEmpty())
                    board[i] = sb.replace(j, j+1, "-").toString();
                else
                    board[i] = sb.replace(j, j+1, ""+queue.poll()).toString();
            }
        }
    }

    private int count() {

        int count = 0;
        for (String string : board) {
            for (char c : string.toCharArray()) {
                if (c == '-') {
                    count++;
                }
            }
        }

        return count;
    }
}