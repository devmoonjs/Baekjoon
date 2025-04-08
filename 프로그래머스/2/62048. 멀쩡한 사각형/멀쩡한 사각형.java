class Solution {
    public long solution(int w, int h) {
        long W = (long)w;
        long H = (long)h;
        long answer = 0;
        
        for (int i = 1; i < w; i++) {
            answer += H * i / W;
        }
        
        return answer * 2;
    }
}