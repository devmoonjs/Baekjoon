/*
    if (비어 있으면) push
    if (stack.peek()= '(' 이면) pop 하고 push
*/
import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
              stack.push(c);  
            } 
            
            else if (c == ')' && stack.peek() == '(') {
                stack.pop();
            }
            
            else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}