import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] a = st.nextToken().toCharArray();
        char[] b = st.nextToken().toCharArray();

        int[] a_int = new int[a.length];
        int[] b_int = new int[a.length];

        for(int i = 0; i<a.length; i++){
            a_int[i] = Character.getNumericValue(a[i]);
            b_int[i] = Character.getNumericValue(b[i]);
        }

        int x = 100*a_int[2] + 10*a_int[1] + a_int[0];
        int y = 100*b_int[2] + 10*b_int[1] + b_int[0];

        if (x>y){
            System.out.println(x);
        } else {
            System.out.println(y);
        }

    }

}
