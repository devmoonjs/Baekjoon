import java.util.*;
import java.io.*;

class Solution {
    public int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            
            if (Character.isDigit(now)) {
                answer.append(now);
                
            } else {
                temp.append(now);
                
                if (map.containsKey(temp.toString())) {
                    answer.append(map.get(temp.toString()));
                    
                    temp = new StringBuilder();
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}