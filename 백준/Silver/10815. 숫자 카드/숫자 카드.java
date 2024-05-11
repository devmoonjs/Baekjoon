import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] cardArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        cardArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] numArr = new int[M];
        for (int i = 0; i < M; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cardArr);

        for (int n : numArr) {
            sb.append(binary(n)).append(" ");
        }
        System.out.println(sb);
    }

    private static int binary(int target) {
        int left = 0;
        int right = N-1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = cardArr[mid];

            if (target > midValue) {
                left = mid + 1;
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}