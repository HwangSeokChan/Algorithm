import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

class Solution {

    public String solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for (int number : numbers) list.add(number);

        Collections.sort(list, (a, b) -> {
            String ab = String.valueOf(a) + String.valueOf(b);
            String ba = String.valueOf(b) + String.valueOf(a);
            return (-1) * Integer.compare(Integer.parseInt(ab), Integer.parseInt(ba));
        });
        
        ListIterator<Integer> it = list.listIterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        
        return (sb.toString().charAt(0) != '0') ? sb.toString() : "0";
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] numbers = {6, 10, 2};
        // int[] numbers = {0, 0};
        
        String a = foo.solution(numbers);
        System.out.println(a);

    }
}
