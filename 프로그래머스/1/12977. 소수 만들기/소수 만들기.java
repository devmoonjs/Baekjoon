class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numsLen = nums.length;
        int sum = 0;
        
        for (int i = 0; i < numsLen - 2; i++) {
            for (int j = i+1; j < numsLen - 1; j++) {
                for (int k = j+1; k < numsLen; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    private static boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        
        return true;
    }
}