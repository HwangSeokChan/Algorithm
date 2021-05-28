import java.util.*;
class Solution {
    public String solution(String s) {

        TreeSet<Integer> set = new TreeSet<Integer>();
        for (String string : s.split(" ")) {
            set.add(Integer.parseInt(string));
        }

        return set.first() + " " + set.last();
    }
}