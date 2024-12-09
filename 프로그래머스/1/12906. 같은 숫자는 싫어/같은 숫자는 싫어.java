import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        int temp = -1;
        
        for (int number : arr) {
            if (q.isEmpty() || temp != number) {
                q.add(number);
                temp = number;
            }
        }
        
        int[] answer = new int[q.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}