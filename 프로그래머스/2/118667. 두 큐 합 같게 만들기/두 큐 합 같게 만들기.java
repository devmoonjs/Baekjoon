import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -1;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        for (int a : queue1) {
            q1.add(a);
            sum1 += a;
        }
        
        long sum2 = 0;
        for (int b : queue2) {
            q2.add(b);
            sum2 += b;
        }
        
        int cnt = 0;
        while (cnt <= queue1.length * 4) {
            if (sum1 > sum2) {
                int temp = q1.poll();
                sum1 -= temp;
                sum2 += temp;
                q2.add(temp);
                
            } else if (sum1 < sum2) {
                int temp = q2.poll();
                sum1 += temp;
                sum2 -= temp;
                q1.add(temp);
                
            } else if (sum1 == sum2) {
                answer = cnt;
                break;
            }
            
            cnt++;
        }

        return answer;
    }
}