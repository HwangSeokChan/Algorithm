import java.util.*;

class Solution {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private List<String> dict = new ArrayList<String>(Arrays.asList(alphabet.split("")));
    private List<Integer> pressed = new ArrayList<Integer>();

    public int[] solution(String msg) {

        compress(msg);

        return pressed.stream().mapToInt(Integer::intValue).toArray();
    }

    private void compress(String msg) {

        int index = -1;
        String target = "";
        int length = 0;
        while (length < msg.length()) {
            target = msg.substring(0, length+1);
            if (dict.contains(target)) {
                index = dict.indexOf(target) + 1;
                length ++;
            } else {
                break;
            }
        }
        
        dict.add(target);
        pressed.add(index);
        
        String next = msg.substring(length);
        if (next.length() != 0) {
            compress(next);
        }
    }
}