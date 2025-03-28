import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        
        int count = 0;
        
        List<String> caches = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            // cash miss
            if (!caches.contains(city)) {
                count += 5;
                if (caches.size() >= cacheSize) {
                    caches.remove(0);
                }
                caches.add(city);
                continue;
            }
            
            // cache hit
            if (caches.contains(city)) {
                caches.remove(city);
                caches.add(city);
                count += 1;
            }
        }
        return count;
    }
}