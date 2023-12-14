import java.util.*;

class Baek{
	
	Scanner scan = new Scanner(System.in);
	int firstNumber;
	String secondNumber;
	int IsecondNumber;
	
	Baek(){
		firstNumber = scan.nextInt();
        scan.nextLine(); // 버퍼 비우기 위해 추가
		secondNumber = scan.nextLine();
		
	}
	
	public void StoI() {
		String[] array = secondNumber.split("");
		IsecondNumber = Integer.parseInt(secondNumber);
		int a = firstNumber * Integer.parseInt(array[2]);
		int b = firstNumber * Integer.parseInt(array[1]);
		int c = firstNumber * Integer.parseInt(array[0]);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(firstNumber * IsecondNumber);
	}
	
}


public class Main {
	public static void main(String[] args) {
		Baek c = new Baek();
		c.StoI();
	}
}