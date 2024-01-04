import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        double[] score = new double[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        double max = 0;

        for(int i = 0; i<n; i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(score[i]>max){
                max = score[i];
            }
        }
        double sum = 0;

        for(int i=0; i<n; i++){
            score[i] = score[i]/max*100;
            sum += score[i];
        }
        System.out.println(sum/score.length);
    }
}
