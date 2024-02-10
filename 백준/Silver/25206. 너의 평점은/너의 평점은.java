import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double numXsung = 0;
        double sumNum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine());

            String name = st.nextToken(); // 과목명
            double num = Double.parseDouble(st.nextToken()); // 학점
            String sung = st.nextToken(); // 성적
            double score = 0;

            if (!(sung.equals("P"))) {
                switch (sung) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:
                        break;
                }

                numXsung += (num * score);
                sumNum += num;

            }
        }
        System.out.println(numXsung / sumNum);
    }
}

