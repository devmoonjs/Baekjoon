import java.util.*;

class Cal{
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	public void div(){
		System.out.println(a/b);
	}
	
	public void plus() {
		System.out.println(a+b);
	}
	
	public void min() {
		System.out.println(a-b);
	}
	
	public void na() {
		System.out.println(a%b);
	}
	
	public void gop() {
		System.out.println(a*b);
	}
	
}

public class Main {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.plus();
		c.min();
		c.gop();
		c.div();
		c.na();
	}

}