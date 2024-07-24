// divisor 로 나누어 떨어지면 return 
// 아무것도 없다면 '-1' 출력

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }
        
        if (list.size() == 0) {
            int[] bad = {-1};
            return bad;
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}