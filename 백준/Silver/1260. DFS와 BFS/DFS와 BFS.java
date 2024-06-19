import java.util.*;
import java.io.*;

public class Main {
	
	static boolean[] visited;
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	static StringBuilder sb2 = new StringBuilder();
	
	private static void dfs(int i) {
		visited[i] = true;
		sb.append(i).append(" ");
		
		for (int j = 1; j < arr[i].length; j++) {
			if (!visited[j] & arr[i][j] == 1) {
				dfs(j);
			}
		}
	}
	
	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		q.add(i);
		visited[i] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			sb2.append(temp).append(" ");
			
			for (int j = 1; j < arr[temp].length; j++) {
				if (arr[temp][j] != 0 && !visited[j]) {
					visited[j] = true;
					q.add(j);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(v);
		System.out.println(sb);
		
		Arrays.fill(visited, false);
		bfs(v);
		System.out.println(sb2);
	}

}
