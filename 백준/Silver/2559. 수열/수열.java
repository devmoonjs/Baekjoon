import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] arr = new long[N+1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N+1; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        long max = Long.MIN_VALUE;

        for (int i = K; i < N+1; i++) {
            long sum = arr[i] - arr[i-K];
            max = Math.max(sum, max);
        }
        
        System.out.println(max);
    }
}