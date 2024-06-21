// q 가 비어 있으면 값 추가
// q 가 비어 있지 않다면 -> 앞에 값 꺼내서 비교
// 비교해서 값이 같다면 pass
// 비교해서 값이 틀리다면 add

import java.util.*;

public class Solution {
    
    static int pre = 0; 
    
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int a : arr) {
            if (q.isEmpty()) {
                q.add(a);
                pre  = a;
            } else {
                if (pre != a) {
                    q.add(a);
                    pre = a;
                }
            }
        }
        
        int[] answer = new int[q.size()];
        int cnt = 0;
        
        while(!q.isEmpty()) {
            answer[cnt++] = q.poll();
        }
        return answer;
    }
}