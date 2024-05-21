import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
		Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			String temp = String.valueOf(s.charAt(i));
			
			if (temp.equals("(")) {
				stack.push(temp);
			}
			
			if (temp.equals(")")) {
				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					answer = false;
					return answer;
				}
			}
		}
		
		if (!stack.isEmpty()) {
			answer = false;
			return answer;
		} else {
			return answer;
			
		}
	}
}