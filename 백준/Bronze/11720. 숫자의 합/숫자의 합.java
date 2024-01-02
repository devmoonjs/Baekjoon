import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(bf.readLine());

       String[] numbers = bf.readLine().split("");

       int count = 0;

       for(String number : numbers){
           count += Integer.parseInt(number);
       }

       System.out.print(count);
    }
}


