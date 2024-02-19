import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // 색종이 개수
        int n = Integer.parseInt(input.readLine());
        boolean[][] arr = new boolean[100][100];
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine(), " ");
            int column = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());

            for (int j = row; j < row + 10; j++) {
                for (int k = column; k < column + 10; k++) {
                    if (arr[j][k] != true) {
                        arr[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}