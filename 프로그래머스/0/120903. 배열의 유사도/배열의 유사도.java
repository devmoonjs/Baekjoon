import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s2));
        
        for (String target : s1) {
            if (list.contains(target)) answer++;
        }
        
        return answer;
    }
}