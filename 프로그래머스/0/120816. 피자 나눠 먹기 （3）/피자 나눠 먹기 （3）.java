/*
    최소 1 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지
    slice -> 피자 한 판당 조각 수
    n -> 사람 수
    
    int pizzaCnt = 1;
    while(true) {
        if (pizzaCnt * slice >= n) break;
        pizzaCnt++;
    }
*/

class Solution {
    public int solution(int slice, int n) {
        int pizzaCnt = 1;
        
        while (true) {
            if (pizzaCnt * slice >= n) break;
            pizzaCnt++;
        }
        return pizzaCnt;
    }
}