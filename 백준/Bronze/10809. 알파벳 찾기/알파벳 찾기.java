import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();

        int wordLength = word.length();
        int[] wordArr = new int[wordLength];

        // 알파벳 배열 -1 초기화
        int[] english = new int[26];
        for (int i = 0; i < 26; i++) {
            english[i] = -1;
        }

        // 입력 받은 문자 위치 알아내기
        for (int i = 0; i < wordLength; i++) {
            wordArr[i] = word.charAt(i) - 97;

            if (english[wordArr[i]] == -1) {
                english[wordArr[i]] = i;
            }
        }

        for (int e : english) {
            System.out.print(e + " ");
        }

    }
}