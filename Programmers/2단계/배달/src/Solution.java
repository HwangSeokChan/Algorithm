import java.util.*;

class Solution {

    private static final int FROM = 0;
    private static final int TO = 1;
    private static final int TIME = 2;
    private static final int NO_ROUTE = -1;

    public int solution(int N, int[][] road, int K) {

        int[][] route = route(road, N);
        int[] distance = route[0];
        boolean[] visited = new boolean[N];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            int bridge = choice(distance, visited, min);
            adjust(route, distance, N, bridge);
        }

        return count(distance, K);
    }

    private int[][] route(int[][] road, int N) {

        int[][] route = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(route[i], NO_ROUTE);
            route[i][i] = 0;
        }

        for (int[] r : road) {
            int from = r[FROM] - 1;
            int to   = r[TO] - 1;
            int time = r[TIME];
            if (route[from][to] == NO_ROUTE || route[from][to] > time) {
                route[from][to] = time;
            }
            
            if (route[to][from] == NO_ROUTE || route[to][from] > time) {
                route[to][from] = time;
            }
        }
        return route;
    }

    private int choice(int[] distance, boolean[] visited, int min) {

        int position = 0;
        for (int i = 1; i < visited.length; i++) {
            if (! visited[i] && distance[i] != NO_ROUTE && distance[i] <= min) {
                min = distance[i];
                position = i;
            }
        }

        visited[position] = true;

        return position;
    }

    private void adjust(int[][] route, int[] distance, int N, int bridge) {
        for (int i = 1; i < N; i++) {
            if (route[bridge][i] != NO_ROUTE) {
                int comparison = distance[bridge] + route[bridge][i];
                if (distance[i] == NO_ROUTE || distance[i] > comparison) {
                    distance[i] = comparison;
                }
            }
        }
    }

    private int count(int[] distance, int K) {
        int count = 0; // oneself

        for (int i : distance) {
            if (i <= K && i != NO_ROUTE) {
                count += 1;
            }
        }

        return count;
    }
}