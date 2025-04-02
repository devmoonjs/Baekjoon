class Solution {
    public boolean solution(String s) {        
        int sLen = s.length();
        if (sLen == 4 || sLen == 6) {
            for (int i = 0; i < sLen; i++) {
                if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    continue;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}