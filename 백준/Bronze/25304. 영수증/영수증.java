import java.util.Scanner;

class Price {
	
	Scanner scan = new Scanner(System.in);
	int X;
	int N;
	int a;
	int b;
	int R;
	
	int Gop(int a, int b) {
		return a*b;
	}
	
	void Result() {
		X = scan.nextInt();
		N = scan.nextInt();
		
		for (int i=0; i<N; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			R = R + Gop(a,b);
		}
		if (R == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}


public class Main {

	public static void main(String[] args){
		Price p = new Price();
		p.Result();
	}
		
}