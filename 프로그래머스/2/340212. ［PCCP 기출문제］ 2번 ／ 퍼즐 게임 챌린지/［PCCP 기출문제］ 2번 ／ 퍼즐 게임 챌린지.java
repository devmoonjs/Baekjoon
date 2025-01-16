import java.util.*;

class Solution {
    
    static int[] diffs;
    static int[] times;
    
    public static long calTime(int level) {
        long spentTime = 0;
        long timePrev = 0;
        
        for (int i = 0 ; i < diffs.length; i++) {
            if (level < diffs[i]) {
                spentTime += (timePrev + times[i]) * (diffs[i] - level) + times[i];
                timePrev = times[i];
                
            } else {
                spentTime += times[i];
                timePrev = times[i];
            }
        }
        
        return spentTime;
    }
    
    public int solution(int[] diffs, int[] times, long limit) {
        this.diffs = diffs;
        this.times = times;
        
        int left = Arrays.stream(diffs).min().orElseThrow();
        int right = Arrays.stream(diffs).max().orElseThrow();
        
        int mid = 0;
        
        ArrayList<Integer> answers = new ArrayList<>();
        
        int diffsLen = diffs.length;
        
        while (left <= right) {
            mid = (left + right) / 2;
            long spentTime = calTime(mid);
            
            if (spentTime > limit) {
                left = mid + 1;
                
            } else {
                right = mid - 1;
                answers.add(mid);
            }
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (Integer ans : answers) {
            answer = Math.min(ans, answer);
        }
        
        return answer;
    }
}