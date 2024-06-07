/*
* 1. dfs(인덱스, 누적합계);
*/
import java.util.*;

class Solution {
    
    static int target;
    static int len;
    static int answer;
    static int[] numbers;
    
    private static void dfs(int index, int sum) {
        
        if (index == len) {
            if (sum == target) {
                answer++;
            }
        }
        
        if (index < len) {
            dfs(index + 1, sum + numbers[index]);
            dfs(index + 1, sum - numbers[index]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        
        answer = 0;
        this.numbers = numbers;
        this.target = target;
        this.len = numbers.length;
        
        dfs(0,0);
        
        return answer;
    }
}