class Solution {
    
    static boolean[] visited;
    static int[][] computers;
    
    static void dfs(int index) {
        visited[index] = true;
        
        for (int i = 0; i < computers[index].length; i++) {
            if (computers[index][i] == 1 && !visited[i])
            dfs(i);
        }
    }
    
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        visited = new boolean[n];
        
        int cnt = 0;
        
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
        return cnt;
    }
}