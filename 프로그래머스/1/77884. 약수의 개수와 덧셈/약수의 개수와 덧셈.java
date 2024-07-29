// 제곱근으로 나누어 0이 되는 수를 찾는다.
// 해당 숫자로 나누어 구한다.
import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int a = 0;
        int b = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = left; i <= right; i++) { // 범위 내 모든 수 반복
            int cnt = 0;
            for (int j = 1; j <= i; j++) { // 한 숫자에 대해 약수 구하기
                if (i % j == 0) {
                    cnt++;
                }
            }
            map.put(i,cnt);
        }
        Iterator<Integer> iter = map.keySet().iterator();
        
        int answer = 0;
        
        while(iter.hasNext()) {
            int key = iter.next();
            int value = map.get(key); // key에 대한 value 값 가져오기
            if (value % 2 == 0) answer += key;
            else answer -= key;
        }
        return answer;
    }
}