import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String Input = bf.readLine();
        
        int i = Integer.parseInt(bf.readLine());
        
        String X = Input.substring(i-1,i);
        System.out.println(X);
        
    }
}
