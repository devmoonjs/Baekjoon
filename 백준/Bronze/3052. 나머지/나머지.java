import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] A = new int[10];
		int[] Result = new int[10];
		
		for (int i=0; i<10; i++) {
			A[i] = Integer.parseInt(bf.readLine());
		}
		
		for (int i=0; i<10; i++) {
			Result[i] = A[i]%42;
		}
		
		Result = Arrays.stream(Result).distinct().toArray();
		int number = Result.length;
		System.out.println(number);
	}
}