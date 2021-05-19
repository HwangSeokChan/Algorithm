import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {

        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set, phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = phone_book[i].length()-1 ; j > 0; j--) {
                if (set.contains(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean solutionB(String[] phone_book) {

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}