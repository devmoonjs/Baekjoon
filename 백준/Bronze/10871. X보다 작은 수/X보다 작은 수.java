import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer input1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(input1.nextToken()); // 입력될 정수의 개
		int X = Integer.parseInt(input1.nextToken()); // 작은 수의 기준이 될 
		
		StringTokenizer input2 = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int count = 0;
		ArrayList B = new ArrayList();
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(input2.nextToken()); // 입력 받은 수 int 형변환 후 저장 
			if(X>A[i]) {
				B.add(A[i]);
			}
		}
		
		for(int i=0; i<B.size(); i++) {
			System.out.println(B.get(i));
		}
		
	}
		
}