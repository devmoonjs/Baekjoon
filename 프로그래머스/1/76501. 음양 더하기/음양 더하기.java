// 9:10 ~ 9:30
// 배열을 모두 돌며 absolutes[i] * signs[i] 를 구하여 sum 값에 누적합한다.

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        
        return answer;
    }
}