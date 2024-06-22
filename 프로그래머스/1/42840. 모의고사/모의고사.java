// 8:18 ~ 8:50
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] result = new int[3];
        
        int cnt = 0;
        for (int a : answers) {
            if (one[cnt % 5] == a) result[0]++;
            if (two[cnt % 8] == a) result[1]++;
            if (three[cnt % 10] == a) result[2]++;
            cnt++;
        }
        
        int max = Math.max(Math.max(result[0], result[1]), result[2]);
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == max) list.add(i+1);
        }
        return list;
    }
}