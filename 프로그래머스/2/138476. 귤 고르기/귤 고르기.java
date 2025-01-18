/*
    20:33
    귤을 크기별로 분류했을 때, 서로 다른 종류의 수를 최소화.
    
*/
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> counts = new ArrayList<>(map.values());
        Collections.sort(counts, Collections.reverseOrder());
        
        int selectedKinds = 0;
        int total = 0;
        
        for (int count : counts) {
            total += count;
            selectedKinds++;
            
            if (total >= k) break;
        }
        
        return selectedKinds;
    }
}