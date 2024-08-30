import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] A;
    static boolean visited[];
    static int cntArr[];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
//        visited = new boolean[N + 1];
        cntArr = new int[N+1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
        }


        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            dfs(i);
        }

        int maxCnt = 0;
        for (int i = 1; i <= N; i++) {
            if (maxCnt < cntArr[i]) {
                maxCnt = cntArr[i];
            }
        }

        for (int i = 1; i <= N; i++) {
            if (cntArr[i] == maxCnt) {
                System.out.print(i + " ");
            }
        }
    }

    private static void dfs(int i) {
        visited[i] = true;

        for (int x : A[i]) {
            if (!visited[x]) {
                cntArr[x]++;
//                dfs(x);
                bfs(x);
            }
        }
    }

    private static void bfs(int i) {
        q.add(i);
        visited[i] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int a : A[temp]) {
                if (!visited[a]) {
                    cntArr[a]++;
                    visited[a] = true;
                    q.add(a);
                }
            }
        }
    }
}
