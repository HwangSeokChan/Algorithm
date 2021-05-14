class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] table = getTable(rows, columns);

        if (queries.length == 1) {
            answer[0] = getStartValue(table, queries[0]);
        } else {
            for (int i = 0; i < queries.length; i++) {
                answer[i] = rotation(table, queries[i]);
                // draw(table);
            }
        }
        return answer;
    }

    private int getStartValue(int[][] table, int[] query) {
        int x1 = query[0] - 1;
        int y1 = query[1] - 1;
        return table[x1][y1];
    }

    private int[][] getTable(int rows, int columns) {
        int count = 1;
        int[][] table = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                table[i][j] = count++;

        return table;
    }

    private int rotation(int[][] table, int[] query) {
        int x1 = query[0] - 1;
        int y1 = query[1] - 1;
        int x2 = query[2] - 1;
        int y2 = query[3] - 1;
        int tmp = table[x1][y2];
        int min = tmp;
        for (int j = y2; j > y1; j--) {
            min = Math.min(table[x1][j-1], min);
            table[x1][j] = table[x1][j-1];
        }
        
        for (int j = x1; j < x2; j++) {
            min = Math.min(table[j+1][y1], min);
            table[j][y1] = table[j+1][y1];
        }
        
        for (int j = y1; j < y2; j++) {
            min = Math.min(table[x2][j+1], min);
            table[x2][j] = table[x2][j+1];
        }
        
        for (int j = x2; j > x1 +1; j--) {
            min = Math.min(table[j-1][y2], min);
            table[j][y2] = table[j-1][y2];
        }

        table[x1+1][y2] = tmp;

        return min;
    }
    
    private void draw(int[][] table) {
        System.out.println("--------------------------");
        for (int a = 0; a < table.length; a++) {
            String s = "";
            for (int b = 0; b < table[0].length; b++) {
                s += table[a][b] + ", ";
            }
            System.out.println(s);
        }
    }
}