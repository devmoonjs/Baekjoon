import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            boolean result = true;
            String ps = br.readLine();
            Stack stack = new Stack();
            for (int i = 0; i < ps.length(); i++) {
                String temp = String.valueOf(ps.charAt(i));

                if (temp.equals("(")) {
                    stack.add(temp);

                } else if (temp.equals(")")) {
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!result || !stack.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
