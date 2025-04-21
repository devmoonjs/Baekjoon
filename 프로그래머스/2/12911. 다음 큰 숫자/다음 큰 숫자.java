class Solution {
    static int i = 0;
    public int solution(int n) {
        int answer = 0;
        int aBit = Integer.bitCount(n);
        
        for (i = n + 1; i <= 1000000; i++) {
            int tempBit = Integer.bitCount(i);
            
            if (aBit == tempBit) {
                answer = i; 
                break;
            }
        }
        return i;
    }
}