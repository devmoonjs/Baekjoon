class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = -1;
        
        int startTime = toSec(h1, m1, s1);
        int endTime = toSec(h2, m2, s2);
        
        answer = countAlrams(endTime) - countAlrams(startTime); // 초로 환산하여 계산
        answer += alrmNow(startTime) ? 1 : 0; // 시작시간 자체가 겹친다면 +1
        
        return answer;
    }
    
    private static int toSec(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }
    
    private int countAlrams(int seconds) {
        int minuteCnt = seconds * 59 / 3600;
        int hourCnt = seconds * 719 / 43200;
        
        int duplicateCnt = 43200 <= seconds ? 2 : 1; // 총 시간이 12시간이 넘는지 기준
        
        return minuteCnt + hourCnt - duplicateCnt;
    }
    
    private boolean alrmNow(int seconds) {
        return seconds * 59 / 3600 == 0 || seconds * 719 % 43200 == 0;
    }
}