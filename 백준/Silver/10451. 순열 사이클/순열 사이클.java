import java.io.*;
import java.util.*;

/**
 * N 번 반복할 때,
 * int[] arr = new int[N+1];
 * st = ~;
 * for (int i = 1; i < N+1; i++) {
 *  int temp = Integer.parseInt(st.nextToken());
 *  arr[i] = temp;
 *  arr[temp] = i;
 * }
 * 
 */
public class Main {

    static boolean[] visited;
    static int[][] arr;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {

            N = Integer.parseInt(br.readLine());
            arr = new int[N+1][N+1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i < N+1; i++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[i][temp] = arr[temp][i] = 1;
            }
            
            int answer = 0;
            visited = new boolean[N + 1];
            for (int i = 1; i < N + 1; i++) {
                if (!visited[i]) {
                    dfs(i);
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    private static void dfs(int index) {
        visited[index] = true;
        for (int i = 1; i < N+1; i++) {
            if (arr[index][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }
}
