class Solution {
    public long solution(int a, int b) {
        
        int x = Math.min(a,b);
        int y = Math.max(a,b);
        
        long sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}