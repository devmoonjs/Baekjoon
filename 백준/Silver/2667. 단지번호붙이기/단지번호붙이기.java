import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static void BFS(int a, int b) {
		visited[a][b] = true;
		q.add(new Point(a,b));
		
		while(!q.isEmpty()) {
			Point p = q.poll();
			for (int i = 0 ; i < 4; i++) {
				int newA = p.x + dx[i];
				int newB = p.y + dy[i];
				
				if (newA >= 0 && newA < N && newB >= 0 && newB < N) {
					if (arr[newA][newB] == 1 && !visited[newA][newB]) {
						q.add(new Point(newA, newB));
						visited[newA][newB] = true;
						houseCount++;
					}
				}
			}
		}
		houseQ.add(houseCount);
	}
	
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	static Queue<Point> q;
	static int houseCount;
	static int danjiCount;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, -1, 0, 1};
	static PriorityQueue<Integer> houseQ = new PriorityQueue<>();
	
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new boolean[N][N];
		q = new LinkedList<Point>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				int temp = str.charAt(j) - '0';
				arr[i][j] = temp;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1 && !visited[i][j]) {
					houseCount = 1;
					BFS(i,j);
					danjiCount++;
				}
			}
		}
		
		System.out.println(danjiCount);
		
		while(!houseQ.isEmpty()) {
			System.out.println(houseQ.poll());
		}
	}
}