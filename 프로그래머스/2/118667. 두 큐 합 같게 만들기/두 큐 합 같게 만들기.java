import java.util.*;

/*
* q1 과 q2 의 합을 구하여 큰 쪽에서 원소를 빼 작은 쪽에 더하는 방식
*/

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        
        int answer = -1;
        
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        for(int t : queue1){
            q1.add(t);
            sum1 += t;
        }
        
        for(int t : queue2){
            q2.add(t);
            sum2 += t;
        }

        int cnt = 0;
        
        while(cnt <= queue1.length * 4){
            if(sum1 > sum2){
                int poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.add(poll);
                
            } else if(sum1 < sum2){
                int poll = q2.poll();
                sum2 -= poll;
                sum1 += poll;
                q1.add(poll);
                
            } else if(sum1 == sum2){
                answer = cnt;
                break;
            }
            cnt++;
        }
        return answer;
    }
}