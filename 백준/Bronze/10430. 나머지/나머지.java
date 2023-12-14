import java.util.*;

class Baek{
	
	Scanner scan = new Scanner(System.in);
	int A;
	int B;
	int C;
	
	Baek(){
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
	}
	
	public void First() {
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
	}
}


public class Main {
	public static void main(String[] args) {
		Baek c = new Baek();
		c.First();
	}
}
