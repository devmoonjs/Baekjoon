import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Test = Integer.parseInt(br.readLine());
		for (int t = 0; t < Test; t++) {
			String S = br.readLine();
			String[] Str = new String[S.length()];

			for (int i = 0; i < S.length(); i++) {
				Str[i] = S.substring(i, i + 1);
			}

			System.out.print(Str[0]);
			System.out.println(Str[S.length() - 1]);
		}

	}
}
