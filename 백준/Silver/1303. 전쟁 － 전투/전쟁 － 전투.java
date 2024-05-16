import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int M;
	static int N;
	static int count = 0;
	static int wCount = 0;
	static int bCount = 0;
	
	
	private static void DFS(int a, int b, char color) {
		visited[a][b] = true;
		count +=1;
		
		for (int i =0; i < 4; i++) {
			int newA = a + dx[i];
			int newB = b + dy[i];
			
			if (newA >= 0 && newA < M && newB >=0 && newB < N && arr[newA][newB] == color) {
				if (!visited[newA][newB]) {
					DFS(newA, newB, arr[newA][newB]);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new char[M][N];
		visited = new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					char color = arr[i][j];
					count = 0;
					DFS(i, j, color);
					
					if (color == 'W') {
						wCount += count * count;
					}
					else {
						bCount += count * count;
					}
				}
			}
		}
		System.out.println(wCount + " " + bCount);
	}	
}