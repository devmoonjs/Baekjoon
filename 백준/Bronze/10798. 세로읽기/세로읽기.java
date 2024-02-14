import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        char[][] words = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = input.readLine();
            for (int j = 0; j < s.length(); j++) {
                words[i][j] = s.charAt(j);
            }
        }

        for (int k = 0; k < words[0].length; k++) {
            for (int l = 0; l < 5; l++) {
                if (words[l][k] == '\u0000') {
                    continue;
                }
                System.out.print(words[l][k]);
            }
        }
    }
}