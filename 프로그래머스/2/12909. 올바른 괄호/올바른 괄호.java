// '('는 그냥 넣음
// ')'는 이전 값 비교 -> '(' 이면 하나 빼기
// 마지막에 스택 비었는지 확인
import java.util.*;

class Solution {
    boolean solution(String s) {
        
        boolean answer;
        
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            
            if (temp.equals("(")) {
                stack.push(temp);
            }
            
            else if (!stack.isEmpty()) {
                stack.pop();
            } else {
                answer = false;
                return answer;
            }
        }
        
        if (stack.isEmpty()) {
            answer = true;
        } else answer = false;
        
        return answer;
    }
}