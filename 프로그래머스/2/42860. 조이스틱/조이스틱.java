/**
    현재 위치 : now
    모든 알파벳 -> 숫자로 변경
    누적합 -> result
    
    while(ture)
    
        1. A가 아닌 것 중, 제일 작은 수 만큼 더하기
        2. 이후 제일 가까운 곳 찾기? -> 인덱스 차이만큼 result 더하기
**/

import java.util.*;

class Solution {
    public int solution(String name) {
        int result = 0;
        int nameSize = name.length();
        int move = nameSize - 1;
        int y;
        
        for (int i = 0; i < nameSize; i++) {
            // up & down
            result += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        
            y = i + 1;
            while(y < nameSize && name.charAt(y) == 'A') {
                // y 가 아닐 때까지 이동
                y++;
            }
        
            move = Math.min(move, 
                            (Math.min(i + i + (nameSize - y), 
                                      i + (nameSize - y) + (nameSize - y))));
        }
        return result + move;
    }
}