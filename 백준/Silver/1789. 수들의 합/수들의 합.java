import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * (n*n + n) / 2
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        
        long i = 1;
        long sum = 0;

        while (sum + i <= S) {
            sum += i;
            i++;
        }
        System.out.println(i-1);
    }
}
