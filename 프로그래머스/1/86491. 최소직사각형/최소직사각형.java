class Solution {
    public int solution(int[][] sizes) {
        int aMax = 0;
        int bMax = 0;
        
        for (int[] s : sizes) {
            int a = Math.max(s[0],s[1]);
            int b = Math.min(s[0],s[1]);
            
            if (a > aMax) aMax = a;
            if (b > bMax) bMax = b;
        }
        
        return aMax * bMax;
    }
}