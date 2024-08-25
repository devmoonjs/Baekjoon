/*
    BFS 탐색 활용 - 최소 연산 횟수 (최단 경로)
    
    1. 방문 배열을 통해 중복 연산 방지
    
    2. x 를 시작으로 
        
        2.1 더하기 n
        2.2 곱하기 2
        2.3 곱하기 3
        
        의 경우를 전부 한 번씩 수행하며 값을 Q 에 삽입.
        cnt++;
    
    3. Q 값을 뽑아 다시 2번 연산 수행
    4. 수행 중 뽑은 값이 원하는 y 의 값이 될 경우 cnt 리턴
        

*/

import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[1000001];
        
        q.add(x);
        visited[x] = true;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0 ; i < size; i++) {
                int temp = q.poll();
                if (temp == y) {
                    return cnt;
                }
                
                if (temp + n <= y && !visited[temp+n]) {
                    q.add(temp + n);
                    visited[temp + n] = true;
                }
                
                if (temp * 2 <= y && !visited[temp*2]) {
                    q.add(temp * 2);
                    visited[temp * 2] = true;
                }
                
                if (temp * 3 <= y && !visited[temp*3]) {
                    q.add(temp * 3);
                    visited[temp * 3] = true;
                }
                
            }
            cnt++;
        }
        return -1;
    }
}