import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine(), " ");

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        long result = 0;
        int idx = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int num = 0;
            if (c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 'A' + 10;
            }
            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}