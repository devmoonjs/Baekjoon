// 숫자가 나오기 직전까지 sb.append()
// map.get(sb) 해서 밸류값 찾기 그리고 sb2에 담기
// 숫자가 나오면 continue;

import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
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
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { // 숫자라면
                result.append(s.charAt(i));
            } else{
                sb.append(s.charAt(i));
                if (map.containsKey(sb.toString())) {
                    result.append(map.get(sb.toString()));
                    sb = new StringBuilder();
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}