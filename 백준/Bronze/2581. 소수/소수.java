
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int min = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			if(isPrime(i)) {
				answer += i;
				min = Math.min(min, i);
			}
		}
		if (answer == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(answer);
		System.out.println(min);
	}
	
	private static boolean isPrime(int index) {
		if (index == 0 || index == 1) return false;
		int lim = (int)Math.sqrt(index);
		
		for (int i = 2; i <= lim; i++) {
			if (index % i == 0) return false;
		}
		return true;
	}

}
