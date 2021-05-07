import java.util.*;

class Solution {

    public String[] solution(String[] record) {
        
        HashMap<String, String> users = new HashMap<String, String>();
        List<String> logs = new ArrayList<String>();
        
        for (String rec : record) {
            String[] info = rec.split("\\s");
            switch (info[0]) {
                case "Enter" : logs.add(info[1] + ":" + "님이 들어왔습니다.");
                case "Change": users.put(info[1], info[2]);
                    break;
                case "Leave" : logs.add(info[1] + ":" + "님이 나갔습니다.");
                    break;
            }
        }

        ListIterator<String> it = logs.listIterator();
        while (it.hasNext()) {
            String[] buf = it.next().split(":");
            it.set(users.get(buf[0]) + buf[1]);
        }

        return logs.toArray(String[]::new);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        String[] record = {
            "Enter uid1234 Muzi", 
            "Enter uid4567 Prodo",
            "Enter uiD4567 Prodo",
            "Change uid4567 Ryan",
            "Leave uid1234",
            "Enter uid1234 Prodo"
        };
        String [] s = foo.solution(record);
        for (String string : s) {
            System.out.println(string);
        }

    }
}
