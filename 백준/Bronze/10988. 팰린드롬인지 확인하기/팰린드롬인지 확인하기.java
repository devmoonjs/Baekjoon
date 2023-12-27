import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String Input = bf.readLine();
		
		int k = Input.length()-1;
		int i = 0;
		Boolean isPalindrome = true;
		
		
		while (i<k) {
			if(!Input.substring(i,i+1).equals(Input.substring(k, k+1))) {
				isPalindrome = false;
			}
			
			i++;
			k--;

		}
		
		if(isPalindrome) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
	}
}
