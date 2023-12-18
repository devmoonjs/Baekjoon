import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int i = scan.nextInt();
		String[] array = S.split("");
		System.out.println(array[i-1]);
		
	}
}