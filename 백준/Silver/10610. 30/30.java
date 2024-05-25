import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 30;
		boolean flag = true;
		
		String N = br.readLine();
		String[] nArr = N.split("");
		
		int sum = 0;
		

		if (!N.contains("0")) {
			System.out.print("-1");
			return;
		}
		
		for (String s : nArr) {
			sum += Integer.valueOf(s);
		}
		
		if (sum % 3 != 0) {
			System.out.print("-1");
			return;
		}
		
		Arrays.sort(nArr);
		StringBuilder sb = new StringBuilder();
		
		for (int i = nArr.length-1; i >= 0; i--) {
			sb.append(nArr[i]);
		}
		
		System.out.print(sb);
		return;
	}
}
