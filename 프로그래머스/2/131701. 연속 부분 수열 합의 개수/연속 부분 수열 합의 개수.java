/*
    원형 배열 -> 배열 길이 * 2
    HashSet<Integer> set = new HashSet<>();
*/
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int numberLen = elements.length;
        int[] newArr = new int[numberLen* 2];
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numberLen; i++) {
            newArr[i] = newArr[i+numberLen] = elements[i];
        }
        
        for (int i = 1; i <= numberLen; i++) {
            for (int j = 0; j < numberLen; j++) {
                int sum = Arrays.stream(newArr, j, j + i - 1).sum();
                set.add(sum);
            }
        }
        return set.size();
    }
}