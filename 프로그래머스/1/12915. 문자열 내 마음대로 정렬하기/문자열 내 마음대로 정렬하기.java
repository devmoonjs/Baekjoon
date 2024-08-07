// Map<String, Character> 이용해서 char 값을 통해 비교, (오름차순)
// 값이 같은 char 형이 존재한다면, 단어 그 자체끼리 정렬
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        // 각 문자열을 n번째 문자를 키로 하여 Map에 저장
        Map<String, Character> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.charAt(n));
        }

        // Map의 키셋을 리스트로 변환
        List<String> list = new ArrayList<>(map.keySet());

        // 리스트 정렬
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자를 비교하여 정렬
                char char1 = map.get(s1);
                char char2 = map.get(s2);
                
                if (char1 == char2) {
                    // n번째 문자가 같으면 사전순으로 정렬 (양수가 리턴)
                    return s1.compareTo(s2);
                } else {
                    // n번째 문자를 기준으로 정렬 (양수가 나오면 그대로 / 음수가 나오면 자리 바꿈)
                    return char1 - char2;
                }
            }
        });
        
        // 정렬된 리스트를 배열로 변환하여 반환
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        
        return answer;
    }
}
