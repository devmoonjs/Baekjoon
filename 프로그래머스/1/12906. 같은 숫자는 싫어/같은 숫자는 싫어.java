import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        int preNum = -1;
        
        for (int a : arr) {
            if (q.isEmpty() || preNum != a) {
                q.add(a);
                preNum = a;
            }
        }
        
        int qSize = q.size();
        int[] answer = new int[qSize];
        
        for (int i = 0; i < qSize; i++) {
            answer[i] = q.poll();    
        }
        
        return answer;
    }
}