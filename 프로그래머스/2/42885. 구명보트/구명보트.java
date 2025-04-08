/*
    최대 2명 탑승 가능
    limit 의 제한 존재
    큰 거 먼저 탑승, boat++; maxIndex; livePerson++;
    / if (가능하다면) 제일 작은 사람 탑승, minIndex;, livePerson++;
    
    int peopleLen = people.length()
    int maxIndex = peopleLen - 1;
    int minIndex = 0;
    while(livePerson < people.length()) {
        int nowPerson = people[maxIndex--];
        boat++;
        livePerson++;
        
        if (nowPerson + people[minIndex] <= limit) {
            minIndex++;
            livePerson++;
        }
    }
*/
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int peopleLen = people.length;
        int maxIndex = peopleLen - 1;
        int minIndex = 0;
        int livePerson = 0;
        int boat = 0;
        
        Arrays.sort(people);
        
        while(livePerson < peopleLen) {
            int nowPerson = people[maxIndex--];
            boat++;
            livePerson++;
            
            if (nowPerson + people[minIndex] <= limit) {
                minIndex++;
                livePerson++;
            }
        }
        return boat;
    }
}