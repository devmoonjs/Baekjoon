/**
 * 오른쪽 or 아래 사탕과 스왑
 * 행 열 가장 긴 길이 체크
 * 다시 스왑
 */
import java.util.*;
import java.io.*;

public class Main {

    static char[][] board;
    static int N;
    static int maxCandyCnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];

        // 보드 생성
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        maxCandyCnt = 0;
        
        // 오른쪽 사탕과 변경
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                swap(i,j,i,j+1);
                checkMaxCandy();
                swap(i,j+1,i,j);
            }
        }

        // 아래 사탕과 변경
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                swap(j,i,j+1,i);
                checkMaxCandy();
                swap(j+1,i,j,i);
            }
        }

        System.out.println(maxCandyCnt);
    }

    private static void swap(int a, int b, int c, int d) {
        char temp = board[a][b];
        board[a][b] = board[c][d];
        board[c][d] = temp;
    }

    private static void checkMaxCandy() {
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N-1; j++) {
                if (board[i][j] == board[i][j+1]) {
                    cnt++;
                    maxCandyCnt = Math.max(cnt, maxCandyCnt);
                } else {
                    cnt = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N-1; j++) {
                if (board[j][i] == board[j+1][i]) {
                    cnt++;
                    maxCandyCnt = Math.max(cnt, maxCandyCnt);
                } else {
                    cnt = 1;
                }
            }
        }
    }
}
