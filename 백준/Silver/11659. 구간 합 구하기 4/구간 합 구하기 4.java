import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N+1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N+1; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        long result = 0;

        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            result = arr[j] - arr[i-1];
            System.out.println(result);
        }
    }
}