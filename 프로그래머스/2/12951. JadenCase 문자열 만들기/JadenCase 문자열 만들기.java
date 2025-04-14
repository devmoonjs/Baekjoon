import java.util.*;

class Solution {
    public String solution(String s) {
        boolean isFirstCase = true;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(" ");
                isFirstCase = true;
                continue;
            }
            
            if (isFirstCase && Character.isDigit(c) == false) {
                isFirstCase = false;
                sb.append(Character.toUpperCase(c));
                
            } else {
                isFirstCase = false;
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}