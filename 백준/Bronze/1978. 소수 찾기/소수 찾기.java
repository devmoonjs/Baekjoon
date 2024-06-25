import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	private static boolean isPrime(int i) {
		if(i == 1 || i == 0) return false;
		int lim = (int)Math.sqrt(i);
		
		for (int j = 2; j <= lim; j++) {
			if (i % j == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			if (isPrime(temp)) answer++;
		}
		
		System.out.println(answer);
	}

}
