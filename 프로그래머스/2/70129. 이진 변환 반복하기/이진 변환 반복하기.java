import java.util.*;

class Solution {
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() > 1) {
            int oneCnt = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    oneCnt++;
                } else {
                    answer[1]++;
                }
            }
            s = Integer.toBinaryString(oneCnt);
            answer[0]++;
        }

        return answer;
    }
}