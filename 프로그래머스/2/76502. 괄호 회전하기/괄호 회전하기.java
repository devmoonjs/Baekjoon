/*
    for (s 길이만큼) {
        //회전
        String rotated = s.substring(i) + s.substring(0,i);
        
        // 올바른 괄호인지 체크
        if (isValid(rotated)) {
            answer++;
        }
    }
    
    private static boolean isValid(String rotated) {
        Stack<Character> stack = new Stack<>();
        for (char c : rotated.toCharArray()) {
            if (stack이 비어있으면) stack.push(c);
            char top = stack.peek();
            if (c 가 여는 괄호 이면) stack.push(c);
            if (c 가 닫는 괄호이고 top 이 여는 괄호이면) stack.pop();
        }
        return stack.isEmpty();
    }
*/
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int sLen = s.length();
        
        for (int i = 0; i < sLen; i++) {
            String rotated = s.substring(i) + s.substring(0,i);
            if (isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }
    
    private static boolean isValid(String rotated) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : rotated.toCharArray()) {
            if (stack.isEmpty())  {
                stack.push(c);
                continue;
            }
            char top = stack.peek();
            
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            if (c == ')' && top == '(' 
               || c == '}' && top == '{'
               || c == ']' && top == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}