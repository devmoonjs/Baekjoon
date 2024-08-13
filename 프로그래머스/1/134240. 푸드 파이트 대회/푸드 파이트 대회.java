import java.util.*;

class Solution {
    public String solution(int[] food) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int r = food[i] / 2;
            for (int j = 0; j < r; j++) {
                stack.push(i);
                sb.append(i);
            }
        }
        sb.append(0);
        
        while(!stack.isEmpty()) {
            String str = stack.pop().toString();
            sb.append(str);
        }
        return sb.toString();
        
    }
}