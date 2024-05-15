import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	private static void DFS(int a) {
		visited[a] = true;
		
		for (int x : A[a]) {
			if (!visited[x]) {
				DFS(x);
			}
		}
		
	}
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for (int i = 1; i < N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			A[a].add(b);
			A[b].add(a);
		}
		int count = 0;
		
		for (int i = 1; i < N+1; i++) {
			if (!visited[i]) {
				DFS(i);
				count++;
			}
		}
		System.out.println(count);
	}
}