class Solution {
    
    static boolean[] visited;
    static int[][] computers;
    static int n;
    
    private static void dfs(int index) { // index -> 노드 번호, 각 노드마다 자식 노드를 체크
        visited[index] = true;
        
        for (int i = 0 ; i < n; i++) {
            if (computers[index][i] != 0 && !visited[i]) {
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        this.n = n;
        visited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
}