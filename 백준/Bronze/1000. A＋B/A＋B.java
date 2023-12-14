import java.util.*;

class sum{
	
	Scanner scan = new Scanner(System.in);
	
	int left;
	int right;
	int result;
	
	public void resultsum(){
		left = scan.nextInt();
		right = scan.nextInt();
		result = left + right;
	}
	
	public int getResult() {
		return result;
	}
}


public class Main {

	public static void main(String[] args) {
		sum s = new sum();
		s.resultsum();
		System.out.println(s.getResult());
	}

}