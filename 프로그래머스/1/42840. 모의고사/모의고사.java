class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] correct = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (one[i%5] == answers[i]) correct[0]++;
            if (two[i%8] == answers[i]) correct[1]++;
            if (three[i%10] == answers[i]) correct[2]++;
        }
        
        int max = Math.max(correct[0], Math.max(correct[1], correct[2]));
        
        int maxCnt = 0;
        for (int c : correct) {
            if (c == max) maxCnt++;
        }
        
        int[] answer = new int[maxCnt];
        
        int j = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max) {
                answer[j] = i+1;
                j++;
            }
        }
        
        return answer;
    }
}