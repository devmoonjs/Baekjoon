import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int V = scan.nextInt();
		int count = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if(V == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
		
}



