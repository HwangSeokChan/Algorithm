class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        int size = 0;
        boolean[][] visit = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j] == false && picture[i][j]!=0) {
                    numberOfArea++;
                    size = dfs(i, j, m, n, picture, visit);
                    if (maxSizeOfOneArea < size) {
                        maxSizeOfOneArea = size;
                    }
                }
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int dfs(int xPoint, int yPoint, int m, int n, int[][] picture, boolean[][] visit) {
        int color = picture[xPoint][yPoint];
        int[][] vector = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        int x, y, size = 1;
        visit[xPoint][yPoint] = true;

        for (int i = 0; i < vector.length; i++) {
            x = xPoint + vector[i][0];
            y = yPoint + vector[i][1];
            if (x<0 || x>=m || y<0 || y>=n) continue;
            if (visit[x][y] == false && color == picture[x][y]) {
                size += dfs(x, y, m, n, picture, visit);
            }
        }
        return size;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int m=6, n=4;

        int[][] picture = {{1, 1, 1, 0},
                           {1, 2, 1, 0},
                           {1, 1, 0, 1},
                           {0, 0, 0, 1},
                           {0, 0, 0, 3},
                           {0, 0, 0, 3}};
        foo.solution(m, n, picture);
    }
}

