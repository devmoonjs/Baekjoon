import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 바구니 속 공 초기화
        int[] N = new int[n];
        for (int i = 0; i < n; i++) {
            N[i] = i+1;
        }

        // 바꿀 공 입력 받고 바꾸기
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(input.readLine(), " ");

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            int temp = 0;
            temp = N[a-1];

            N[a-1] = N[b-1];
            N[b-1] = temp;

        }

        for (int indexN : N) {
            System.out.print(indexN + " ");
        }
    }
}
