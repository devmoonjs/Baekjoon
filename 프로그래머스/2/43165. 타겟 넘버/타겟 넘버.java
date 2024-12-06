class Solution {
    
    static int[] numbers;
    static int target;
    static int len;
    static int answer;
    
    static void dfs(int index, int sum) {
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
        this.numbers = numbers;
        this.target = target;
        this.len = numbers.length;
        
        dfs(0,0);
        
        return answer;
    }
}