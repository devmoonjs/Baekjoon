/*
    13:49
    현재 난이도 : diff
    현재 퍼즐 소요시간 : time_cur
    이전 퍼즐 소요시간 : time_prev
    나의 숙련도 : level
    
    퍼즐 틀릴 때 -> (time_cur+time_prev) * (diff-level) + time_cur
*/

import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int left = Arrays.stream(diffs).min().orElseThrow();
        int right = Arrays.stream(diffs).max().orElseThrow();
        
        
        int mid = 0;
        
        ArrayList<Integer> answers = new ArrayList<>();
        int diffsLen = diffs.length;
        
        while (left <= right) {
            long spentTime = 0;
            mid = (left + right) / 2;
            long timePrev = 0;
            
            for (int i = 0; i < diffsLen; i++) {
                if (diffs[i] >  mid) {
                    spentTime = spentTime + times[i] + 
                        (timePrev + times[i]) * (diffs[i] - mid);
                    timePrev = times[i];
                } else {
                    spentTime += times[i];
                    timePrev = times[i];
                }
            }
            
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