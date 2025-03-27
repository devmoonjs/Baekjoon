/*
    19:46
    스코빌 지수 K 이상으로 만들기
    - 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
    - 모든 음식이 K 이상이 될 때까지 반복
    - 섞어야 하는 최소 횟수 return
    0. 정렬, if (scoville[0] >= k) break;
    1. 정렬하고, 제일 작은 것 int a = scoville[0]; 그 다음 int b = scoville[1];
    2. scoville[0] = a + b * b
    합치고 두번째껀 지워짐.
    힙? => 
*/
import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.add(s);
        }
        
        while (pq.size() > 1 && pq.peek() < K) { 
            int first = pq.poll();
            int second = pq.poll();
            int mixed = first + second * 2;
            pq.add(mixed);
            answer++;
        }
        
        if (pq.peek() < K) return -1;
        
        return answer;
    }
}