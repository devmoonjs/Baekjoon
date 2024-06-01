import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String newS = s.toUpperCase();
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < newS.length(); i++) {
            if (newS.charAt(i) == 80) {
                p++;
            }
            
            if (newS.charAt(i) == 89) {
                y++;
            }
        }
        
        if (p != y) {
            answer = false;
        }
        
        return answer;
    }
}