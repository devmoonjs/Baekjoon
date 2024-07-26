import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        List<String> speak = Arrays.asList("aya", "ye", "woo", "ma");
        for (String bab : babbling) {
            boolean valid = true;
            // 연속 발음 확인
            for (String can : speak) {
                String doubleCan = can + can;
                if (bab.contains(doubleCan)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                // 발음을 모두 제거
                for (String can : speak) {
                    bab = bab.replace(can, " ");
                } 
                // 남은 문자열이 공백인지 확인
                bab = bab.replace(" ", "");
                if (bab.isEmpty()) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}