import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {

        int twice = 0;
        Arrays.sort(people);
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = people.length-1; i >= 0; i--) {
            if (! stack.isEmpty() && stack.peek() >= people[i]) {
                stack.pop();
                twice ++;
            } else {
                stack.add(limit - people[i]);
            }
        }

        return people.length - twice;
    }
}