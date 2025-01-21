/*
    원형 배열
    1개씩 더할 떄, -> 5번 j ~ i+j
    2개씩 더할 때, -> 5번
    3개씩 더할 때, -> 5번
    4개씩 더할 때, -> 5번
    5개씩 더할 때, -> 5번

*/
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int eleLen = elements.length;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 1; i <= eleLen; i++) {
            for (int j = 0; j < eleLen; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % eleLen];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}