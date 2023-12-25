import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(input1.nextToken());

		for (int i = 1; i < N + 1; i++) {
			for (int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}