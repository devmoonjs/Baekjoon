import java.io.*;
import java.util.*;

/*
    i ~ j 번째 수까지 합을 구하는 프로그램
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수의 개수
        int M = Integer.parseInt(st.nextToken()); // 케이스 수
        long[] numbers = new long[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < N + 1; i++) {
            numbers[i] = numbers[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int testCase = 0; testCase < M; testCase++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(numbers[j] - numbers[i-1]);
        }
    }
}