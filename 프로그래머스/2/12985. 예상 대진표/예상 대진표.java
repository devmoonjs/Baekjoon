/*
    11:41
    다음 순서 -> 몫 + 나머지
    따라서, 몫 + 나머지가 같아질 때 종료 return
    
    while (true) {
        a = a / 2 + a % 2;
        b = b / 2 + b % 2;
        cnt++;
        if (a == b) false;
    }
    return cnt;
*/

class Solution
{
    public int solution(int n, int a, int b) {
        int answer = 0;
        
        while(true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
            
            if (a == b) break;
        }

        return answer;
    }
}