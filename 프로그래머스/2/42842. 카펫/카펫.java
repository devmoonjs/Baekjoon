// 8:53 ~ 9:23

class Solution {
    public int[] solution(int brown, int yellow) {
        int carpet = brown + yellow;
        int[] answer = new int[2];
        
        for (int i = 1; i <= carpet; i++) {
            if (carpet % i == 0) {
                int a = i;
                int b = carpet / i;
                
                if (a >= b && (a-2) * (b-2) == yellow) {
                    answer[0] = a;
                    answer[1] = b;
                }
            }
        }
        return answer;
    }
}