class Solution {
    
    private static int timeToSec(String time) {
        int min = Integer.parseInt(time.substring(0,2));
        int sec = Integer.parseInt(time.substring(3,5));
        
        return min * 60 + sec;
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int videoSec = timeToSec(video_len);
        int posSec = timeToSec(pos);
        int opStart = timeToSec(op_start);
        int opEnd = timeToSec(op_end);

        for (String command : commands) {
            if (command.equals("next")) {
                if (opStart <= posSec && posSec <= opEnd) posSec = opEnd;
                
                posSec += 10;
                posSec = Math.min(posSec, videoSec);
                
                if (opStart <= posSec && posSec <= opEnd) posSec = opEnd;
            }
            
            if (command.equals("prev")) {
                if (opStart <= posSec && posSec <= opEnd) posSec = opEnd;
                posSec -= 10;
                posSec = Math.max(posSec, 0);
                if (opStart <= posSec && posSec <= opEnd) posSec = opEnd;
            }
        }
        
        int resultMin = posSec / 60;
        int resultSec = posSec % 60;
        
        StringBuilder sb = new StringBuilder();
        
        if (resultMin < 10) {
            if (resultMin == 0) {
                sb.append("00");
            } else {
                sb.append("0");
                sb.append(resultMin);
            }
        } else {
            sb.append(resultMin);
        }
        
        sb.append(":");
        
        if (resultSec < 10) {
            if (resultSec == 0) {
                sb.append("00");
            } else {
                sb.append("0");
                sb.append(resultSec);
            }
        } else {
            sb.append(resultSec);
        }
        
        return sb.toString();
    }
}