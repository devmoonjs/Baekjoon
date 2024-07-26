// 정렬을 하지 않는다!
// 베열의 순서는 유지

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) return new int[]{-1};
        
        int min = arr[0];
        
        for (int a : arr) {
            if (a < min) min = a;
        }
        
        int[] answer = new int[arr.length - 1];
        
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}