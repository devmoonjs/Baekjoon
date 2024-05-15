import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static Queue<Integer> q;
	static boolean[] visited;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		q = new LinkedList<Integer>();
		visited = new boolean[100001];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		if (s == e) {
			System.out.println(0);
			return;
		}
		
		// BFS
		q.add(s);
		visited[s] = true;
		BFS(e);
	}
	
	private static void BFS(int e) {
		while(!q.isEmpty()) {
			count++;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int x = q.poll();
				visited[x] = true;
				
				if (x-1 == e || x+1 == e || x*2 == e) {
					System.out.println(count);
					return;
				}
				if (x-1 >= 0 && !visited[x-1]) {
					visited[x-1] = true;
					q.add(x-1);
				}
				if (x+1 <= 100000 && !visited[x+1]) {
					visited[x+1] = true;
					q.add(x+1);
				}
				if (x*2 <= 100000 && !visited[x*2]) {
					visited[x*2] = true;
					q.add(x*2);
				}
			}
			
		}
	}
}