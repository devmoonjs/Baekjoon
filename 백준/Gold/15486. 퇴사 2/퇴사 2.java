import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N+1][2];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
            arr[i][0] = day;
            arr[i][1] = pay;
        }

        int[] dp = new int[N+2];

        for (int i = 1; i <= N; i++) {
            int nowDay = arr[i][0];
            int nowPay = arr[i][1];

            if (nowDay + i <= N+1) {
                dp[nowDay + i] = Math.max(dp[nowDay + i], dp[i] + nowPay);
            }
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }
        
        System.out.println(dp[N+1]);
    }
}