import java.util.*;

class Solution {
    public int[] solutionA(int n, String[] words) {
        int[] answer = {0, 0};

        Stack<String> stack = new Stack<String>();
        for (String word : words) {
            if (! stack.empty()) {
                String before = stack.peek();
                if (stack.contains(word) || before.charAt(before.length()-1) != word.charAt(0)) {
                    answer[0] = stack.size() % n + 1;
                    answer[1] = stack.size() / n + 1;
                    break;
                }
            }
            
            stack.push(word);
        }

        return answer;
    }


    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashSet<String> set = new HashSet<String>();

        set.add(words[0]);
        char check = words[0].charAt(words[0].length()-1);

        for (int i = 1; i < words.length; i++) {
            if ((set.add(words[i])) && (check == words[i].charAt(0))) {
                check = words[i].charAt(words[i].length()-1);
            } else {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}