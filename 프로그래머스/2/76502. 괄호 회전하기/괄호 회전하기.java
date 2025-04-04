import java.util.*;

class Solution {
    
    static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            char top = stack.peek();
            
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            if (top == '(' && c == ')'|| top == '[' && c == ']'|| 
                top == '{' && c == '}') stack.pop();
        }
        return stack.isEmpty();
    }
    
    
    public int solution(String s) {
        int sLen = s.length();
        int cnt = 0;
        for (int i = 0; i < sLen; i++) {
            String rotated = s.substring(i) + s.substring(0,i);
            if(isValid(rotated)) {
                cnt++;
            }
        }
    
        return cnt;
    }
}