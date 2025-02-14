import java.io.*;
import java.util.*;

public class Main {

    static int min;
    static int max;
    static int N;
    static int[] key;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        key = new int[4];

        st = new StringTokenizer(br.readLine());
        for (int i =0; i < key.length; i++) {
            key[i] = Integer.parseInt(st.nextToken());
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int num, int idx) {
        if (idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (key[i] > 0) {
                key[i]--;

                switch (i) {
                    case 0: dfs(num + arr[idx], idx + 1); break;
                    case 1: dfs(num - arr[idx], idx + 1); break;
                    case 2: dfs(num * arr[idx], idx + 1); break;
                    case 3: dfs(num / arr[idx], idx + 1); break;
                
                }

                key[i]++;
            }
        }
    }
}