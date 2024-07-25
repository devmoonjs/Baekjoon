// 9:37 ~ 9 : 50
// 방문 배열 생성 boolean[] visited = new boolean[numbers.length];
// numbers 모두 돌면서 visited[numbers[i]] = true;
// visited 배열 순회하며 false 이면 sum 누적합.

class Solution {
    public int solution(int[] numbers) {
        int size = 10;
        int answer = 0;
        
        boolean[] visited = new boolean[size];
        
        for (int n : numbers) {
            if (!visited[n]) visited[n] = true;
        }
        
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) answer += i;
        }
        
        return answer;
    }
}