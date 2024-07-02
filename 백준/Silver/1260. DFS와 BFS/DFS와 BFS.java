import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] arr;
	static int N;
	static boolean[] visited;
	static StringBuilder sb;
	
	private static void dfs(int index) {
		visited[index] = true;
		sb.append(index).append(" ");
		
		for (int i = 1; i < N+1; i++) {
			if (arr[index][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int index) {
		Queue<Integer> q = new LinkedList<>();
		q.add(index);
		visited[index] = true;
		
		while (!q.isEmpty()) {
			int temp = q.poll();
			sb.append(temp).append(" ");
			for (int i = 1; i < N+1; i++) {
				if (arr[temp][i] == 1 && visited[i] == false) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		sb = new StringBuilder();
		visited = new boolean[N+1];
		dfs(V);
		System.out.println(sb);
		
		sb = new StringBuilder();
		visited = new boolean[N+1];
		bfs(V);
		System.out.println(sb);
	}
}
