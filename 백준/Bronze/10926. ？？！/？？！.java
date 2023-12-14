import java.util.*;

class Id{
	
	Scanner scan = new Scanner(System.in);
	String id;
	
	Id(){
		id = scan.nextLine();
	}
	
	public void Idvalid() {
		System.out.println(id+"??!");
	}
}

public class Main {
	public static void main(String[] args) {
		Id c = new Id();
		c.Idvalid();
	}

}
