import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] scores = {0,0,0};
        
        for (int i = 0; i < answers.length; i++) {
            if (one[i % 5] == answers[i]) scores[0]++;
            if (two[i % 8] == answers[i]) scores[1]++;
            if (three[i % 10] == answers[i]) scores[2]++;
        }
        
        int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                list.add(i+1);
            }
        }
        return list;
    }
}