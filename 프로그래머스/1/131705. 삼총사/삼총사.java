class Solution { 
    
    int cnt = 0;
    
    void dfs(int[] number, int start, int depth, int sum) { // 배열, 시작위치, 깊이, 누적합
        if (depth == 3) { // 깊이가 3일때, 누적합이 0이면 cnt++
            if (sum == 0) {
                cnt++;
            }
            return;
        }
        
        for (int i = start; i < number.length; i++) {
            dfs(number, i + 1, depth + 1, sum + number[i]);
        }
    }
    
    public int solution(int[] number) {
        dfs(number, 0, 0, 0);
        
        return cnt;
    }
}