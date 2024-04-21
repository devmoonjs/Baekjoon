import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;

        for (int k = 0; k < arr.length; k++) {
            int i = 0;
            int j = N-1;

            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    j--;
                } else if (arr[i] + arr[j] < arr[k]) {
                    i++;
                } else {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
