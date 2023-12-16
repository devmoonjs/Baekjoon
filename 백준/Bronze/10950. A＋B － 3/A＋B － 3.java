import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b;
		int c;
		
		for (int i = 0; i<a; i++) {
			b = scan.nextInt();
			c = scan. nextInt();
			
			System.out.println(b+c);
			
		}
		scan.close();
	}

}
