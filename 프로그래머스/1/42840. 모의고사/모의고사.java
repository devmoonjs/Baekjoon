import java.util.*;
import java.io.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] results = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (one[i % 5] == answers[i]) results[0]++;
            if (two[i % 8] == answers[i]) results[1]++;
            if (three[i % 10] == answers[i]) results[2]++;
        }
        
        int max = Math.max(Math.max(results[0],results[1]), results[2]);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i =0; i < results.length; i++) {
            if (results[i] == max) list.add(i+1);
        }
        return list;
    }
}