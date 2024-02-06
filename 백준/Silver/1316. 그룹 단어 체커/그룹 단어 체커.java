import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        int n = Integer.parseInt(input.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isGroupWord(input.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26]; // 알파벳이 존재하는지 여부를 저장
        char prevChar = '\0';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int index = currentChar - 'a'; // 현재 문자에 대한 인덱스 아스키 코드 값(소문자)

            //
            if (seen[index] && prevChar != currentChar) {
                return false;
            }

            seen[index] = true;
            prevChar = currentChar;
        }

        return true;
    }
}

