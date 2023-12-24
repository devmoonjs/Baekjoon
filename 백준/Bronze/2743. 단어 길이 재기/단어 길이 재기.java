import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String[] array = S.split("");
		System.out.println(array.length);
		
	}
}