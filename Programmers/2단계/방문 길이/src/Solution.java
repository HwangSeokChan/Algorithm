import java.util.*;

class Solution {

    private final int size = 5;

    public int solutionA(String dirs) throws Exception {
        int x = 0;
        int y = 0;
        HashSet<String> routes = new HashSet<String>();
        for (char cmd : dirs.toCharArray()) {
            int a = 0;
            int b = 0;
            switch (cmd) {
                case 'U': b += 1; break;
                case 'D': b -= 1; break;
                case 'R': a += 1; break;
                case 'L': a -= 1; break;
                default : 
                    throw new IllegalArgumentException("Bad Command");
            }

            // 제한구역 (5,5) 내에서의 움직임
            int cx = x + a;
            int cy = y + b;
            if (Math.abs(cx) > size || Math.abs(cy) > size) {
                continue;
            }

            // 중복되지 않는 길
            int sx = Math.min(x, cx); int ex = Math.max(x, cx);
            int sy = Math.max(y, cy); int ey = Math.max(y, cy);
            routes.add(sx+","+sy+"|"+ex+","+ey);
            
            x = cx;
            y = cy;
        }

        return routes.size();
    }

    public int solution(String dirs) throws Exception {

        int x = 0;
        int y = 0;
        int count = 0;

        boolean[][] h_route = new boolean[size * 2][size * 2 + 1];
        boolean[][] v_route = new boolean[size * 2 + 1][size * 2];

        for (char cmd : dirs.toCharArray()) {
            switch (cmd) {
                case 'U': 
                    if (y < size) { // 범위 확인
                        if (isFirst(v_route, x, y)) count++;
                        y ++;  // `+, -` 에 따라 count 및 좌표이동 순서로 홀수 루트 분기
                    }
                    break;
                case 'D': 
                    if (y > -size) {
                        y --;
                        if (isFirst(v_route, x, y)) count++;
                    }
                    break;
                case 'R': 
                    if (x < size) {
                        if (isFirst(h_route, x, y)) count++;
                        x ++;
                    }
                    break;
                case 'L': 
                    if (x > -size) {
                        x --;
                        if (isFirst(h_route, x, y)) count++;
                    }
                    break;
                default : 
                    throw new IllegalArgumentException("Bad Command");
            }
        }

        return count;
    }

    private boolean isFirst(boolean[][] route, int x, int y) {
        boolean isFirst = false;
        if (route[x + size][y + size] == false) {
            isFirst = true;
        }
        route[x + size][y + size] = true;
        
        return isFirst;
    }
}