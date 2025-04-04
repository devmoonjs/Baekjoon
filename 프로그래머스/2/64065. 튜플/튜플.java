import java.util.*;
/*
    1. 길이별로 정렬
    2. 숫자만 넣을 때, 없던 숫자면 넣기
*/
class Solution {
    public List<Integer> solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] sArr = s.split("-");
        
        Arrays.sort(sArr, new Comparator<>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });
        
        List<Integer> answer = new ArrayList<>();
        for (String str : sArr) {
            String[] tempArr = str.split(",");
            
            for (int i = 0; i < tempArr.length; i++) {
                int num = Integer.parseInt(tempArr[i]);
                if (!answer.contains(num)) {
                    answer.add(num);
                }
            }
        }
        return answer;
    }
}