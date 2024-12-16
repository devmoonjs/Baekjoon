class Solution {
    
    static int[] numbers;
    static int cnt = 0;
    static int target;
    
    static void comb(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                cnt++;
            }
            return;
        }
        
        if (index < numbers.length) {
            comb(index+1, sum + numbers[index]);
            comb(index+1, sum - numbers[index]);
        }
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        comb(0,0);
        
        return cnt;
    }
}