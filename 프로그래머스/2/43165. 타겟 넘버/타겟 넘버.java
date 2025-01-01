/*
*   1. dfs
    2. dfs(배열, 인덱스, 합) {
        if (인덱스 == 마지막) {
            if (합 == target) {
                count++;
            } else {
                break;
            }
        }
        dfs(numbers, i+1, 합+numbers[i+1]);
        dfs(numbers, i+1, 합-numbers[i+1]);
    }
*/

class Solution {
    
    static int[] numbers;
    static int target;
    static int cnt = 0;
    
    public static void dfs(int[] numbers, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }
        dfs(numbers, index + 1, sum + numbers[index]);
        dfs(numbers, index + 1, sum - numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(numbers, 0, 0);
        
        return cnt;
    }
}