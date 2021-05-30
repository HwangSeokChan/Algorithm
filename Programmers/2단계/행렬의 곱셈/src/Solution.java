class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int vertical = arr1.length;
        int connection = arr1[0].length;
        int horizontal = arr2[0].length;
        int[][] answer = new int[vertical][horizontal];

        for (int v = 0; v < vertical; v++) {
            for (int h = 0; h < horizontal; h++) {
                int sum = 0;
                for (int c = 0; c < connection; c++) {
                    sum += arr1[v][c] * arr2[c][h];
                }
                answer[v][h] = sum;
            }
        }

        return answer;
    }
}