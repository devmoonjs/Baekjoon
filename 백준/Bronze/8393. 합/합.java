import java.util.Scanner;

class Hap {
	
	
	int n;
	int result;

	public Hap(int n) {
		this.n = n;
	}
	
	public void hapResult() {
		for(int i =1; i<n+1; i++) {
			result += i;
		}
		System.out.println(result);
	}
}


public class Main {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Hap h = new Hap(n);
		h.hapResult();
		
		scan.close();
	}	
}