import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = 0;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine(), " ");

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
