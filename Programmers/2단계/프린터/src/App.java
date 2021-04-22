import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solutionA(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i : priorities) queue.add(i);

        boolean printed;
        int count=0;
        while (!queue.isEmpty()) {
            printed = true;
            location--;
            Integer peek = queue.poll();
            Iterator<Integer> it = queue.iterator();
            while (it.hasNext()) {
                if (peek < it.next()) {
                    printed = false;
                    queue.add(peek);
                    if (location<0) {
                        location = queue.size()-1;
                    }
                    break;
                }
            }
            
            if (printed) {
                count++;
                if (location<0) {
                    break;
                }
            }
        }
        return count;
    }

    
    public int solutionB(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

        while(!que.isEmpty()){
            Integer peek = que.poll();
            location--;
            if(peek == priorities[size - answer]){
                answer++;
                if(location <0)
                    break;
            }else{
                que.add(peek);
                if(location<0)
                    location=que.size()-1;
            }
        }

        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        // int[] priorities = {4, 1, 3, 2};
        // int location = 2;
        System.out.println(foo.solutionA(priorities, location));
        System.out.println(foo.solutionB(priorities, location));
    }
}
