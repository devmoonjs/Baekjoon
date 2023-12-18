import java.util.Scanner;

class SumAB{
	
	Scanner scan = new Scanner(System.in);
	
	int T;
	int A;
	int B;
	int sum;
	
	public int getT() {
		T = scan.nextInt();
		
		return T;
	}
	
	public void result() {
		for(int i=1; i<T+1; i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			int R = A + B;
			System.out.println("Case #"+ i +": " + A + " + " + B + " = " + R);
		}
	}
	
}

public class Main {

	public static void main(String[] args){
		SumAB a = new SumAB();
		a.getT();
		a.result();
			
	}	
}