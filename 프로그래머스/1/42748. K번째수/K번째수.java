import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int T = commands.length;
        int[] answer = new int[T];
        
        int cnt = 0;
        while (T-- > 0) {
            int i = commands[cnt][0]; 
            int j = commands[cnt][1];
            int k = commands[cnt][2];
            
            int[] temp = new int[j-i+1];
            int idx = 0;
            for (int a = i-1; a < j; a++) { // 새로운 배열 생성
                temp[idx] = array[a];
                idx++;
            }
            
            Arrays.sort(temp);
            answer[cnt] = temp[k-1];
            cnt++;
        }
        return answer;
    }
}