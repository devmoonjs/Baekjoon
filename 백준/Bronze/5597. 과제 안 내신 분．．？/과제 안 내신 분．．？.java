import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] Chul = new String[28];

		ArrayList<String> totalList = new ArrayList();

		for (int i = 1; i < 31; i++) {

			totalList.add(String.valueOf(i));
		}

		for (int i = 0; i < 28; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Chul[i] = st.nextToken();
		}

		for (String jechul : Chul) {
			totalList.remove(jechul);
		}

		int[] Result = new int[totalList.size()];

		for (int i = 0; i < totalList.size(); i++) {
			int Number = Integer.parseInt(totalList.get(i));
			Result[i] = Number;
		}

		for (int i = 0; i < Result.length; i++) {
			for (int j = 0; j < Result.length; j++) {
				if (Result[i] < Result[j]) {
					int temp = Result[i];
					Result[i] = Result[j];
					Result[j] = temp;
				}
			}
		}
		for (int i = 0; i< Result.length; i++) {
			System.out.println(Result[i]);
		}
	}
}