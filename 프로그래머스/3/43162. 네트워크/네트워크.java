class Solution {
    
    static boolean[] visited;
    static int n;
    static int[][] computers;
    
    private static void dfs(int index) {
        visited[index] = true;
        
        for (int i = 0; i < n; i++ ) {
            if (computers[index][i] != 0 & !visited[i]) {
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
}