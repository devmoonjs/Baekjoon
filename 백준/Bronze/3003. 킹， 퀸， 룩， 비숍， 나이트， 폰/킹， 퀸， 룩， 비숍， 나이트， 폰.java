import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		String Answer = "1 1 2 2 2 8";
		String[] A = Answer.split(" ");
		int[] B = new int[A.length];

		int i = 0;

		for (i = 0; i < A.length; i++) {
			B[i] = Integer.parseInt(A[i]);
		}

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int End = st.countTokens();

		for (i = 0; i < End; i++) {
			B[i] = B[i] - Integer.parseInt(st.nextToken());
		}

		for (int b : B) {
			System.out.print(b);
			System.out.print(" ");
		}
	}
}
