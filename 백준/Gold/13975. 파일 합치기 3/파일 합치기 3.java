import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0) {

            PriorityQueue<Long> q = new PriorityQueue<>();

            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                q.add(Long.parseLong(st.nextToken()));
            }

            long sum = 0;

            while (q.size() >= 2) {
                long a = q.poll();
                long b = q.poll();

                sum += a + b;

                q.add(a + b);
            }
            System.out.println(sum);
        }
    }
}
