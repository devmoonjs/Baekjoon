class Solution {
    
    static boolean[] check;
    static int[][] arr;
    static int n;
    
    private static void dfs(int start) {
        check[start] = true;
        
        for (int i = 0 ; i < n; i++){
            if (arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        arr = new int[n][n];
        check = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if(i==j){
                    continue;
                }
                if (computers[i][j] == 1) {
                    arr[i][j] = arr[j][i] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i = 0 ; i < n; i++) {
            if (arr[i].length > 0 && !check[i]){
                dfs(i);
                cnt++;
                }
            }
        return cnt;
        }
    }