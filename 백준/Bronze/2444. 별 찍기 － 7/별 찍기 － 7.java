import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= n; i++) {
            //공백
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //별
            for (int j = 1; j <= 2 * i - 1; j++) { // 홀 수 구하는 로직
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            //공백
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //별
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
