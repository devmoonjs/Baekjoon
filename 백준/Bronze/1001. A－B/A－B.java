import java.util.*;

class sum{
	
	Scanner scan = new Scanner(System.in);
	
	int left;
	int right;
	int result;
	
	public void resultmin(){
		left = scan.nextInt();
		right = scan.nextInt();
		result = left - right;
	}
	
	public int getResult() {
		return result;
	}
}


public class Main {

	public static void main(String[] args) {
		sum s = new sum();
		s.resultmin();
		System.out.println(s.getResult());
	}

}
