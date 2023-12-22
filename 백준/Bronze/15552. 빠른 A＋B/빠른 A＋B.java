import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public Main() throws IOException {
		processInput();
	}
	
	public void processInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(input.nextToken());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<N; i++) {
			StringTokenizer input2 = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(input2.nextToken());
			int Y = Integer.parseInt(input2.nextToken());
			
			
			bw.write((X+Y) + "\n");
		}
		bw.flush();
	}	
	public static void main(String[] args) throws IOException {
		new Main();
	}
}