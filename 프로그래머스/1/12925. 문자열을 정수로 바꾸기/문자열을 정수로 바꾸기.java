class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if (s.charAt(0) == '-') {
            answer = Integer.valueOf(s.substring(1)) * -1;
            return answer;
        }
        answer = Integer.valueOf(s);
        
        return answer;
    }
}