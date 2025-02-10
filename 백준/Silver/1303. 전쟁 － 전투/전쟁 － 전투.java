import java.util.*;
import java.io.*;

public class Main {

    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N;
    static int M;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 가로
        M = Integer.parseInt(st.nextToken()); // 세로

        arr = new String[M][N];
        visited = new boolean[M][N];
    
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }

        int wSum = 0;
        int bSum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    cnt = 0;

                    if (arr[i][j].equals("W")) {
                        dfs(new Point(i,j), "W");
                        wSum += cnt * cnt;
                    } else {
                        dfs(new Point(i, j), "B");
                        bSum += cnt * cnt;

                    }
                }
            }
        }
        System.out.println(wSum);
        System.out.println(bSum);
    }

    static void dfs(Point point, String color) {
        int x = point.x;
        int y = point.y;
        visited[x][y] = true;
        cnt++;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (0 <= newX && newX < M && 0 <= newY && newY < N) {
                if (arr[newX][newY].equals(color) && !visited[newX][newY]) {
                    dfs(new Point(newX, newY), color);
                }
            }
        }

    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}