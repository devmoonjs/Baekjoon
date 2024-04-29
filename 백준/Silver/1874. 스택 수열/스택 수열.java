import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        boolean result = true;

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(bf.readLine());
            arr[i] = temp;
        }
        StringBuffer sf = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            int su = arr[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sf.append("+\n");
                }
                stack.pop();
                sf.append("-\n");
            } else {
                int a = stack.pop();
                if (a > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sf.append("-\n");
                }
            }
        }
        if(result) System.out.println(sf.toString());
    }
}