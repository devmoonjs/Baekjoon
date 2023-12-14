import java.util.*;

class Baek{
	
	Scanner scan = new Scanner(System.in);
	
	long A;
	long B;
	long C;
	
	Baek(){
		A = scan.nextLong();
		B = scan.nextLong();
		C = scan.nextLong();
	}
	
	public void Sum() {
		System.out.println(A+B+C);
	}
}


public class Main {
	public static void main(String[] args) {
		Baek c = new Baek();
		c.Sum();
	}
}
