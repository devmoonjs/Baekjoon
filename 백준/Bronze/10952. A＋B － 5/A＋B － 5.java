import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public Main() throws IOException {
		Input();
	}
	
	public void Input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if (a == 0 && b == 0) {
			return;
		}
		
		System.out.println(a + b);
		
		while(true) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a2 = Integer.parseInt(st2.nextToken());
			int b2 = Integer.parseInt(st2.nextToken());
			
			
			if (a2 == 0 && b2 == 0) {
				break;
			}
			
			System.out.println(a2+b2);
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main();
	}
}