import java.util.*;
import java.io.*;

class Solution {
    public String solution(int n) {
        String s = "수박";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i%2));
        }
        
        String answer = sb.toString();
        return answer;
    }
}