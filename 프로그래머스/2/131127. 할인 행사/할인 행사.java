/*
    10일동안 회원 자격
    매일 한 가지 제품을 할인 - 하루 하나씩만 구매 가능
    원하는 제품과 수량이 할인하는 날짜와 10일 연속 일치할 경우 - 회원가입
    
    뒤에서 부터 돌면서, 카운트하고, 최소 값의 index 구하면 되지 않나
*/
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        Map<String, Integer> window = new HashMap<>();
        int cnt = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            window = new HashMap<>();
            window.putAll(map);
            
            for (int j = i; j < i + 10; j++) {
                String key = discount[j];
                if (window.containsKey(key)) {
                    if (window.get(key) - 1 == 0) {
                        window.remove(key);
                    } else {
                        window.put(key, window.get(key) - 1);
                    }
                }
            }
            if (window.size() == 0) cnt++;
        }
        return cnt;
    }
}