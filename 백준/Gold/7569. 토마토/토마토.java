import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int beforeCnt = 0;
    static int afterCnt = 0;

    static int N;
    static int M;
    static int H;
    static int[][][] box;

    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};

    static Queue<Tomato> q = new LinkedList<>();

    static class Tomato {
        int x;
        int y;
        int z;
        int day;

        public Tomato(int x, int y, int z, int day) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[H][N][M];
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < M; m++) {
                    box[h][n][m] = Integer.parseInt(st.nextToken());
                    if (box[h][n][m] == 1) {
                        q.add(new Tomato(m, n, h, 0));  // 익은 토마토 위치와 처음 일수인 0
                    }
                }
            }
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        int day = 0;

        while (!q.isEmpty()) {
            Tomato t = q.poll();
            day = t.day;

            for (int i = 0; i < 6; i++) {
                int newX = t.x + dx[i];
                int newY = t.y + dy[i];
                int newZ = t.z + dz[i];

                if (0 <= newX && newX < M && 0 <= newY && newY < N && 0 <= newZ && newZ < H) {
                    if (box[newZ][newY][newX] == 0) {
                        box[newZ][newY][newX] = 1;  // 토마토 익히기
                        q.add(new Tomato(newX, newY, newZ, day + 1));
                    }
                }
            }
        }

        // 모든 토마토가 익었는지 확인
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if (box[h][n][m] == 0) {
                        return -1;  // 익지 않은 토마토가 남아있으면 -1 반환
                    }
                }
            }
        }

        return day;  // 모든 토마토가 익었을 때 걸린 일수 반환
    }
}