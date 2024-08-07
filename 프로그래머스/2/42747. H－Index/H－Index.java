import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 논문 인용 횟수를 오름차순으로 정렬
        int n = citations.length;

        // 논문의 인용 횟수를 내림차순으로 계산하여 h-index를 찾습니다.
        for (int i = 0; i < n; i++) {
            int h = n - i; // 남은 논문의 수
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0; // 모든 조건을 만족하지 못하면 0을 반환
    }
}
