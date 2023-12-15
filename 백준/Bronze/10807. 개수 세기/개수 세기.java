import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int array[] = new int[n];
		int count = 0;
		
		for (int i = 0; i<n; i++) {
			array[i] = scan.nextInt();
		} 
		int v = scan.nextInt();
		
		for(int j = 0; j<n; j++) {
			if (array[j] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}
