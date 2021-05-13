import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int solution(int[][] maps) {
        return bfs(maps);
    }

    public class Position {
        int x, y, depth;
        public Position(int x1, int y1, int depth1) {
            x = x1;
            y = y1;
            depth = depth1;
        }
    }

    public int bfs(int[][] maps) {

        int maxX = maps[0].length;
        int maxY = maps.length;

        Queue<Position> queue = new LinkedList<Position>();
        int[] directionX = {0, 0, -1, 1};
        int[] directionY = {-1, 1, 0, 0};

        // start position
        queue.add(new Position(0, 0, 1));
        maps[0][0] = 0;

        while (!queue.isEmpty()) {
            Position g = queue.poll();
            // Is goal ?
            if (g.x == (maxX-1) && g.y == (maxY-1)) {
                return g.depth;
            }
            // Is possible route ? ( Vector<Object> )
            for (int i = 0; i < directionY.length; i++) {
                int nextX = g.x + directionX[i];
                int nextY = g.y + directionY[i];
                if (nextX < 0 || nextX > maxX-1) continue;
                if (nextY < 0 || nextY > maxY-1) continue;
                if (maps[nextY][nextX] == 0) continue;

                queue.add(new Position(nextX, nextY, g.depth + 1));
                maps[nextY][nextX] = 0;
            }
        }

        return -1;
    }
}