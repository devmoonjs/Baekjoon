import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 누적합 -> 누적합 배열 선언
 * int[] sumArr = new int[N+1];
 * for (1 ~ N) {
 *  sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
 * }
 * 
 * int start = ~;
 * int end = ~;
 * answer = sumArr[start] - sumArr[end];
 * 
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sumArr = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }

        // TestCase
        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int answer = sumArr[end] - sumArr[start - 1];
            System.out.println(answer);
        }
    }
}