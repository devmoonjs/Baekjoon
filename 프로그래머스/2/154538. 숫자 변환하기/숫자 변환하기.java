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