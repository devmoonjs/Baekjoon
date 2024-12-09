import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            q.add(i + 1);
        }
        
        Queue<Integer> answer = new LinkedList<>();
        int cnt = 1;
        
        while(!q.isEmpty()) {
            if (cnt < K) {
                q.add(q.poll());
                cnt++;
            }
            
            else if (cnt == K) {
                answer.add(q.poll());
                cnt = 1;
            }
        }
        
        System.out.print("<");
        while(!answer.isEmpty()) {
            if (answer.size() > 1) {
                System.out.print(answer.poll() + ", ");
            }
            
            else if (answer.size() == 1) {
                System.out.print(answer.poll() + ">");
            }
        }
    }
}