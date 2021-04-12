import java.util.*;

class Solution {
    public int solutionByStack(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int move : moves) {
            move--;
            for (int depth = 0; depth < board[move].length; depth++) {
                if (board[depth][move] != 0) {
                    if (stack.size() >= 1 && stack.peek() == board[depth][move]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[depth][move]);
                    }
                    board[depth][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public int solutionByList(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();

        for (int move : moves) {
            move--;
            for (int depth = 0; depth < board[move].length; depth++) {
                if (board[depth][move] != 0) {
                    int laskIdx = list.size()-1;
                    if (laskIdx > 0 && list.get(laskIdx) == board[depth][move]) {
                        list.remove(laskIdx);
                        answer += 2;
                    } else {
                        list.add(board[depth][move]);
                    }
                    board[depth][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int[][] boardA = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[][] boardB = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves =  {1,5,3,5,1,2,1,4};

        Solution s = new Solution();
        /* By Stack */
        int outA = s.solutionByStack(boardA, moves);
        System.out.println("Stack : " + outA);
        /* By List */
        int outB = s.solutionByList(boardB, moves);
        System.out.println("List : " + outB);
    }
}
