import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int maxRows = (H + N) / (N + 1);
        int maxCols = (W + M) / (M + 1);
        
        int maxCapacity = maxRows * maxCols;
        
        System.out.println(maxCapacity);
    }
}
