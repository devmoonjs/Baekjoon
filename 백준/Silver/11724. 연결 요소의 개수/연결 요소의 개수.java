import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static Queue<Integer> q = new LinkedList<Integer>();
	
	private static void DFS(int a) {
		visited[a] = true;
		
		for (int x : A[a]) {
			if (!visited[x]) {
				DFS(x);
			}
		}
		
	}
	
	private static void BFS(int a) {
		visited[a] = true;
		q.add(a);
		
		while(!q.isEmpty()) {
			int b = q.poll();
			
			for (int x : A[b]) {
				if (!visited[x]) {
					visited[x] = true;
					q.add(x);
				}
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
				BFS(i);
				count++;
			}
		}
		System.out.println(count);
	}
}