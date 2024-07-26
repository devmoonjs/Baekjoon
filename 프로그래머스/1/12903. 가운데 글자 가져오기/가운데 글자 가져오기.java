class Solution {
    public String solution(String s) {
        int sLength = s.length();
        String answer = "";
        
        if (sLength % 2 != 0) {
            int mid = sLength / 2 + 1;
            answer = String.valueOf(s.charAt(mid-1));
        } else {
            int mid = sLength / 2 - 1;
            answer = s.substring(mid, mid+2);
        }
        
        return answer;
    }
}