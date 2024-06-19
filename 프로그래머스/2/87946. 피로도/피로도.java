import java.util.*;

class Solution {

    static int len;
    static int[][] d;
    static int max = 0;
    
    private static void dfs(int k, boolean[] visited, int cnt) {
        
        max = Math.max(max, cnt);
        
        for (int j = 0; j < len; j++) {
            if (!visited[j]) {
                if (k >= d[j][0]) {
                    visited[j] = true;
                    dfs(k - d[j][1], visited, cnt+1);
                    visited[j] = false;
                }
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        len = dungeons.length;
        this.d = dungeons;
        boolean visited[] = new boolean[len];
        
        
        for (int i = 0; i < len; i++) {
            if (k >= d[i][0]) {
                Arrays.fill(visited, false);
                visited[i] = true;
                dfs(k-d[i][1], visited, 1);
                // visited[i] = false;
            }
        }
        
        return max;
    }
}