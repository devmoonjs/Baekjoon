import java.util.*;

class Solution {
    
    static int d;
    static boolean[] visited;
    static int[][] dungeons;
    static int max;
    
    private static void dfs(int k, int cnt) {
        max = Math.max(max, cnt);
        
        for (int i = 0; i < d; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(k - dungeons[i][1], cnt + 1);
                visited[i] = false;
            } 
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        d = dungeons.length;
        visited = new boolean[d];
        Solution.dungeons = dungeons;
        
        max = 0;
        
        for (int i = 0; i < d; i ++) {
            if (dungeons[i][0] <= k) {
                Arrays.fill(visited, false);
                visited[i] = true;
                dfs(k - dungeons[i][1], 1);
            }
        }
        
       return max;
    }
}

