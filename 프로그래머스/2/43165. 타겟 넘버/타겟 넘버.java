class Solution {
    
    static int answer = 0;
    static int len;
    static int[] numbers;
    static int target;
    
    private static void dfs(int index, int sum) {
        
        if (index == len) {
            if (sum == target) {
                answer++;
            }
        }
        
        if (index < len) {
            dfs(index+1, sum + numbers[index]);
            dfs(index+1, sum - numbers[index]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
        this.len = numbers.length;
        
        dfs(0,0);
        
        return answer;
    }
}