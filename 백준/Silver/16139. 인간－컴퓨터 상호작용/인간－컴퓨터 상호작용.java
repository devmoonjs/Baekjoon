import java.io.*;
import java.util.*;

/*
    문자열 S 에서 l ~ r 까지 중 a 가 몇 번 나오는지 확인
    문자열의 길이 200_000, 질문 수 200_000
    문자열을 입력 받을 때, 누적합을 미리 구해놔야(알파벳별로)
    arr[charIndex][알파벳][개수];

*/

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        long[][] arr = new long[input.length()+1][26];

        for (int i = 1; i <= input.length(); i++) {
            int temp = input.charAt(i-1) - 'a';

            for (int j = 0; j < 26; j++) {
                arr[i][j] = arr[i - 1][j];
            }

            arr[i][temp]++;
        }

        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int mun = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            long result = arr[end+1][mun] - arr[start][mun];
            System.out.println(result);
        }
    }
}