class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[n][m]; // 격자 배열 초기화
        int[] dx = {1,0}; 
        int[] dy = {0,1};
        
        int z = 1_000_000_007;
        
        // 웅덩이 체크
        for (int[] puddle : puddles) {
            arr[puddle[1]-1][puddle[0]-1] = -1;
        }
        
        // 시작 위치
        arr[0][0] = 1;
        
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    continue;
                }
                
                for (int k = 0; k < 2; k++) { // 오른쪽과 아래로만 이동
                    int newX = i + dx[k];
                    int newY = j + dy[k];
                    
                    if (newX < n && newY < m && arr[newX][newY] != -1) { 
                        arr[newX][newY] = (arr[newX][newY] + arr[i][j]) % z;
                    }
                }
            }
        }
        return arr[n-1][m-1];
    }
}