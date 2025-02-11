// 16:22
class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        long W = (long)w;
        long H = (long)h;
        
        for (long i = 1; i < W; i++) {
            answer += H*i / W;    
        }
        
        return answer * 2;
    }
}