import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String member : participant) {
            map.put(member, map.getOrDefault(member, 0) + 1);
        }
        
        for (String endMember : completion) {
            map.put(endMember, map.get(endMember) -1);
        }
        
        String answer = "";
        
        for (String resultMember : map.keySet()) {
            if (map.get(resultMember) > 0) {
                answer = resultMember;
                break;
            }
        }
        return answer;
    }
}