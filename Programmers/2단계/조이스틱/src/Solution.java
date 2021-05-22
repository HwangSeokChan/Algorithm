import java.util.*;

class Solution {
    
    public int solutionA(String name) {
        int answer = 0;
        
        char[] c = name.toCharArray();
        int max = c.length - 1;
        int min = max;
        int rightMove;
        int backwards;
        for (int i = 0; i < c.length; i++) {
            answer += Math.min(('Z' - c[i] + 1), (c[i] - 'A'));
            rightMove = backwards = i;
            int next = (i + 1);
            while (next < c.length && c[next] == 'A') {
                next += 1;
            }

            int opposite = max - next + 1;
            min = Math.min( min, (rightMove + opposite) + Math.min(backwards, opposite));
            // min = Math.min( min, (rightMove + opposite + backwards));
        }
        return answer + min;
    }

    public int solution(String name) {
        int move = cursorMove(name);
        for (char c : name.toCharArray()) {
            move += countUpDown(c);
        }
        return move;
    }

    /**
     * 
        1. Count of Alphabet is 26
        2. 13`st is M
        3. left move = ('Z' - next + 1)
        3. right move = (next - cursor)
     * @param cursor
     * @param next
     * @return move
     */
    private int countUpDown(char next) {
        return (next > 'M') ? ('Z' - next + 1) : (next - 'A');
    }


    /**
     * 
     * @param name
     * @return
     */
    private int cursorMove(String name) {

        List<Integer> list = getCostList(name);
        int loop = countTarget(name);

        return recursive(list, loop, 0, 'L');
    }

    private int countTarget(String name) {
        char[] c = name.toCharArray();

        int count = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i] != 'A') {
                count += 1;
            }
        }
        return count;
    }

    private List<Integer> getCostList(String name) {
        char[] c = name.toCharArray();

        List<Integer> list = new ArrayList<Integer>();

        int diff = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i] != 'A') {
                list.add(diff + 1);
                diff = 0;
            } else {
                diff += 1;
            }
        }
        list.add(diff + 1);

        return list;
    }

    private int recursive(List<Integer> list, int loop, int stack, char before) {

        if (loop > 0 && !list.isEmpty()) {
            loop -= 1;

            int left = (before == 'L') ? list.get(0) : list.get(0) + stack;
            int right = (before == 'R') ? list.get(list.size()-1) : list.get(list.size()-1) + stack;
            
            stack += Math.min(
                recursive(new ArrayList<Integer>(list.subList(1, list.size())), loop, left, 'L'),
                recursive(new ArrayList<Integer>(list.subList(0, list.size()-1)), loop, right, 'R')
            );
            
        }
        return stack;
    }
}