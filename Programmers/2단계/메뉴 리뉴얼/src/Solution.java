import java.util.*;
import java.util.Map.Entry;

class Solution {
    
    Map<Integer, Map<String, Integer>> menu;
    List<String> recommand = new ArrayList<String>();

    public Solution () {
        menu = new HashMap<Integer, Map<String, Integer>>();
    }

    public String[] solution(String[] orders, int[] course) {

        // 메뉴조건( 갯수 )별 주문에서 추출된 코스 선호도 저장
        for (int plus : course) {
            menu.put(plus, new HashMap<String, Integer>());
            for (String order : orders) {
                combination(order, 0, "", plus);
            }
        }

        // 메뉴조건( 갯수 )별 최다 선호도 코스 선별
        for (Entry<Integer, Map<String, Integer>> me : menu.entrySet()) {
            Map<String, Integer> count = me.getValue();
            Iterator<Entry<String, Integer>> it = count.entrySet().iterator();
            if (!count.isEmpty()) {
                int max = Collections.max(count.values());
                if (max > 1) {
                    while (it.hasNext()) {
                        if (max > it.next().getValue()) {
                            it.remove();
                        }
                    }
                    for (String key : count.keySet()) {
                        recommand.add(key);
                    }
                }
            }
        }

        // 메뉴정렬 (A-Z 오름차순)
        Collections.sort(recommand);
        
        return recommand.toArray(String[]::new);
    }

    private void combination(String order, int str, String combo, int plus) {

        if (plus > order.length()) return;

        if (plus == 0) {
            Map<String, Integer> count = menu.get(combo.length());
            // 메뉴순서 고정 (순열 제외)
            char[] c = combo.toCharArray();
            Arrays.sort(c);
            combo = String.valueOf(c);
            count.put(combo, count.getOrDefault(combo, 0) + 1);
        } else {
            for (int i = str; i < order.length(); i++) {
                if (combo.indexOf(order.charAt(i)) < 0) {
                    combination(order, (i + 1), (combo + order.charAt(i)), (plus - 1));
                }
            }
        }
    }
}