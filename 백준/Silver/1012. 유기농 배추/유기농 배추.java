import java.util.*;
import java.io.*;

public class Main {
	
	static int[][] arr;
	static boolean[][] v;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n;
	static int m;
	
	private static void dfs(int x, int y) {
		v[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
				if (arr[newX][newY] != 0 && !v[newX][newY]) {
					dfs(newX, newY);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			arr = new int[m][n];
			v = new boolean[m][n];
			
			// 그래프 생성
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
	
				arr[a][b] = 1;
			}
			
			int dfsCnt = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] != 0 && !v[i][j]) {
						dfs(i,j);
						dfsCnt++;
					}
				}
			}
			System.out.println(dfsCnt);
		}
	}
}
