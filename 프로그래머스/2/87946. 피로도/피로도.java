// 9:10 ~ 9:40
import java.util.*;

class Solution {
    
    static int[][] d;
    // static boolean[] visited;
    static ArrayList<Integer> list = new ArrayList<>();
    
    private static void dfs(boolean[] visited, int k, int cnt) {
        list.add(cnt);
        for (int i = 0; i < d.length; i++) {
            if (!visited[i] && k >= d[i][0]) {
                visited[i] = true;
                dfs(visited, k - d[i][1], cnt+1);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        this.d = dungeons;
        boolean[] visited = new boolean[d.length];
        
        for (int i = 0; i < d.length; i++) {
            if (k >= d[i][0]) {
                visited[i] = true;
                dfs(visited, k-d[i][1], 1);
                Arrays.fill(visited, false);
            }
        }
        return Collections.max(list);
    }
}