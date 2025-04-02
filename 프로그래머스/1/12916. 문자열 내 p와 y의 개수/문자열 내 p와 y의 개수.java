class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int yCnt = 0;
        int pCnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Y') yCnt++;
            if (s.charAt(i) == 'P') pCnt++;
        }
        
        if (yCnt != pCnt) return false;
        
        return true;
    }
}