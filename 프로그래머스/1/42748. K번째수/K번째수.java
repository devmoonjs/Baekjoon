import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] tempArr = new int[j - i + 1];
            
            int cnt = 0;
            for (int a = i-1; a < j; a++) {
                tempArr[cnt++] = array[a];
            }
            
            Arrays.sort(tempArr);
            answer[index++] = tempArr[k-1];
        }
        return answer;
    }
}