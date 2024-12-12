import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] numbers = new int[N];
        int[] frequency = new int[8001];
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
            sum += num;
            
            max = Math.max(max, num);
            min = Math.min(min, num);
            
            frequency[num + 4000]++;
        }
        
        int mean = (int) Math.round((double) sum / N);
        
        Arrays.sort(numbers);
        int median = numbers[N/2];
        
        int mode = Integer.MIN_VALUE;
        int maxFrequency = 0;
        boolean isSecond = false;
        
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mode = i - 4000;
                isSecond = true;
            } else if (frequency[i] == maxFrequency && isSecond) {
                mode = i - 4000;
                isSecond = false;
            }
        }
        int range = max - min;
        
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}