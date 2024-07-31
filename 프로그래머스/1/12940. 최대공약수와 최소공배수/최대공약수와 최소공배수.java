// a % b 가. 나누어 떨어질 때 그 값이 최대 공약수
// a * b / 최대공약수 -> 최소공배수

import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        
        int r = 0;
        while(b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        answer[0] = a;
        
        answer[1] = n * m / a;
        
        return answer;
        
    }
}