class Solution {
    public String solution(String s) {
        int sLen = s.length();
        int mid = 0;
        String result = "";
        
        if (sLen % 2 != 0) {
            mid = sLen / 2 + 1;
            result = String.valueOf(s.charAt(mid-1));
        } else {
            mid = sLen / 2 - 1;
            result = s.substring(mid, mid+2);
        }
        return result;
    }
}