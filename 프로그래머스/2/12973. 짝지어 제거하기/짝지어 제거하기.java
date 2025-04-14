import java.util.*;

class Solution
{
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (Character c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.add(c);
            } else {
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) return 1;
        
        return 0;
    }
}