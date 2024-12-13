import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[4];
        
        int answerLen = answers.length;
        for (int i = 0; i < answerLen; i++) {
            if (first[(i) % 5] == answers[i]) score[1]++;
            if (second[(i) % 8] == answers[i]) score[2]++;
            if (third[(i) % 10] == answers[i]) score[3]++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        for (int j = 1; j < 4; j++) {
            max = Math.max(max, score[j]);
        }
        
        for (int k = 1; k < 4; k++) {
            if(score[k] == max) list.add(k);
        }
        
        Collections.sort(list);
        int size = list.size();
        int[] returnArr = new int[size];
        
        for (int l = 0; l < size; l++) {
            returnArr[l] = list.get(l);
        }
        
        return returnArr;
    }
}