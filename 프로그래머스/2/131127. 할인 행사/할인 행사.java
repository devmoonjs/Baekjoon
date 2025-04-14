/*
    1. window 자료구조 생성
    2. 처음부터 돌며 window 크기 10에 맞춰 새로운 map 에 적용.
    3. 마지막에 map 크기가 0 이라면 answer++;
*/
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> productMap = new HashMap<>();
        for (int i = 0;i < want.length; i++) {
            productMap.put(want[i], number[i]);
        }
        Map<String, Integer> windowMap = new HashMap<>();
        
        for (int i = 0; i <= discount.length - 10; i++) {
            windowMap = new HashMap<>();    
            windowMap.putAll(productMap);
            
            for (int j = i; j < i + 10; j++) {
                String key = discount[j];
                if (windowMap.containsKey(key)) {
                    if (windowMap.get(key) - 1  == 0) {
                        windowMap.remove(key);
                    } else {
                        windowMap.put(key, windowMap.get(key) - 1);
                    }
                }
            }
            if (windowMap.size() == 0) {
                answer++;
            }
        }
        return answer;
    }
}