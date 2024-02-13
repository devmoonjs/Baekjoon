import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(input.readLine(), " ");

        // 행렬 크기 입력받아 저장
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 두개의 행렬 생성
        int[][] firstArr = new int[a][b];
        int[][] secondArr = new int[a][b];

        // 첫번째 배열 저장
        for (int i = 0; i < a; i++) {
            String valueInput = input.readLine();
            StringTokenizer valueSt = new StringTokenizer(valueInput, " ");

            int tokenCount = valueSt.countTokens();

            for (int j = 0; j < tokenCount; j++) {
                int temp = Integer.parseInt(valueSt.nextToken());
                firstArr[i][j] = temp;
//                System.out.println("firstArr[" + i + "] [" + j + "]" + temp + "저장");
            }
        }

        // 두번째 배열 저장
        for (int i = 0; i < a; i++) {
            String valueInput2 = input.readLine();
            StringTokenizer valueSt2 = new StringTokenizer(valueInput2, " ");

            int tokenCount = valueSt2.countTokens();

            for (int j = 0; j < tokenCount; j++) {
                int temp = Integer.parseInt(valueSt2.nextToken());
                secondArr[i][j] = temp;
//                System.out.println("SecondArr[" + i + "] [" + j + "]" + temp + "저장");
            }
        }

        int[][] resultArr = new int[a][b];

        // 행렬 덧셈
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int x = firstArr[i][j];
                int y = secondArr[i][j];
                System.out.print(x+y + " ");
            }
            System.out.println();
        }
    }
}

