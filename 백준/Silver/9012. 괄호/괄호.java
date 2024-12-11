import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0) {
            Stack<Character> stack = new Stack();
            String question = br.readLine();
            int len = question.length();
            boolean isValid = true;


            for (int i = 0; i < len; i++) {
                char now = question.charAt(i);
                // 스택이 비어있거나, 넣을 값이 ( 라면
                if (stack.isEmpty() || now == '(' ) {

                    // 넣고 다음으로
                    stack.push(now);
                    continue;
                }

                // 넣을 값이 ) 이고, 직전 값이 ( 라면,
                if (now == ')' && stack.peek() == '(') {

                    // 직전 것 제거
                    stack.pop();
                } else {
                    isValid = false;
                    break;
                }
            }

            if (!stack.isEmpty() || !isValid) {
                System.out.println("NO");

            } else {
                System.out.println("YES");
            }
        }
    }
}