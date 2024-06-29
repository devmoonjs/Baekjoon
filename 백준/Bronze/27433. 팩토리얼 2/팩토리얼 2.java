import java.io.*;
import java.util.*;

public class Main {
	
	private static long p(int index) {
		if (index == 0) {
			return 1;
		} 
		return index * (p(index-1));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long result = p(N);
	
		System.out.println(result);
	}
}
