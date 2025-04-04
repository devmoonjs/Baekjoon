import java.util.*;

/*
    1. 내림차순 정렬
    2. while()
*/

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int peopleCnt = people.length;
        int boatCnt = 0;
        int livePeople = 0;
        int maxIndex = peopleCnt - 1;
        int minIndex = 0;
        
        while(livePeople < peopleCnt) {
            // 무조건 제일 Max 한 명 바로 탑승
            int nowWeight = people[maxIndex];
            livePeople++;
            
            // 두명 탑승 가능할 때
            if (nowWeight + people[minIndex] <= limit) {
                minIndex++;
                livePeople++;
            }
            
            maxIndex--;
            boatCnt++;
        }
        return boatCnt;
    }
}