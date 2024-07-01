import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double target = Integer.parseInt(br.readLine());
		
		int answer = 2;
		int room = 1;
		
		if (answer == 1) {
			System.out.println(room);
		} else {		
			while(answer <= target) {
				answer = answer + (6*room);
				room++;
			}
		}
		System.out.println(room);
	}
}
