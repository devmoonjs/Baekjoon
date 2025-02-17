import java.util.*;
import java.io.*;

/**
 * 주어진 수 들을 이용해서 6개 조합을 구하고, 모든 조합을 출력.
 * if (index == 6) retrun;
 * for (arr.length 만큼 반복) {
 *  
 * }
 */
public class Main {

    static int[] result;
    static int[] arr;
    static int K;
    static StringBuilder sb = new StringBuilder();;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());
            if (K == 0) break;

            arr = new int[K];
            for (int i = 0; i < K; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            result = new int[6];
            back(0,0);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
    
    private static void back(int start, int depth) {
        if (depth == 6) {
            for (int a : result) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < K; i++) {
            result[depth] = arr[i];
            back(i + 1, depth + 1);
        }
    }
}