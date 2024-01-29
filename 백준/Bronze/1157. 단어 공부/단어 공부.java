import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = bf.readLine();

        for(int i = 0; i < s.length(); i ++ ) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { // 소문자일 경우
                arr[s.charAt(i) - 97]++;
            } else { // 대문자일 경우
                arr[s.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';
        for(int i = 0; i < 26; i++){

            if(arr[i] > max) { // 제일 많이 카운트된 알파벳 구하기
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }

        }
        System.out.println(ch);
    }
}
