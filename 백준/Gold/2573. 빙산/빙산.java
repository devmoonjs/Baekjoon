import java.util.*;
import java.io.*;

public class Main {
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static boolean[][] visited;
	static int[][] arr;
	static int[][] melt;
	static int n;
	static int m;
	
	
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX >= 0 && newX < n && newY >= 0 && newY < m && arr[newX][newY] != 0) {
				if (!visited[newX][newY]) {
					dfs(newX, newY);
				}
			}
		}
	}
	
	private static void detect(int x, int y) {
		
		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX >= 0 && newX < n && newY >= 0 && newY < m && arr[newX][newY] == 0) {
				melt[x][y]++;
			}
		}
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		n = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());
		
		arr = new int[n][m];
		
		melt = new int[n][m];
		
		for (int i = 0; i < n; i++) { 
			st = new StringTokenizer(bf.readLine(), " ");
			
			for (int j = 0; j < m; j++) { // 배열 만들기
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		
		int year = 0;
		
		while(true) {
			visited = new boolean[n][m];
			melt = new int[n][m];
			
			for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] != 0) {
                        detect(i, j);
                    }
                }
            }
			
			// 녹는 과정 반영
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Math.max(0, arr[i][j] - melt[i][j]);
                }
            }
            
            visited = new boolean[n][m];
            int dfsCnt = 0;
            
            // 덩어리 세기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] != 0 && !visited[i][j]) {
                        dfs(i, j);
                        dfsCnt++;
                    }
                }
            }
			
            year++;
            
			if (dfsCnt >= 2) {
				System.out.println(year);
				return;
			} 
			
			if (dfsCnt == 0) {
				System.out.println(0);
				return;
			}
		}
		
	}

}
