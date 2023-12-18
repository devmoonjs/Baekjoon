import java.util.Scanner;

class gugudan{
	Scanner scan = new Scanner(System.in);
	int N;
	int result;
	
	public gugudan() {
		N = scan.nextInt();
	}
	
	void mul (){
		for(int i=1; i<10; i++) {
			result = i * N;
			System.out.println(N + " * " + i + " = " + result);
		}
	}
}




public class Main {

	public static void main(String[] args){
		gugudan a = new gugudan();
		a.mul();
	}
		
}