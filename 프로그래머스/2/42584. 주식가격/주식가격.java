import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> queue = new LinkedList<>();
        for (int p : prices) {
            queue.add(p);
        }
        
        int[] answer = new int[prices.length];
        int index = 0;
        
        while(!queue.isEmpty()) {
            int price = queue.poll();
            int sec = 0;
            
            for (int q : queue) {
                sec++;
                if (price > q) {
                    break;
                }
            }
            answer[index++] = sec;
        }
        return answer;
    }
}