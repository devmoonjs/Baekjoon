import java.util.*;

class Solution {
    public int solution(String t, String p) {
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            list.add(t.substring(i,i + p.length()));    
        }
        
        int cnt = 0;
        
        for (String temp : list) {
            if (Double.parseDouble(temp) <= Double.parseDouble(p)) {
                cnt++;
            }
        }
        
        return cnt;
    }
}