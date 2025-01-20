/*
    12:16
    일단 N 번 반복해야 돼(i),
    반복할 때마다, N번 반복하며 j 의 길이만큼 더해야 돼,
        j ~ j
    
*/
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int elementsLen = elements.length;
        
        HashSet<Integer> set = new HashSet<>();
        int[] newArr = new int[elementsLen * 2];
        
        for (int i = 0; i < elementsLen; i++) {
            newArr[i] = elements[i];
            newArr[i+elementsLen] = elements[i];
        }
        
        for (int i = 1; i <= elementsLen; i++) {
            for (int j = 0; j < elementsLen; j++) {
                // j 부터 i 길이만큼 더함.
                set.add(Arrays.stream(newArr, j, j+i).sum());
            }
        }
        return set.size();
    }
}