import java.util.*;

class Year{
	
	int year;
	int result;
	
	Year(){
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
	}
	
	public void PlusYear(){
		result = year - 543;
		System.out.println(result);
	}
}


public class Main {
	public static void main(String[] args) {
		Year c = new Year();
		c.PlusYear();
	}
}