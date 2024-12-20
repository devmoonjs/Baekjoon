import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        // 배열의 두번째 값 -> 종료 시점을 기준으로 정렬
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] route1, int[] route2) {
                return route1[1] - route2[1];
            }
        });
        
        // 카메라 설치 위치 변수
        int cam = Integer.MIN_VALUE;
        
        // 모든 차량 정보 돌며, 카메라의 위치가 차량의 시작점보다 작다면 -> 카메라에 안나오므로
        // -> 종료 시점에 카메라 설치
        for (int[] route : routes) {
            if (cam < route[0]) {
                cam = route[1];
                answer++;
            }
        }
        return answer;
    }
}