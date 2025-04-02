import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int a : arr) {
            if (a % divisor == 0) {
                q.add(a);
            }
        }
        
        if (q.isEmpty()) {
            int[] result = {-1};
            return result;
        }
        
        int qSize = q.size();
        int[] result = new int[qSize];
        
        for (int i = 0; i < qSize; i++) {
            result[i] = q.poll();
        }
        
        return result;
    }
}