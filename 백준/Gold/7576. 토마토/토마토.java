import java.io.*;
import java.util.*;

/**
 * bfs 돌리고
 * check 해서 0이 존재하면 -1
 */

public class Main {

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int M;
    static int N;
    static int[][] ground;
    static boolean[][] visited;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static Queue<Point> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로

        ground = new int[N][M];
        visited = new boolean[N][M];

        // 박스 생성
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (ground[i][j] == 1 && !visited[i][j]) {
                    q.add(new Point(i,j));
                }
            }
        }

        bfs();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (ground[i][j] == 0) {
                    System.out.println("-1");
                    return;
                } else {
                    answer = Math.max(ground[i][j], answer);
                }
            }
        }
        System.out.println(answer-1);
    }

    private static void bfs() {
        while(!q.isEmpty()) {
            Point nowPoint = q.poll();
            int x = nowPoint.x;
            int y = nowPoint.y;

            for (int i = 0; i < dx.length; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (0 <= newX && newX < N && 0 <= newY && newY < M && ground[newX][newY] == 0) {
                    q.add(new Point(newX, newY));
                    ground[newX][newY] = ground[x][y] + 1;
                }
            }
        }
    }
}
