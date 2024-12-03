import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> h1 = new HashMap<>();
        
        for (String p : participant) {
            if (h1.containsKey(p)) {
                Integer cnt = h1.get(p);
                h1.put(p, cnt+1);
            } else {
                h1.put(p, 1);
            }
        }
        
        for (String c : completion) {
            h1.put(c, h1.get(c) - 1);
        }
        
        String answer = "";
        
        for (String key : h1.keySet()) {
            if (h1.get(key) > 0) {
                answer = key;
            }
        }
        return answer;
    }
}