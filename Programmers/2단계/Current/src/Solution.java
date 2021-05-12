import java.util.Arrays;
import java.util.TreeSet;

public class Solution {

    int[][] m;
    int maxX;
    int maxY;
    TreeSet<Integer> goal = new TreeSet<Integer>();

    public int solution(int[][] maps) {

        m = maps;
        maxX = maps[0].length;
        maxY = maps.length;
        boolean[][] visit = new boolean[maxX][maxY];

        // Start Point
        visit[0][0] = true;
        // Start DFS
        dfs(visit, 0, 0, 0);

        return goal.size() == 0 ? -1 : goal.first();
    }

    private void dfs(boolean[][] visit, int x, int y, int count) {

        int[] directionX = {0, 0, -1, 1};
        int[] directionY = {-1, 1, 0, 0};
        boolean[][] v = Arrays.copyOf(visit, visit.length);

        // Counting and next DFS
        count += 1;
        if ((x != maxX -1) || (y != maxY -1)) {
            for (int i = 0; i < directionX.length; i++) {
                int nX = x + directionX[i];
                int nY = y + directionY[i];
                // Out Of Index
                if ((nX < 0 || nX >= maxX) || (nY < 0 || nY >= maxY)) 
                    continue;
                // is Wall ?
                if (m[nY][nX] == 0)
                    continue;
                // is already visited?
                if (v[nY][nX]) 
                    continue;
                    
                v[nY][nX] = true;
                dfs(v, nX, nY, (count));
                v[nY][nX] = false;
            }
        } else {
            goal.add(count);
        }
    }
}