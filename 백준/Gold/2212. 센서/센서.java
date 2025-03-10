import java.util.*;
import java.io.*;

public class Main {
    public static int minSeosor(int n, int k, int[] sensors) {
        Arrays.sort(sensors);
        ArrayList<Integer> distances = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            distances.add(sensors[i] - sensors[i - 1]);
        }
        
        Collections.sort(distances);
        int result = distances.stream().mapToInt(Integer::intValue).sum();
        for (int i = 0; i < Math.min(k-1, n-1); i++) {
            result -= distances.get(distances.size()-i-1);
        }
        
        return Math.max(0, result);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  // 센서 개수
        int k = Integer.parseInt(br.readLine());  // 기지국 개수
        int[] sensors = Arrays.stream(br.readLine().split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();
        System.out.println(minSeosor(n, k, sensors));
    }
}