/*
    static int cnt = 0;
    static int target;

    dfs(int index, int sum) {
        if (sum == targer) cnt++;
        if (index == 6) break;
        
        dfs(index + 1, sum - numbers[index]);
        dfs(index + 1, sum + numbers[index]);
    }
*/

class Solution {
    
    static int cnt = 0;
    static int target;
    static int[] numbers;
    
    private static void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }
        
        dfs(index + 1, sum - numbers[index]);
        dfs(index + 1, sum + numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        dfs(0,0);
        return cnt;
    }
}