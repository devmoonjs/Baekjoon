import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int[] number = new int[N];

		for (int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st2.nextToken());
		}

		int max = number[0];
		int min = number[0];

		for (int i = 0; i < N; i++) {
			if (number[i] < min) {
				min = number[i];
			}
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}