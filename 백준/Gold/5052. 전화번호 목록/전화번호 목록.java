import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] phoneNumbers = new String[N];

            for (int i = 0; i < N; i++) {
                phoneNumbers[i] = br.readLine();
            }

            Arrays.sort(phoneNumbers);

            if (isConsistent(N, phoneNumbers)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isConsistent(int N, String[] phoneNumbers) {
        for (int i = 0; i < N - 1; i++) {
            if (phoneNumbers[i + 1].startsWith(phoneNumbers[i])) {
                return false;
            }
        }
        return true;
    }
}