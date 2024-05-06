import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            Queue<Integer> result = new LinkedList<>();
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= N; i++) {
                queue.add(i);
            }

            int cnt = 1;
            while (!queue.isEmpty()) {
                if (cnt < K) {
                    int temp = queue.poll();
                    queue.add(temp);
                    cnt++;

                } else if (cnt == K) {
                    cnt = 1;
                    result.add(queue.poll());
                } else if (queue.size() < K) {
                    result.add(queue.poll());
                }
            }
            System.out.print("<");
            for (int i = 0; i < N; i++) {
                System.out.print(result.poll());
                if (!result.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println(">");
        }
    }