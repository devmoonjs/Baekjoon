import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isValid(rotated)) answer++;
        }
        return answer;
    }
    
    private static boolean isValid(String rotated) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : rotated.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                
                char top = stack.peek();
                if (c == ']' &&  top == '['
                    || c == '}' && top == '{'
                    || c == ')' && top == '(') {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}