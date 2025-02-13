class Solution {
    public int solution(int[] nums) {
        int numsLen = nums.length;
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < numsLen - 2; i++) {
            for (int j = i+1; j < numsLen - 1; j++) {
                for (int k = j+1; k < numsLen; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }
        return answer;
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}