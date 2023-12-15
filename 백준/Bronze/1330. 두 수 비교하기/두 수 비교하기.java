import java.util.*;

class Baek{
	Scanner scan = new Scanner(System.in);
	int A;
	int B;
	
	Baek(){
		A = scan.nextInt();
		B = scan.nextInt();
	}
	
	public void Compare() {
		if (A>B) {
			System.out.println(">");
		} else if (A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}


public class Main {
	public static void main(String[] args) {
		Baek b = new Baek();
		b.Compare();
	}
}
