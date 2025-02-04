class Solution {
    
    private static int[][] computers;
    private static boolean[] visited;
    
    private static void dfs(int index) {
        visited[index] = true;
        
        for (int i = 0; i < computers[index].length; i++) {
            if (computers[index][i] == 1 && !visited[i]) dfs(i);
        }
    }
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        this.visited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
}