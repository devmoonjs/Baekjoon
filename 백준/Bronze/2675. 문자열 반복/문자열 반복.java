import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int Test = Integer.parseInt(bf.readLine());

		for (int i = 0; i < Test; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			String[] Str = new String[S.length()];
			
			for(int k = 0; k<S.length(); k++) {
				Str[k] = S.substring(k, k+1);
			}
			for (String a : Str) {
				for (int j = 0; j < R; j++) {
					System.out.print(a);
				}

			}

			System.out.println("");
		}
	}
}
