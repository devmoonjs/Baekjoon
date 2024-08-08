// a 와 b 사이의 값을 모두 더해라
// 단, a 와 b 의 대소관계는 정해지지 않음
// Math.min(a,b) 두 수의 최소 값
// Math.max(a,b) 두 수의 최대 값

class Solution {
    public long solution(int a, int b) {
        
        int x = Math.min(a,b);
        int y = Math.max(a,b);
        
        long sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }
}