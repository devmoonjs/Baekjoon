class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];
        
        for (int i = 1; i <= total; i++) {
            if (total % i == 0) {
                int a = i;
                int b = total / i;
                
                if (a >= b & (a-2) * (b-2) == yellow) {
                    answer[0] = a;
                    answer[1] = b;
                    break;
                }
            }
        }
        return answer;
    }
}