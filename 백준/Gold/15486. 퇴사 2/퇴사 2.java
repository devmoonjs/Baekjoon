import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[][] data;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		data = new int [N+1][2];
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = Integer.parseInt(st.nextToken());
			data[i][1] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(dp());
		
	}
	
	private static int dp() {
		int[] dp = new int[N+2];
		
		for (int i = 1; i <= N; i++) {
			// 오늘 작업의 결과 반영 (상담 끝난 다음날 저장됨)
			int next = i + data[i][0];
			if (next <= N +1) {
				dp[next] = Math.max(dp[next], dp[i] + data[i][1]);
			}
			
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		return dp[N+1];
	}
}