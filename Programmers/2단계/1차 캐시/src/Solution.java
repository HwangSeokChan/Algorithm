import java.util.*;

class Solution {

    private final int HIT = 1;
    private final int MISS = 5;

    public int solution(int cacheSize, String[] cities) {

        if (cacheSize == 0) {
            return cities.length * MISS;
        }

        List<String> cache = new ArrayList<String>();

        int time = 0;
        for (String city : cities) {
                
            city = city.toLowerCase();

            if (cache.contains(city)) {
                time += HIT;
                cache.remove(city);
            } else {
                time += MISS;
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }
            }
            cache.add(city);
        }

        return time;
    }
}