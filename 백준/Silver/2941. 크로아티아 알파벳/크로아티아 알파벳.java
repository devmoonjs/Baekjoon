import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 단어
        String word = input.readLine();

        // 단어의 길이 저장
        int wordLength = word.length();
        int count = 0;

        for (int i = 0; i < wordLength; i++) {

            // 임시 저장할 알파벳 변수
            char charTemp = word.charAt(i);

            if (charTemp == 'c') {
                if (i < wordLength - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    } else if (word.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }

//            else if (charTemp == 'd') {
//                if (i < wordLength - 2) {
//                    if (word.charAt(i + 1) == 'z') {
//                        if (word.charAt(i + 2) == '=') {
//                            i += 2;
//                        }
//                    }
//                }
//
//                else if (i < wordLength -1) {
//                    if (word.charAt(i + 1) == '-') {
//                        i++;
//                    }
//                }
//            }


            else if (charTemp == 'd') {
                if (i < wordLength - 1) {
                    if (word.charAt(i + 1) == 'z') {
                        if (i < wordLength -2) {
                            if (word.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (word.charAt(i + 1) == '-') {
                        i++;
                    }

                }

            } else if (charTemp == 'l') {
                if (i < wordLength - 1) {
                    if (word.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (charTemp == 'n') {
                if (i < wordLength - 1) {
                    if (word.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (charTemp == 's') {
                if (i < wordLength - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (charTemp == 'z') {
                if (i < wordLength - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            count++;
        }
        System.out.println(count);
    }
}

