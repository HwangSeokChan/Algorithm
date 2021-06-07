import java.util.*;

class Solution {

    private HashSet<Integer> keys = new HashSet<Integer>();
    
    public int solution(String[][] relation) {

        int columns = relation[0].length;
        for (int key = 0b00000001; key <= Math.pow(2, columns)-1; key++) {
            if (isUnique(relation, key) && isMinimal(key)) {
                keys.add(key);
            }
        }

        return keys.size();
    }

    private boolean isUnique(String[][] relation, int key) {

        HashSet<String> tuple = new HashSet<String>();
        int rows = relation.length;
        int columns = relation[0].length;

        for (int i = 0; i < rows; i++) {
            String row = "";
            for (int j = 0; j < columns; j++) {
                int mask = (1 << j);
                if ((key & mask) != 0) {
                    row += relation[i][j];
                }
            }
            if (! tuple.add(row)) {
                return false;
            }
        }
        
        return true;
    }

    private boolean isMinimal(int key) {

        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            int stored = it.next();
            if ((key & stored) == stored) {
                return false;
            }
        }

        return true;
    } 
}