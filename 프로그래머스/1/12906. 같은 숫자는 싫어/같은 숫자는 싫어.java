import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        int temp = 0;
        
        for (int number : arr) {
            if (q.isEmpty()) {
                temp = number;
                q.add(number);
                continue;
            } else {
                if (temp == number) {
                    continue;
                } else {
                    q.add(number);
                    temp = number;
                }
            }
        }
        int size = q.size();
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}